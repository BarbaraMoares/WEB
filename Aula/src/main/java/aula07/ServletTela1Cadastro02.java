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
 * Servlet implementation class ServletTela1Cadastro02
 */
@WebServlet("/ServletTela1Cadastro02")
public class ServletTela1Cadastro02 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletTela1Cadastro02() {
        super();
        // TODO Auto-generated constructor stub
    }

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(request, response);
		doPost(request, response);
		
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doPost(request, response);
		PrintWriter out = response.getWriter();
		out.write("<html>");
    	
    	out.write("<head>");
    	out.write("<title>DadosProfissionais</title>");
    	out.write("</head>");
    	
    	out.write("<body>");
    	
    	HttpSession sessaodois = request.getSession(false);
    	
    	if(sessaodois == null || sessaodois.getAttribute(ServletLogin02.USUARIO) == null) {
			out.println("<a href=\"Login02.jsp\"><br>Realize o seu login para acessar esta pagina.</a>");
		}
    	else {
    		DadosPessoais dados = new DadosPessoais();
    		dados.setNome(request.getParameter("nome"));
    		dados.setSobrenome(request.getParameter("sobrenome"));
    		dados.setRua(request.getParameter("rua"));
    		dados.setComplemento(request.getParameter("complemento"));
    		dados.setCidade(request.getParameter("cidade"));
    		dados.setEstado(request.getParameter("estado"));
    		dados.setCep(request.getParameter("cep"));		
    		sessaodois.setAttribute("dadosPessoais", dados);
    		
    		out.write("<fieldset>");
    		out.write("<h3>Preencha seus Dados Profissionais</h3><br>");
    		out.write("<form action=\"ServletTela2Cadastro02\" method=\"post\">");
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
    	}
    	
    	out.write("</body>");
    	
    	out.write("</html>");
	}

}
