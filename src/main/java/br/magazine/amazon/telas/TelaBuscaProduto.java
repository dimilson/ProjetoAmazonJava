package br.magazine.amazon.telas;

import java.util.Scanner;

import javax.persistence.EntityManager;

import br.magazine.amazon.JPAUtil;
import br.magazine.amazon.model.Produto;

public class TelaBuscaProduto {
	
	public void buscar()
	{
		
		Scanner ler = new Scanner(System.in);
		Integer id;
		
		
		System.out.println("Digite o cogigo do produto que deseja buscar: ");
		id = ler.nextInt();



		EntityManager manager = JPAUtil.getEntityManager();

		Produto produto = manager.find(Produto.class, id);


		System.out.println(produto.getCodigo() + " - "
			+ produto.getNome() + " "
			+ produto.getDescricao() + ", "
			+ produto.getCategoria() + "/"
			+ produto.getMarca() + " por "
			+ "R$" + produto.getPreco());




		manager.close();
		JPAUtil.close();

	}

}
