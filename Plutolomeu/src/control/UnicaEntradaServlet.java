package control;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import acao.Acao;

/**
 * Servlet implementation class UnicaEntradaServlet
 */
@WebServlet("/entrada")
public class UnicaEntradaServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void service(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {

		String paramAcao = request.getParameter("acao");
		String nomeDaAcao;
		nomeDaAcao = null;

		try {
			Class classe = Class.forName("acao." + paramAcao);
			Acao acao = (Acao) classe.newInstance();
			
			nomeDaAcao = acao.executa(request, response);
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}
		
		String[] acoes = nomeDaAcao.split(":");
		
		if(acoes[0].equals("forward")) {
			RequestDispatcher rd = request.getRequestDispatcher(""+acoes[1]);
			rd.forward(request, response);
		}else{
			response.sendRedirect(acoes[1]);
		}

    }

}
