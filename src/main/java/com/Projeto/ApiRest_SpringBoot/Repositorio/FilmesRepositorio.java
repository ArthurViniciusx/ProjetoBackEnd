package com.Projeto.ApiRest_SpringBoot.Repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Projeto.ApiRest_SpringBoot.Filmes;

	@Repository
	public interface FilmesRepositorio extends JpaRepository<Filmes, Long>{
		Filmes findById(long id);
		
	} 

