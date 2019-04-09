package acao;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.Banco;
import modelo.Cliente;

;

public class MostraCliente implements Acao {
	
	public String executa(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String paramId = request.getParameter("id");
		Integer id = Integer.valueOf(paramId);
		
		Banco banco = new Banco();
		
		Cliente cliente = banco.buscaEmpresaPelaId(id);
		
		System.out.println(cliente.getNome());

		request.setAttribute("cliente", cliente);
			
		return "forward:AlteraCliente.jsp";
	}

}
