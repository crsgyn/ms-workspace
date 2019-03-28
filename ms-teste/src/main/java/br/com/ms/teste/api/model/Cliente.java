package br.com.ms.teste.api.model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotEmpty;

import br.com.ms.teste.infra.model.BaseEntity;

@Entity
public class Cliente extends BaseEntity {

	@NotEmpty
	private String nome;
	
	@ManyToOne
	@JoinColumn(name="CIDADE_ID")
	private Cidade cidade;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
