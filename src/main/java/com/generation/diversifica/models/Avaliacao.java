package com.generation.diversifica.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Model de Avaliação
 * 
 * @author Catarina Rinaldi
 * @since 27/01/2022
 * @version 1.0
 * 
 */

@Entity
@Table(name = "tb_avaliacoes")

public class Avaliacao {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idAvaliacao;

	@NotNull
	@Size(max = 10)
	private int sexualidade;

	@NotNull
	@Size(max = 10)
	private int genero;

	@NotNull
	@Size(max = 10)
	private int pcds;

	@NotNull
	@Size(max = 10)
	private int etnia;

	@ManyToOne
	@JoinColumn(name = "fk_usuario")
	@JsonIgnoreProperties("avaliacao")
	private Usuario usuario;

	// Getters And Setters

	public Long getIdAvaliacao() {
		return idAvaliacao;
	}

	public void setIdAvaliacao(Long idAvaliacao) {
		this.idAvaliacao = idAvaliacao;
	}

	public int getSexualidade() {
		return sexualidade;
	}

	public void setSexualidade(int sexualidade) {
		this.sexualidade = sexualidade;
	}

	public int getGenero() {
		return genero;
	}

	public void setGenero(int genero) {
		this.genero = genero;
	}

	public int getPcds() {
		return pcds;
	}

	public void setPcds(int pcds) {
		this.pcds = pcds;
	}

	public int getEtnia() {
		return etnia;
	}

	public void setEtnia(int etnia) {
		this.etnia = etnia;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}
