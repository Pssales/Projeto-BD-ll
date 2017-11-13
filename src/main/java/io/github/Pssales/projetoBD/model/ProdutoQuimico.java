package io.github.Pssales.projetoBD.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ProdutoQuimico {

	@Id
	@GeneratedValue
	@Column
	private Integer idProdutoQuimico;
	
	@Column
	private String nomeComercial;

	public Integer getIdProdutoQuimico() {
		return idProdutoQuimico;
	}

	public void setIdProdutoQuimico(Integer idProdutoQuimico) {
		this.idProdutoQuimico = idProdutoQuimico;
	}

	public String getNomeComercial() {
		return nomeComercial;
	}

	public void setNomeComercial(String nomeComercial) {
		this.nomeComercial = nomeComercial;
	}
}
