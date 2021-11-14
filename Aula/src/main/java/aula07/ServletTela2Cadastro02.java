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
 * Servlet implementation class ServletTela2Cadastro02
 */
@WebServlet("/ServletTela2Cadastro02")
public class ServletTela2Cadastro02 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletTela2Cadastro02() {
        super();
        // TODO Auto-generated constructor stub
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	// TODO Auto-generated method stub
    	doPost(request, response);
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	// TODO Auto-generated method stub
    	PrintWriter out = response.getWriter();
		out.write("<html>");
    	
    	out.write("<head>");
    	out.write("<title>CADASTRADO</title>");
    	out.write("</head>");
    	
    	out.write("<body>");
    	
    	HttpSession sessaodois = request.getSession(false);
    	
    	if(sessaodois == null || sessaodois.getAttribute(ServletLogin02.USUARIO) == null) {
			out.println("<a href=\"Login02.jsp\"><br>Realize o seu login para acessar esta pagina.</a>");
		}
    	else {
	                         //cast - de objeto para objeto do tipo DadosPessoais 
	    	DadosPessoais dados = (DadosPessoais) sessaodois.getAttribute("dadosPessoais");
	    	if(dados == null) {
	    		out.write("<h3>Cadastro Nao Finalizado.</h3><br>");
	    		out.println("<a href=\"Login02.jsp\"><br><h3>Dados incompletos, reinicie o sistema.</h3></a>");
	    	}
	    	else {
	    		out.write("<h3>Cadastro Finalizado com Sucesso!</h3><br>");
	    		
	    	    out.write("<b>Seus dados pessoais: </b><br>");
	    	    
	    		out.println("Nome: " + dados.getNome() + " " + dados.getSobrenome() + "<br>");
	    		out.println("Endereco: " 
	    						+ dados.getRua() + " "
	    						+ dados.getComplemento() + " "
	    						+ dados.getCidade() + " "
	    						+ dados.getEstado() + " "
	    						+ dados.getCep() + "<br>");
	    		
	    		out.println("<b>Seus dados profissionais: </b><br>");
		    	
		    	out.println("Nome empresa: " + request.getParameter("empresa") + "<br>");
		    	out.println("Rua: " + request.getParameter("ruaempresa") + "<br>");
		    	out.println("Complemento: " + request.getParameter("complementoempresa") + "<br>");
		    	out.println("Cidade: " + request.getParameter("cidadeempresa") + "<br>");
		    	out.println("Estado: " + request.getParameter("UFempresa") + "<br>");
		    	out.println("CEP: " + request.getParameter("CEPempresa") + "<br>"); 
	    	}
    	}
    	
    	out.write("</body>");
    	
    	out.write("</html>");
    }

}
