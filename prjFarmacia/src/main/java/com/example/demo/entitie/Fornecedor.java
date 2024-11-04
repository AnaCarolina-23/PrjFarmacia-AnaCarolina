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
public class Fornecedor {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@NotNull
	//*@Size(min = 4, message = "minimo de 4 caracteres")
	private String razaoSoc;
	@NotNull
	//*@Size(min = 4, message = "minimo de 4 caracteres")
	private String nomeFant;
	@NotNull
	//*@Size(min = 14, message = "minimo de 14 caracteres")
	private String cnpj;
	@NotNull
	//*@Size(min = 10, message = "mínimo de 10 caracteres")
	private String endereco;
	@NotNull
	//*@Size(min = 10, message = "minimo de 10 caracteres")
	private String fone;
	@NotNull
	//*@Size(min = 10, message = "minimo de 10 caracteres")
	private String email;
	@NotNull
	//*@Size(min = 10, message = "minimo de 10 caracteres")
	private String inscEst;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRazaoSoc() {
		return razaoSoc;
	}

	public void setRazaoSoc(String razaoSoc) {
		this.razaoSoc = razaoSoc;
	}

	public String getNomeFant() {
		return nomeFant;
	}

	public void setNomeFant(String nomeFant) {
		this.nomeFant = nomeFant;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getFone() {
		return fone;
	}

	public void setFone(String fone) {
		this.fone = fone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getInscEst() {
		return inscEst;
	}

	public void setInscEst(String inscEst) {
		this.inscEst = inscEst;
	}
}