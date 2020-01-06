package com.Projeto.ApiRest_SpringBoot.Repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Projeto.ApiRest_SpringBoot.Filmes;
//Métodos operações CRUD
	@Repository
	public interface FilmesRepositorio extends JpaRepository<Filmes, Long>{
		//Método para retornar um unico produto;
		Filmes findById(long id);
		
	} 

