package acao;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.Banco;
import modelo.Cliente;

public class AdicionaCliente implements Acao{
	
	public String executa(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		System.out.println("Cadastrando novo Cliente");
		
		String nomeCliente = request.getParameter("nome_cli");
		String apelido = request.getParameter("apelido_cli");
		String rg = request.getParameter("rg_cli");
		String cpf = request.getParameter("cpf_cli");
		
		
		
		Cliente cliente = new Cliente();
		cliente.setNome(nomeCliente);
		cliente.setApelido(apelido);
		cliente.setCpf(cpf);
		cliente.setRg(rg);
		
		Banco banco = new Banco();
		banco.adiciona(cliente);
		
		request.setAttribute("cli", cliente);
		
		return "redirect:entrada?acao=ListaCliente";
	}

}
