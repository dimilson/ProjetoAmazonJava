package br.magazine.amazon.telas;

import java.util.Scanner;

import javax.persistence.EntityManager;

import br.magazine.amazon.JPAUtil;
import br.magazine.amazon.model.Produto;

public class TelaAtualizaProduto {
	
	public void atualizar ()
	{
		Scanner ler = new Scanner(System.in);
		Scanner lerString = new Scanner(System.in);
		
		TelaListarProduto lista = new TelaListarProduto();
		Integer codigo;
		int op;
		String descricao;
		double preco;
		
		lista.listar();
		
		System.out.println();
		System.out.println("Digite o codigo do produto que deseja atualizar: ");
		codigo = ler.nextInt();
		
		System.out.println("o que deseja atualizar ?");
		System.out.println("1 - descrição");
		System.out.println("2 - preço");
		
		System.out.println("digite o numero correspondente a opção desejada: ");
		op = ler.nextInt();
		
		EntityManager manager = JPAUtil.getEntityManager();
		
		Produto produto = manager.find(Produto.class, codigo);
		
		if(op == 1)
		{
			
			
			System.out.println("Digite a nova descrição do produto: ");
			descricao = lerString.nextLine();
			
			produto.setDescricao(descricao);
			
			
		}
		else 
		{
			System.out.println("Digite o novo preço do produto: ");
			preco = ler.nextDouble();
			
			produto.setPreco(preco);
		}
		
		
		manager.close();
		JPAUtil.close();
		
		

		
		
	}

}
