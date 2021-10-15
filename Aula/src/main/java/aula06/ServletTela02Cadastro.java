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
 * Servlet implementation class ServletTela02Cadastro
 */
@WebServlet("/ServletTela02Cadastro")
public class ServletTela02Cadastro extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletTela02Cadastro() {
        super();
        // TODO Auto-generated constructor stub
    }

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
    	out.write("<title>CADASTRADO</title>");
    	out.write("</head>");
    	
    	out.write("<body>");
    	
    	HttpSession sessao = request.getSession();
		String nomeUsr = (String) sessao.getAttribute("nome");
		String sobrenomeUsr = (String) sessao.getAttribute("sobrenome");
		String ruaUsr = (String) sessao.getAttribute("rua");
		String complementoUsr = (String) sessao.getAttribute("complemento");
		String cidadeUsr = (String) sessao.getAttribute("cidade");
		String estadoUsr = (String) sessao.getAttribute("estado");
		String cepUsr = (String) sessao.getAttribute("cep");
    	
    	out.write("<h3>Cadastro Finalizado com Sucesso!</h3><br>");
    	out.write("<b>Seus dados pessoais: </b><br>");
    	out.write("Nome completo: " + nomeUsr + " " + sobrenomeUsr + "<br>");
    	out.write("Rua: " + ruaUsr + "<br>");
    	out.write("Complemento: " + complementoUsr + "<br>");
    	out.write("Cidade: " + cidadeUsr + "<br>");
    	out.write("Estado: " + estadoUsr + "<br>");
    	out.write("CEP: " + cepUsr + "<br><br>");
    	out.write("<b>Seus dados profissionais: </b><br>");
    	out.write("Nome empresa: " + request.getParameter("empresa") + "<br>");
    	out.write("Rua: " + request.getParameter("ruaempresa") + "<br>");
    	out.write("Complemento: " + request.getParameter("complementoempresa") + "<br>");
    	out.write("Cidade: " + request.getParameter("cidadeempresa") + "<br>");
    	out.write("Estado: " + request.getParameter("UFempresa") + "<br>");
    	out.write("CEP: " + request.getParameter("CEPempresa") + "<br>");
    	out.write("</body>");
    	
    	out.write("</html>");
	}

}
