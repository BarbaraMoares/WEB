package aula04;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletRegistro
 */
@WebServlet("/ServletRegistro")
public class ServletRegistro extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletRegistro() {
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
		out.println("<form action=\"http://localhost:8080/Aula/ServletSaudacao\" >"
				+"<div>"
				+"<label for=\"nome\"> Nome: <br/></label>"
				+"<input type=\"text\" id=\"nome\" name=\"nome\"> <br><br>"
				+"</div>"
				+"<div>"
				+"<label for=\"sobrenome\"> Sobrenome: <br/></label>"
				+"<input type=\"text\" id=\"sobrenome\" name=\"sobrenome\"> <br><br>"
				+"</div>"
			    +"<input type=\"submit\" value=\"CADASTRAR\" >"
				+"</form>");
		out.println("</fieldset>");
		out.println("</body>");
		out.println("</html>");
		out.close();
	}

}
