package aula02;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletPaginaAgenda
 */
@WebServlet(name = "ServletFormulario", urlPatterns = { "/ServletFormulario" })
public class ServletPaginaAgenda extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletPaginaAgenda() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter saida = response.getWriter();
		PrintWriter out = response.getWriter();
		out.println("<html>");
		saida.write("<HEAD><meta charset=\"UTF-8\"><TITLE>Formulario</TITLE></HEAD>");
		out.println("<body>");
		out.println("<fieldset>");
		out.println("<legend>CADASTRO</legend><br/>");
		out.println("<form action=\"http://localhost:8080/Aula/ServletAgenda\" >"
				+"<div>"
				+"<label for=\"nome\"> Nome: <br/></label>"
				+"<input type=\"text\" id=\"nome\" name=\"nome\"> <br><br>"
				+"</div>"
				+"<div>"
				+"<label for=\"phone\">Telefone: <br/></label>"
				+"<input type=\"tel\" id=\"phone\" name=\"phone\" pattern=\"[0-9]{2} [0-9]{5}-[0-9]{4}\" maxlength=\"15\"> <br />"
				+"<small>Digite apenas numeros incluindo o seu DDD.</small><br><br>"
				+"</div>"
				+"<div>"
			    +"<label for=\"dia\"> Data de Nascimento: <br/> </label> "
			    +"<input type=\"date\" id=\"dia\" name=\"dia\"> <br><br>"
			    +"</div>"
			    +"<input type=\"submit\" value=\"CADASTRAR\" >"
				+"</form>");
		out.println("</fieldset>");
		out.println("</body>");
		out.println("</html>");
		saida.close();
	}
}
