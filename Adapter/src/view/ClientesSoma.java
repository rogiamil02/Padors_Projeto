package view;

import model.Cliente;
import model.SomadorAdapter;
import model.SomadorExistente;

public class ClientesSoma {
	
	public static void main(String[] args) {
		
	 SomadorExistente somador = new SomadorExistente();
     SomadorAdapter somadorAdapter = new SomadorAdapter(somador);
     Cliente cliente = new Cliente(somadorAdapter);
     cliente.executar();
     
	}
} 
