package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.example.demo.model.Genre;
import com.example.demo.repo.GenreRepo;
import com.example.demo.repo.RepasRepo;

import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class FoodtruckApplication {
	
//	private GenreRepo genreRepo;
//	private RepasRepo repasRepo;

	public static void main(String[] args) {
		SpringApplication.run(FoodtruckApplication.class, args);
	}
	
	@Bean
	public WebMvcConfigurer corsConfigurer() {
	    return new WebMvcConfigurer() {
	        @Override
	        public void addCorsMappings(CorsRegistry registry) {
	            registry.addMapping("/**")
	                    .allowedOrigins("*")
	                    .allowedMethods("GET", "PUT", "POST", "PATCH", "DELETE", "OPTIONS");
	        }
	    };
	}
	
//	public void run() {
//		/*
//		 * Initialisation des données à la base
//		 */
//		
//		// Genre 
//		Genre g1 = new Genre(1, "Mr.");
//		Genre g2 = new Genre(2, "Mme.");
//		Genre g3 = new Genre(3, "Autre");
//		genreRepo.save(g1);
//		genreRepo.save(g2);
//		genreRepo.save(g3);
//		
//		// Repas
//	}

}
