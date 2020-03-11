package com.example.demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.example.demo.model.Adresse;
import com.example.demo.model.FamilleRepas;
import com.example.demo.model.Genre;
import com.example.demo.model.Produit;
import com.example.demo.model.Profil;
import com.example.demo.model.Repas;
import com.example.demo.model.Utilisateur;
import com.example.demo.repo.AdresseRepo;
import com.example.demo.repo.FamilleRepasRepo;
import com.example.demo.repo.GenreRepo;
import com.example.demo.repo.ProfilRepo;
import com.example.demo.repo.RepasRepo;
import com.example.demo.repo.UtilisateurRepo;

import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
<<<<<<< HEAD
public class FoodtruckApplication /*implements CommandLineRunner */{

	private GenreRepo genreRepo;
	private RepasRepo repasRepo;
	private FamilleRepasRepo familleRepasRepo;
	private AdresseRepo adresseRepo;
	private ProfilRepo profilRepo;
	private UtilisateurRepo userRepo;
=======
public class FoodtruckApplication {
	
//	private GenreRepo genreRepo;
//	private RepasRepo repasRepo;
>>>>>>> 76169301f8566ca1872b7b0000a14ad3a483f6c1

	public static void main(String[] args) {
		SpringApplication.run(FoodtruckApplication.class, args);

	}

//	@Override
//	public void run(String... args) throws Exception {
//		System.out.println("***************************************");
//		/*
//		 * Initialisation des données à la base
//		 */
//		try {
//
//			// Famille Repas
//			FamilleRepas fr1 = new FamilleRepas(1, "Boissons Chaudes");
//			FamilleRepas fr2 = new FamilleRepas(2, "Boissons Froides");
//			FamilleRepas fr3 = new FamilleRepas(3, "Plats");
//			FamilleRepas fr4 = new FamilleRepas(4, "Desserts");
//			FamilleRepas fr5 = new FamilleRepas(5, "Viennoiseries");
//			fr1.setActif(true);
//			fr2.setActif(true);
//			fr3.setActif(true);
//			fr4.setActif(true);
//			fr5.setActif(true);
//
//			// Repas
//			Repas r1 = new Repas(1, "Petit Déjeuner");
//			Repas r2 = new Repas(2, "Déjeuner");
//			Repas r3 = new Repas(3, "Goûter");
//			Repas r4 = new Repas(4, "Diner");
//			r1.setActive(true);
//			r2.setActive(true);
//			r3.setActive(true);
//			r4.setActive(true);
//
//			// Adresse
//			Adresse adr1 = new Adresse(1, 15, "Charles de Gaulles", 48250, "France");
//			Adresse adr2 = new Adresse(2, 8, "rue Flaubert", 84650, "France");
//			Adresse adr3 = new Adresse(3, 15, "rue du Paradis", 63250, "France");
//
//			// Genre
//			Genre g1 = new Genre(1, "Mr.");
//			Genre g2 = new Genre(2, "Mme.");
//			Genre g3 = new Genre(3, "Autre");
//
//			// Profil
//			Profil p1 = new Profil(1, "Admnistrateur");
//			Profil p2 = new Profil(2, "Utilisateur");
//
//			// Utilisateur
//			Utilisateur user1 = new Utilisateur();
//			user1.setId(1);
//			user1.setNom("Dupond");
//			user1.setPrenom("Toto");
//			user1.setDateNaissance(null);
//			user1.setMotDePasse("123456");
//			user1.setIdGenre(g1);
//			user1.setEmail("toto@gmail.com");
//			user1.setSociete("CGI");
//			user1.setIdAdresse(adr1);
//			user1.setIdProfil(p2);
//			user1.setListeEnteteCommande(listeEnteteCommande);
//			user1.setAvis(avis);
//
//			Utilisateur user2 = new Utilisateur();
//			user2.setId(2);
//			user1.setNom("Jacque");
//			user1.setPrenom("Pierre");
//			user1.setDateNaissance(null);
//			user1.setMotDePasse("123456");
//			user1.setIdGenre(g1);
//			user1.setEmail("admin@contact.com");
//			user1.setSociete("Soch");
//			user1.setIdAdresse(adr2);
//			user1.setIdProfil(p1);
//			user1.setListeEnteteCommande(listeEnteteCommande);
//			user1.setAvis(avis);
//			
//			Produit p1 = new Produit();
//			p1.setId(1);
//			p1.setLibelle("Coca");
//			p1.setPrix(1.50);
//			p1.set
//			/*
//			 * Association
//			 */
//			// Liste
//			Collection<FamilleRepas> listFamilleRepas = new ArrayList<FamilleRepas>();
//
//			// Attribue
//			p1.setListeUtilisateur(listeUtilisateur);
//			p2.setListeUtilisateur(listeUtilisateur);
//
//			r1.setFamilleRepas(listFamilleRepas);
//			r2.setFamilleRepas(listFamilleRepas);
//			r3.setFamilleRepas(listFamilleRepas);
//			r4.setFamilleRepas(listFamilleRepas);
//
//			listFamilleRepas.add(fr1);
//			listFamilleRepas.add(fr2);
//			listFamilleRepas.add(fr3);
//			listFamilleRepas.add(fr4);
//			listFamilleRepas.add(fr5);
//
//			// Envoie des données à la base
//
//			familleRepasRepo.save(fr1);
//			familleRepasRepo.save(fr2);
//			familleRepasRepo.save(fr3);
//			familleRepasRepo.save(fr4);
//			familleRepasRepo.save(fr5);
//
//			repasRepo.save(r1); // En tete commande
//			repasRepo.save(r2);
//			repasRepo.save(r3);
//			repasRepo.save(r4);
//
//			profilRepo.save(p1);
//			profilRepo.save(p2);
//
//			adresseRepo.save(adr1);
//			adresseRepo.save(adr2);
//			adresseRepo.save(adr3);
//
//			genreRepo.save(g1);
//			genreRepo.save(g2);
//			genreRepo.save(g3);
//
//			userRepo.save(user1);
//			userRepo.save(user2);
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//
//	}

	@Bean
	public WebMvcConfigurer corsConfigurer() {
<<<<<<< HEAD
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**").allowedOrigins("*").allowedMethods("GET", "PUT", "POST", "PATCH", "DELETE",
						"OPTIONS");
			}
		};
	}
=======
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
>>>>>>> 76169301f8566ca1872b7b0000a14ad3a483f6c1

}
