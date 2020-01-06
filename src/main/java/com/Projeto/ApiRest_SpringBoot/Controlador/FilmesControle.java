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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Projeto.ApiRest_SpringBoot.Filmes;
import com.Projeto.ApiRest_SpringBoot.Repositorio.FilmesRepositorio;

import io.swagger.annotations.ApiOperation;
//Receber requisições HTTP
@RestController
//URL API
@RequestMapping(value="/api")
public class FilmesControle {
//Injeção automaticamente
	@Autowired
	FilmesRepositorio filmesRepositorio;
	
	//"Retorna uma lista de Filmes"
	@GetMapping("/filmes")
	public List<Filmes> listaFilmes(){
		return filmesRepositorio.findAll();
	}
	
	//"Retorna um filme unico"
	@GetMapping("/filmes/{id}")
	public Filmes listaFilmeUnico(@PathVariable(value="id") long id){
		return filmesRepositorio.findById(id);
	}
	//RequestBody = Conteudo para requisição em formato Json
	//"Salva um filme"
	@PostMapping("/filmes")
	public Filmes salvaFilme(@RequestBody Filmes filmes) {
		return filmesRepositorio.save(filmes);
	}
	
	//"Deleta um filme"
	@DeleteMapping("/filmes")
	public void deletaFilme(@RequestBody Filmes filmes) {
		filmesRepositorio.delete(filmes);
	}
	
	//"Atualiza um filme"
	@PutMapping("/filmes")
	public Filmes atualizaFilme(@RequestBody Filmes filmes) {
		return filmesRepositorio.save(filmes);
	}
	 

}

