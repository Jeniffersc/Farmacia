package com.FarmaciaJeni.Farmacia.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import com.sun.istack.NotNull;

@Entity
@Table(name = "tb_categoria")

public class Categoria {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull
	@Size(max=30)
	private String descricao;
	
	@NotNull
	@Size(max=100)
	private String caracteristica;

	public long getId() {
		return id;
	}

	public void setCaracteristica(String nome) {
		this.caracteristica = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public void setId(long id) {
		this.id = id;
	}

	public String getCaracteristica() {
		return caracteristica;
	}
}


