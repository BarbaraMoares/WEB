package aula05;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletTela1Cadastro
 */
@WebServlet(name = "ServletTela1Cadastro", urlPatterns = {"/ServletTela1Cadastro"})
public class ServletTela1Cadastro extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletTela1Cadastro() {
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
    	out.write("<fieldset>");
    	out.write("<h3>Preencha seus Dados Profissionais</h3><br>");
    	out.write("<form action=\"ServletTela2Cadastro\">");
    	
    	out.write("<input type=\"hidden\" name=\"nome\" value=\"");
    	out.write(request.getParameter("nome") + "\">");
    	out.write("<input type=\"hidden\" name=\"sobrenome\" value=\"");
    	out.write(request.getParameter("sobrenome") + "\">");
    	out.write("<input type=\"hidden\" name=\"rua\" value=\"");
    	out.write(request.getParameter("rua") + "\">");
    	out.write("<input type=\"hidden\" name=\"complemento\" value=\"");
    	out.write(request.getParameter("complemento") + "\">");
    	out.write("<input type=\"hidden\" name=\"cidade\" value=\"");
    	out.write(request.getParameter("cidade") + "\">");
    	out.write("<input type=\"hidden\" name=\"estado\" value=\"");
    	out.write(request.getParameter("estado") + "\">");
    	out.write("<input type=\"hidden\" name=\"cep\" value=\"");
    	out.write(request.getParameter("cep") + "\">");
    	
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
