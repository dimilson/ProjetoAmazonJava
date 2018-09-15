package br.magazine.amazon.telas;

import java.util.List;

import javax.persistence.Query;

import javax.persistence.EntityManager;

import br.magazine.amazon.JPAUtil;
import br.magazine.amazon.model.Produto;

public class TelaListarProduto {
	
	public void listar ()
	{
		
		EntityManager manager = JPAUtil.getEntityManager();

		Query query = (Query) manager.createQuery("from Produto");
		
		List<Produto> produtos = query.getResultList();
		
		for (Produto produto : produtos) {

			System.out.println(produto.getCodigo() + " - "
			+ produto.getNome() + " "
			+ produto.getDescricao() + ", "
			+ produto.getCategoria() + "/"
			+ produto.getMarca() + " por "
			+ "R$" + produto.getPreco());
		}

		manager.close();
		JPAUtil.close();
	}

}
