package br.magazine.amazon.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
public class Categoria {

	@Id
	@GeneratedValue
	private Integer idc;
	
	@Column
	private String nome;
	@Column
	private String tipo;
	
	public Categoria(String nome, String tipo) {
		
		//super();
		
		this.nome = nome;
		this.tipo = tipo;
	}
	

	public Integer getIdc() {
		return idc;
	}


	public void setIdc(Integer idc) {
		this.idc = idc;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	

}
