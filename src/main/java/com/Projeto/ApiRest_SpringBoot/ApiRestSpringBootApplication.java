package com.Projeto.ApiRest_SpringBoot;

import java.util.stream.LongStream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.Projeto.ApiRest_SpringBoot.Repositorio.FilmesRepositorio;

@SpringBootApplication
public class ApiRestSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiRestSpringBootApplication.class, args);
	}

	@Bean
	CommandLineRunner init(FilmesRepositorio repository) {
		return args -> {
			repository.deleteAll();
			LongStream.range(1, 2).mapToObj(i -> {
				Filmes f = new Filmes();
				f.setNameFilme("O Mágico de Oz");
				//Filmes f1 = new Filmes();
				//f1.setNameFilme("O Poderoso Chefão");
				
				return f;
			}).map(v -> repository.save(v)).forEach(System.out::println);
		};
	}
}