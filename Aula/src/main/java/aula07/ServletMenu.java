package aula07;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



/**
 * Servlet implementation class ServletMenu
 */
@WebServlet("/ServletMenu")
public class ServletMenu extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletMenu() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head><title>MENU</title></head>");
		out.println("<body>");
		
		//Verificando se houve autenticação - O getSession booleano irá retornar nulo, caso não exista sessao  -> quando (false)
		HttpSession sessaodois = request.getSession(false);
		
		if(sessaodois == null || sessaodois.getAttribute(ServletLogin02.USUARIO) == null) {
			out.println("<a href=\"Login02.jsp\"><br>Realize o seu login para acessar esta pagina.</a>");
		}
		else {
			out.println("<b>Operacoes disponiveis:</b>");
			out.println("<a href=\"Cadastro02.jsp\"><br>1. Cadastre-se</a>");
		}
		
		out.println("</body>");
		out.println("</html>");
	}

}
