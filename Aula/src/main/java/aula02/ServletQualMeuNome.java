package aula02;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletQualMeuNome
 */
@WebServlet("/ServletQualMeuNome")
public class ServletQualMeuNome extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletQualMeuNome() {
        super();
        // TODO Auto-generated constructor stub --println
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter saida = response.getWriter();
		PrintWriter out = response.getWriter();
		out.println("<html>");
		saida.write("<HEAD><TITLE>Pergunta</TITLE>");
		out.println("<body>");
		out.println("<a href=\"ServletMeuNome\">Qual o meu nome?</a>");
		out.println("</body>");
		out.println("</html>");
		saida.close();
	}

}
