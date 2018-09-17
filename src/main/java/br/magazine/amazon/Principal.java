package br.magazine.amazon;

import java.util.Scanner;

import br.magazine.amazon.telas.TelaAtualizaProduto;
import br.magazine.amazon.telas.TelaBuscaProduto;
import br.magazine.amazon.telas.TelaCadastroCliente;
import br.magazine.amazon.telas.TelaCadastroProduto;
import br.magazine.amazon.telas.TelaListarProduto;
import br.magazine.amazon.telas.TelaRemoveProduto;

public class Principal {
	
	public static void main(String[] args) {
		
		
		
		TelaCadastroProduto cadastroProduto = new TelaCadastroProduto();
		TelaListarProduto listar = new TelaListarProduto();
		TelaBuscaProduto buscar = new TelaBuscaProduto();
		TelaAtualizaProduto atualizar = new TelaAtualizaProduto();
		TelaRemoveProduto remover = new TelaRemoveProduto();
		TelaCadastroCliente  cadastroCliente = new TelaCadastroCliente();
		
		Scanner ler = new Scanner(System.in);
		
		int i = 1;
		int op;
		
		
			while(i == 1)
			{
				System.out.println("1 - cadastrar Produto: ");
				System.out.println("2 - buscar Produto: ");
				System.out.println("3 - listar Produtos: ");
				System.out.println("4 - atualizar Produto: ");
				System.out.println("5 - remover Produto: ");
				System.out.println("6 - cadastrar cliente: ");
				System.out.println("7 - sair: ");
				
				System.out.println("Digite a opção desejada: ");
				op = ler.nextInt();
				
				
				if(op == 1)
				{
					cadastroProduto.cadastrar();
					
				}
				else if (op == 2)
				{
					buscar.buscar();
				}
				else if (op == 3 )
				{
					listar.listar();
				}
				else if (op == 4)
				{
					atualizar.atualizar();
				}
				else if (op == 5)
				{
					remover.remover();
				}
				else if(op == 6)
				{
					cadastroCliente.cadastrarCliente();
				}
				else 
				{
					i=0;
				}
				
				
			}
		
	}

}
