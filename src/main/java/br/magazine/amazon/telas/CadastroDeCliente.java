package br.magazine.amazon.telas;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.magazine.amazon.JPAUtil;
import br.magazine.amazon.model.Cliente;


public class CadastroDeCliente {
	
	public void cadastrarCliente() {
		
		Scanner ler = new Scanner(System.in);
		
		String nome ;
		String email ;
		String senha;
		String telefone;
		
		
		
		System.out.println("Digite seu nome completo: ");
		nome = ler.nextLine();
		
		System.out.println("Digite um email: ");
		email = ler.nextLine();
		
		System.out.println("Digite uma senha: ");
		senha = ler.nextLine();
		
		System.out.println("Digite seu telefone de contato: ");
		telefone = ler.nextLine();

		
		EntityManager manager = JPAUtil.getEntityManager();
		EntityTransaction tx = manager.getTransaction();
		
		tx.begin();
		
		
		Cliente pessoa = new Cliente(); 
		
		pessoa.setNome(nome);
		pessoa.setEmail(email);
		pessoa.setTelefone(telefone);
		pessoa.setSenha(senha);
		
		
		manager.persist(pessoa);
		
		
		tx.commit();
		manager.close();
		JPAUtil.close();
		
		
		
	}	

}
