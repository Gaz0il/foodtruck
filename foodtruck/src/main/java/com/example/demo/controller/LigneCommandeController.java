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

import com.example.demo.model.LigneCommande;
import com.example.demo.repo.LigneCommandeRepo;

@RestController
@RequestMapping("/lignecommande")
public class LigneCommandeController {
	
	@Autowired
	private LigneCommandeRepo repo;

	@GetMapping("findAll")
	public List<LigneCommande> findAll() {
		return repo.findAll();
	}

	@GetMapping("find/{id}")
	public Optional<LigneCommande> findById(@RequestParam int id) {
		return repo.findById(id);
	}

	@PostMapping("create")
	public void Create(@RequestBody LigneCommande ligneCommande) {
		repo.save(ligneCommande);
	}

	@DeleteMapping("delete")
	public void delete(@RequestBody LigneCommande ligneCommande) {
		repo.delete(ligneCommande);

	}

	@PutMapping("update")
	public void update() {

	}

}
