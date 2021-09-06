package aula04;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletListaNomeParametros
 */
@WebServlet("/ServletListaNomeParametros")
public class ServletListaNomeParametros extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletListaNomeParametros() {
        super();
        // TODO Auto-generated constructor stub
    }

	/** informações
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out = response.getWriter();
    	out.println("<html>");
    	
    	out.println("<head>");
    	out.println("<title>Parametros</title>");
    	out.println("</head>");
    	
    	out.println("<body>");
    	out.println("Ola! Os parametros recebidos por essa requesicao sao: <br>");
    	
    	Enumeration<String> nomesParametros = request.getParameterNames();
    	
    	while (nomesParametros.hasMoreElements()) {
			String parametro = nomesParametros.nextElement().toString();
			out.println(parametro);
			out.println("=");
			out.println(request.getParameter(parametro));
			out.println(", ");
			
		}
    	
    	out.println("</body>");
    	
    	out.println("</html>");
    	out.close();
	}

}
