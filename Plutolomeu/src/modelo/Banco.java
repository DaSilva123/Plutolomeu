package modelo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Banco {
	
	private static List<Cliente> lista = new ArrayList<>();
	private static Integer chaveSequencial = 1;
	
	
	
	

	public void adiciona(Cliente cliente) {
		cliente.setId(Banco.chaveSequencial++);
		Banco.lista.add(cliente);
	}
	
	public List<Cliente> getEmpresas(){
		return Banco.lista;
	}

	public void removeCliente(Integer id) {
		
		Iterator<Cliente> it = lista.iterator();
		
		while(it.hasNext()) {
			Cliente cli = it.next();
			
			if(cli.getId() == id) {
				it.remove();
			}
		}
	}

	public Cliente buscaEmpresaPelaId(Integer id) {
		for (Cliente cliente : lista) {
			if(cliente.getId() == id) {
				return cliente;
			}
		}
		return null;
	}

	

	

}
