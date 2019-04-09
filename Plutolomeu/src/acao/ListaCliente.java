package acao;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.Banco;
import modelo.Cliente;



public class ListaCliente implements Acao{
	
	public String executa(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		

		Banco banco = new Banco();
		List<Cliente> lista = banco.getEmpresas();
		
		request.setAttribute("clientes", lista);
		
		return "forward:ListaCliente.jsp";
	}

}
