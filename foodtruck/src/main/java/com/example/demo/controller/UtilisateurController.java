package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Utilisateur;
import com.example.demo.repo.UtilisateurRepo;

@RestController
@RequestMapping("/utilisateur")
public class UtilisateurController {
	
	@Autowired
	private UtilisateurRepo repo;
	
	@GetMapping("findAll")
	public List<Utilisateur> findAll() {
		return repo.findAll();
	}
	
	@PostMapping("create")
	public void Create(@RequestBody Utilisateur user) {
		repo.save(user);
	}

}
