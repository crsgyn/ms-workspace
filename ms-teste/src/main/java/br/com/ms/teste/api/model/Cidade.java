package br.com.ms.teste.api.model;

import javax.persistence.Entity;

import br.com.ms.teste.infra.model.BaseEntity;

@Entity
public class Cidade extends BaseEntity {

	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
