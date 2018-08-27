package br.magazine.amazon.model;

import java.util.ArrayList;

import java.util.List;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


public class Carrinho {
	
	@Id
	@GeneratedValue
	private Long id ;
	
	@ManyToOne
	@JoinColumn(name = "codigo")
	private List<Produto> produto = new ArrayList<>();
	
	
	
	
	
	
	
	

}
