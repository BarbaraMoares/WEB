package aula04;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletFormulario
 */
@WebServlet(name = "ServletFormularioLista", urlPatterns = { "/ServletFormularioLista" })
public class ServletFormulario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletFormulario() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head><meta charset=\"UTF-8\"><title>Formulario</title></head>");
		out.println("<body>");
		out.println("<fieldset>");
		out.println("<legend>CADASTRO</legend><br/>");
		out.println("<form action=\"http://localhost:8080/Aula/ServletListaNomeParametros\" >"
				+"<div>"
				+"<label for=\"nome\"> Nome: <br/></label>"
				+"<input type=\"text\" id=\"nome\" name=\"nome\"> <br><br>"
				+"</div>"
				+"<div>"
				+"<label for=\"sobrenome\"> Sobrenome: <br/></label>"
				+"<input type=\"text\" id=\"sobrenome\" name=\"sobrenome\"> <br><br>"
				+"</div>"
				+"<div>"
				+"<label for=\"telefone\">Telefone: <br/></label>"
				+"<input type=\"tel\" id=\"telefone\" name=\"telefone\" placeholder=\"99 99999-9999\" pattern=\"[0-9]{2} [0-9]{5}-[0-9]{4}\" maxlength=\"15\"> <br />"
				+"<small>Ex: 61 99999-9999</small><br><br>"
				+"</div>"
				+"<div>"
			    +"<label for=\"nascimento\"> Data de Nascimento: <br/> </label> "
			    +"<input type=\"date\" id=\"nascimento\" name=\"nascimento\"> <br><br>"
			    +"</div>"
			    +"<div>"
				+"<label for=\"cidade\"> Cidade: <br/></label>"
				+"<input type=\"text\" id=\"cidade\" name=\"cidade\"> <br><br>"
				+"</div>"
				+"<div>"
				+"<label for=\"UF\"> UF: <br/></label>"
				+"<input type=\"text\" id=\"UF\" name=\"UF\"> <br><br>"
				+"</div>"
			    +"<input type=\"submit\" value=\"CADASTRAR\" >"
				+"</form>");
		out.println("</fieldset>");
		out.println("</body>");
		out.println("</html>");
		out.close();
	}

}
