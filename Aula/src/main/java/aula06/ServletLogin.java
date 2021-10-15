package aula06;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ServletLogin
 */
@WebServlet("/ServletLogin")
public class ServletLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletLogin() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    public static final String USUARIO = "usuario"; 
    //nome do atributo maiusculo para identificar como static final.

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		PrintWriter out = response.getWriter();
		out.println("<html><head><title>COOKIE</title></head>");
		out.println("<body>");
		
		String nomeUsuario = request.getParameter(USUARIO);
		String senhaUsuario = request.getParameter("senha");
		
		if (autentica(nomeUsuario, senhaUsuario)) {
			HttpSession sessao = request.getSession();
			sessao.setAttribute(USUARIO, nomeUsuario);
			out.println("Bem vindo(a), " + nomeUsuario + ".");
		}else {
			out.println("Usuario ou senha invalidos.");
		}
		out.println("</body>");
		out.println("</html>");
	}

	private boolean autentica(String usuario, String senha) {
		// TODO Auto-generated method stub
		//Código de autenticação - Aqui acessa-se o banco de dados para verificar usuario e senha.
		if (!usuario.equals("") && usuario!=null && senha.equals("1234") && senha!=null) {
			return true;
		}
		return false;
	}

}
