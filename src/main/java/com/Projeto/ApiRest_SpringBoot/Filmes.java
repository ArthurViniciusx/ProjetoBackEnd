package com.Projeto.ApiRest_SpringBoot;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name= "TB_FILMES")
public class Filmes implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	   @Id
	   @GeneratedValue(strategy = GenerationType.AUTO)
	   private Long id;

	   @NotNull
	   private String nomeFilme;

	   
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNameFilme() {
		return nomeFilme;
	}

	public void setNameFilme(String nameFilme) {
		this.nomeFilme = nameFilme;
	}

	}

