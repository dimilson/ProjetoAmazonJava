package cadastrar;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.magazine.amazon.JPAUtil;
import br.magazine.amazon.model.Cliente;
import br.magazine.amazon.model.Endereco;


public class CadastroDeCliente {
	
	public  static void cadastrarCliente() {
		
		Scanner ler = new Scanner(System.in);
		
		String nome ;
		String estado ;
		String cidade;
		String cep;
		String rua ;
		String bairro;
		String email ;
		String senha;
		String telefone;
		
		
		
		System.out.println("Digite seu nome completo: ");
		nome = ler.nextLine();
		
		System.out.println("Digite o estado onde mora: ");
		estado = ler.nextLine();
		
		System.out.println("Digite a cidade onde mora: ");
		cidade = ler.nextLine();
		
		System.out.println("Digite seu cep: ");
		cep = ler.nextLine();
		
		System.out.println("Digite seu logradouro: ");
		rua = ler.nextLine();
		
		System.out.println("Digite o nome do seu bairro: ");
		bairro = ler.nextLine();
		
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
		Endereco endereco = new Endereco();
		
		endereco.setRua(rua);
		endereco.setBairro(bairro);
		endereco.setCidade(cidade);
		endereco.setEstado(estado);
		endereco.setCep(cep);
		
		
		pessoa.setNome(nome);
		pessoa.setEmail(email);
		pessoa.getEnderecos().add(endereco);
		pessoa.setTelefone(telefone);
		pessoa.setSenha(senha);
		
		
		manager.persist(pessoa);
		
		
		tx.commit();
		manager.close();
		JPAUtil.close();
		
		
		
	}

	
	
	
	

}
