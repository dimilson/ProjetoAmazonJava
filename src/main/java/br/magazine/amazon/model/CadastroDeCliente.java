package br.magazine.amazon.model;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.magazine.amazon.JPAUtil;


public class CadastroDeCliente {
	
	public void cadastrarCliente() {
		
		
		String nome = "DIMILSON";
		String estado = "ALAGOAS";
		String cidade="RIO LARGO";
		String cep="67100000";
		String rua = "RUA DOS GAYS";
		String bairro="DOS MACHO";
		String email = "ariPbarroitola@gmail.com";
		String senha = "12345";
		String telefone = "2424-2469";
		

		
		EntityManager manager = JPAUtil.getEntityManager();
		EntityTransaction tx = manager.getTransaction();
		
		tx.begin();
		
		
		Cliente pessoa = new Cliente(); 
		Endereco endereco = new Endereco(estado,cidade,bairro,cep,rua);
		
		
		pessoa.setNome(nome);
		pessoa.setEmail(email);
		pessoa.setEndereco(endereco);
		pessoa.setTelefone(telefone);
		pessoa.setSenha(senha);
		
		
		manager.persist(pessoa);
		
		
		tx.commit();
		manager.close();
		JPAUtil.close();
		
		
		
	}

	
	
	
	

}
