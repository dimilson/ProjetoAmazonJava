package br.magazine.amazon.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name="tabelaCliente")
public class Cliente {

	@Id
	@GeneratedValue
	private int id;
	@Column
	private String nome;
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "ide")
	private Endereco endereco;
	
	@Column
	private String email;
	
	@Column
	private String senha;
	
	@Column
	private String telefone;
	
	
	public Cliente()
	{
		
	}
	
	public Cliente(String nome, Endereco endereco, String email, String senha, String telefone) {
		//super();
		
		this.nome = nome;
		this.endereco = endereco;
		this.email = email;
		this.senha = senha;
		this.telefone = telefone;
	
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
	
}
