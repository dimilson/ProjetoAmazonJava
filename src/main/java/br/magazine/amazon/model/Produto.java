package br.magazine.amazon.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;


@Entity
public class Produto {
	
	@Id
	@GeneratedValue
	private String codigo;
	@Column
	private String nome;
	@Column
	private String descricao;
	@ManyToOne
	@JoinColumn(name = "idc")
	private Categoria categoria;
	@Column
	private String marca;
	@Column
	private Double preco;
	@OneToMany(cascade =CascadeType.ALL , mappedBy = "carrinho"  )
	private Carrinho carrinho;
	
	
	public Produto(String nome, String codigo, String descricao, Categoria categoria, String marca, Double preco) {
		//super();
		
		this.nome = nome;
		this.codigo = codigo;
		this.descricao = descricao;
		this.categoria = categoria;
		this.marca = marca;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	
	

}
