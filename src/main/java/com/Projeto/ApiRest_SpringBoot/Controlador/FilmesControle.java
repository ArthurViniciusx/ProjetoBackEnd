package com.Projeto.ApiRest_SpringBoot.Controlador;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.Projeto.ApiRest_SpringBoot.Filmes;
import com.Projeto.ApiRest_SpringBoot.Repositorio.FilmesRepositorio;

import io.swagger.annotations.ApiOperation;


public class FilmesControle {

	@Autowired
	FilmesRepositorio filmesRepositorio;
	
	@ApiOperation(value="Retorna uma lista de Filmes")
	@GetMapping("/filmes")
	public List<Filmes> listaFilmes(){
		return filmesRepositorio.findAll();
	}
	
	@ApiOperation(value="Retorna um filme unico")
	@GetMapping("/filmes/{id}")
	public Filmes listaFilmeUnico(@PathVariable(value="id") long id){
		return filmesRepositorio.findById(id);
	}
	
	@ApiOperation(value="Salva um filme")
	@PostMapping("/filmes")
	public @Valid Filmes salvaFilme(@RequestBody @Valid Filmes filmes) {
		return filmesRepositorio.save( filmes);
	}
	
	@ApiOperation(value="Deleta um filme")
	@DeleteMapping("/filmes")
	public void deletaFilme(@RequestBody @Valid Filmes filmes) {
		filmesRepositorio.delete( filmes);
	}
	
	@ApiOperation(value="Atualiza um filme")
	@PutMapping("/filmes")
	public @Valid Filmes atualizaFilme(@RequestBody @Valid Filmes filmes) {
		return filmesRepositorio.save( filmes);
	}
	 

}

