package com.example.demo.entitie;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table
public class Drogaria {

	@Id
	//*@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@NotNull
	//*@Size(min = 3, message = "minimo de 3 caracteres")
	private String nome;
	@NotNull
	//*@Size(min = 14, message = "minimo de 14 caracteres")
	private String cnpj;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
}