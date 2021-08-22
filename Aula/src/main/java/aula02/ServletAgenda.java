package aula02;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletAgenda
 */
@WebServlet(name="ServletAgenda", urlPatterns="/ServletAgenda")
public class ServletAgenda extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletAgenda() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		
		PrintWriter writer = response.getWriter();
		
		writer.println("<html>");
		writer.println("<head><title>CADASTRADO</title></head>");
		
		writer.println("<body>");
		
		writer.println("<h1>CADASTRO CONCLUIDO</h1>");
		
		String nome = request.getParameter("nome");
		String phone = request.getParameter("phone");
		String data = request.getParameter("dia");

		writer.println("<ul>"); 
		writer.println("<li>Nome: " + nome + "</li>"); 
		writer.println("<li>Telefone: " + phone + "</li>"); 
		writer.println("<li>Data de Nascimento: " + data + "</li>"); 
		writer.println("</ul>");
		
		writer.println("</body></html>");
		writer.close();
	}

}
