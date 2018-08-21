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
		
		String nome = "Edmilson";
		String estado = "Alagoas";
		String cidade="Rio Largo";
		String cep="67100000";
		String rua = "Quadra R";
		String bairro="Cruzeiro do Sul";
		String email = "edmilsonjunior@gmail.com";
		String senha = "12345";
		String telefone = "98876-9123";
		
		
		
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
