package br.magazine.amazon;

import br.magazine.amazon.telas.TelaCadastroCliente;

public class Principal {
	
	public static void main(String[] args) {
		
		TelaCadastroCliente cadastro = new TelaCadastroCliente(); 
		
		cadastro.cadastrarCliente();
		
	}

}
