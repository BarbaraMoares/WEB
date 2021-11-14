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
 * Servlet implementation class ServletLogin02
 */
@WebServlet("/ServletLogin02")
public class ServletLogin02 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletLogin02() {
        super();
        // TODO Auto-generated constructor stub
    }

    public static final String USUARIO = "usuario"; 
    //nome do atributo maiusculo para identificar como static final.
    //static permite que a variável USUARIO seja acessada pelo nome da servlet utilizando "."
    //final permite que seja uma variável constante

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
		out.println("<html><head><title>connecting</title></head>");
		out.println("<body>");
		
		String nomeUsuario = request.getParameter(USUARIO);
		String senhaUsuario = request.getParameter("senha");
		
		//Se não existir sessão, o getSession() criará uma nova. Mas usará a sessão já existente se houver uma.
		if (autentica(nomeUsuario, senhaUsuario)) {
			HttpSession sessaodois = request.getSession();
			sessaodois.setAttribute(USUARIO, nomeUsuario);
			out.println("Bem Vindo, " + nomeUsuario);
			request.getRequestDispatcher("ServletMenu").forward(request, response);
		}else {
			out.println("Usuario ou senha invalidos.");
			out.println("<a href=\"Login02.jsp\"><br>Realize o login</a>");
		}
		out.println("</body>");
		out.println("</html>");
	}

	private boolean autentica(String usuario, String senha) {
		if (usuario!=null && !usuario.equals("") && senha!=null && senha.equals("1234")) {
			return true;
		}
		return false;
	}

}