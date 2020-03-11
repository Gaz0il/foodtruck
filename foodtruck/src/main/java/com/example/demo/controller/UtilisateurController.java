package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

	@GetMapping("find/{id}")
	public Optional<Utilisateur> findById(@RequestParam int id) {
		return repo.findById(id);
	}

	@PostMapping("create")
	public void Create(@RequestBody Utilisateur user) {
		Utilisateur user = new Utilisateur();
		repo.save(user);
	}

	@DeleteMapping("delete")
	public void delete(@RequestBody Utilisateur user) {
		repo.delete(user);

	}

	@PutMapping("update")
	public void update(@RequestBody Utilisateur user) {
		repo.findById(user.getId());
		repo.save(user);
	}

}
