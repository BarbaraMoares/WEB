package aula03;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletDataHora
 */
@WebServlet("/ServletDataHora")
public class ServletDataHora extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	//Criando e instânciando um objeto - (private é um encapsulamento)
	private SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy - hh:mm:ss");
       
    /**
     * @see HttpServlet#HttpServlet()
     *//**
     * @see HttpServlet#HttpServlet()
     */
    public ServletDataHora() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    //ctrl + space primeiro init
    @Override
    public void init() throws ServletException {
    	// TODO Auto-generated method stub
    	super.init();
    	log("ServletDataHora Iniciado às: " + format.format(new Date()));
    }
    
    //Um método service ocorre aqui no ciclo de vida do Servlet
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	// TODO Auto-generated method stub
    	//super.doGet(request, response);
    	PrintWriter out = response.getWriter();
    	out.println("<html>");
    	
    	out.println("<head>");
    	out.println("<title>DataHora</title>");
    	out.println("</head>");
    	
    	out.println("<body>");
    	out.println("Ola!<br>A data e hora atual: "
    			  + format.format(new Date()));
    	out.println("</body>");
    	
    	out.println("</html>");
    	out.close();
    	
    }
    
    @Override
    public void destroy() {
    	// TODO Auto-generated method stub
    	super.destroy();
    	log("ServletDataHora Finalizado às: " + format.format(new Date()));
    }

}
