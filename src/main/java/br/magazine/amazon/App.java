package br.magazine.amazon;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.magazine.amazon.model.Cliente;
import br.magazine.amazon.model.Endereco;


public class App {
    public static void main( String[] args ){
    	
    	
		
    	EntityManager manager = JPAUtil.getEntityManager();
		EntityTransaction tx = manager.getTransaction();
		tx.begin();
		
		String nome = "Edmilson";
		String estado = "Alagoas";
		String cidade="Rio Largo";
		String cep="67100000";
		String rua = "Quadra R";
		String bairro="Cruzeiro do Sul";
		String email = "edmilsonjunior@gmail.com";
		String senha = "12345";
		String telefone = "98876-9123";
		
		
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
