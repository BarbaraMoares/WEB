package aula05;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletTela2Cadastro
 */
@WebServlet("/ServletTela2Cadastro")
public class ServletTela2Cadastro extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletTela2Cadastro() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	// TODO Auto-generated method stub
    	doPost(request, response);
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	// TODO Auto-generated method stub
    	PrintWriter out = response.getWriter();
		out.write("<html>");
    	
    	out.write("<head>");
    	out.write("<title>CADASTRADO</title>");
    	out.write("</head>");
    	
    	out.write("<body>");   	
    	out.write("<h3>Cadastro Finalizado com Sucesso!</h3><br>");
    	out.write("<b>Seus dados pessoais: </b><br>");
    	out.write("Nome completo: " + request.getParameter("nome") + " " + request.getParameter("sobrenome") + "<br>");
    	out.write("Rua: " + request.getParameter("rua") + "<br>");
    	out.write("Complemento: " + request.getParameter("complemento") + "<br>");
    	out.write("Cidade: " + request.getParameter("cidade") + "<br>");
    	out.write("Estado: " + request.getParameter("estado") + "<br>");
    	out.write("CEP: " + request.getParameter("cep") + "<br><br>");
    	out.write("<b>Seus dados profissionais: </b><br>");
    	out.write("Nome empresa: " + request.getParameter("empresa") + "<br>");
    	out.write("Rua: " + request.getParameter("ruaempresa") + "<br>");
    	out.write("Complemento: " + request.getParameter("complementoempresa") + "<br>");
    	out.write("Cidade: " + request.getParameter("cidadeempresa") + "<br>");
    	out.write("Estado: " + request.getParameter("UFempresa") + "<br>");
    	out.write("CEP: " + request.getParameter("CEPempresa") + "<br>");
    	out.write("</body>");
    	
    	out.write("</html>");
    }

}
