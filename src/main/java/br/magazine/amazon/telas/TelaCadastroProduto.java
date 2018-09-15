package br.magazine.amazon.telas;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.magazine.amazon.JPAUtil;
import br.magazine.amazon.model.Categoria;
import br.magazine.amazon.model.Produto;

public class TelaCadastroProduto {
	
	
	public void cadastrar()
	{
		
		Scanner ler = new Scanner(System.in);
		Scanner lerN = new Scanner(System.in);
				
				String nome ;
				String descricao;
				String nomeCategoria;
				String tipoCategoria;
				String marca;
				Double preco;
				
				
				
				
				
				
				System.out.println("Digite o nome do produto: ");
				nome = ler.nextLine();
				
				System.out.println("Digite a descrição do produto: ");
				descricao = ler.nextLine();
				
				System.out.println("Digite o nome da categoria: ");
				nomeCategoria = ler.nextLine();

				System.out.println("Digite o tipo da categoria: ");
				tipoCategoria = ler.nextLine();
				
				System.out.println("Digite o preço do produto: ");
				preco = lerN.nextDouble();
				
				System.out.println("Digite a marca do produto: ");
				marca = ler.nextLine();
				
				
				EntityManager manager = JPAUtil.getEntityManager();
				EntityTransaction tx = manager.getTransaction();
				
				tx.begin();
				
				
				Produto p = new Produto(); 
				Categoria c = new Categoria();
			
				c.setNome(nomeCategoria);
				c.setTipo(tipoCategoria);
				
				p.setNome(nome);
				p.setDescricao(descricao);
				p.setPreco(preco);
				p.setMarca(marca);
				
				c.getProdutos().add(p);
				manager.persist(c);
				
				p.setCategoria(c);
				manager.persist(p);
				
				
				tx.commit();
				manager.close();
				JPAUtil.close();
				
				
			}


		
	}
	
	

