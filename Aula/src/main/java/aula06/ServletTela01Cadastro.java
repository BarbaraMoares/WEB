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
 * Servlet implementation class ServletTela01Cadastro
 */
@WebServlet("/ServletTela01Cadastro")
public class ServletTela01Cadastro extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletTela01Cadastro() {
        super();
        // TODO Auto-generated constructor stub
    }
    public static final String USUARIO = "nome";
    public static final String SOBRENOME = "sobrenome";
    public static final String RUA = "rua";
    public static final String COMPLEMENTO = "complemento";
    public static final String CIDADE = "cidade";
    public static final String ESTADO = "estado";
    public static final String CEP = "cep";
    
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
		out.write("<html>");
    	
    	out.write("<head>");
    	out.write("<title>DadosProfissionais</title>");
    	out.write("</head>");
    	
    	out.write("<body>");
    	
    	String nomeUser = request.getParameter(USUARIO);
    	String sobrenomeUser = request.getParameter(SOBRENOME);
    	String ruaUser = request.getParameter(RUA);
    	String complementoUser = request.getParameter(COMPLEMENTO);
    	String cidadeUser = request.getParameter(CIDADE);
    	String estadoUser = request.getParameter(ESTADO);
    	String cepUser = request.getParameter(CEP);
    	
    	HttpSession sessao = request.getSession();
		sessao.setAttribute(USUARIO, nomeUser);
		sessao.setAttribute(SOBRENOME, sobrenomeUser);
		sessao.setAttribute(RUA, ruaUser);
		sessao.setAttribute(COMPLEMENTO, complementoUser);
		sessao.setAttribute(CIDADE, cidadeUser);
		sessao.setAttribute(ESTADO, estadoUser);
		sessao.setAttribute(CEP, cepUser);
    	
    	out.write("<fieldset>");
    	out.write("<h3>Preencha seus Dados Profissionais</h3><br>");
    	out.write("<form action=\"ServletTela02Cadastro\">");   	
    	out.write("Empresa: <input type=\"text\" id=\"empresa\" name=\"empresa\"> <br><br>");
    	out.write("Endereco da Empresa<br><br>");
    	out.write("Rua: <input type=\"text\" id=\"ruaempresa\" name=\"ruaempresa\">");
    	out.write("Complemento: <input type=\"text\" id=\"complementoempresa\" name=\"complementoempresa\"> <br>");
    	out.write("Cidade: <input type=\"text\" id=\"cidadeempresa\" name=\"cidadeempresa\">");
    	out.write("UF: <input type=\"text\" id=\"UFempresa\" name=\"UFempresa\">");
    	out.write("CEP: <input type=\"text\" id=\"CEPempresa\" name=\"CEPempresa\"> <br><br>");
    	out.write("<input type=\"submit\" value=\"CONFIRMAR\" >");
    	out.write("</form>");
    	out.write("</fieldset>");
    	out.write("</body>");
    	
    	out.write("</html>");
	}

}
