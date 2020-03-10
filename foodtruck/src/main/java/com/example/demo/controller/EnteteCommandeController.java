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

import com.example.demo.model.EnteteCommande;
import com.example.demo.repo.EnteteCommandeRepo;


@RestController
@RequestMapping("/entetecommande")
public class EnteteCommandeController {
	
	@Autowired
	private EnteteCommandeRepo repo;
	
	@GetMapping("findAll")
	public List<EnteteCommande> findAll() {
		return repo.findAll();
	}
	
	@GetMapping("find/{id}")
	public Optional<EnteteCommande> findById(@RequestParam int id) {
		return repo.findById(id);
	}
	
	@PostMapping("create")
	public void Create(@RequestBody EnteteCommande enteteCommande) {
		repo.save(enteteCommande);
	}
	
	@DeleteMapping("delete")
	public void delete(@RequestBody EnteteCommande enteteCommande) {
		repo.delete(enteteCommande);
		
	}
	@PutMapping("update")
	public void update() {
		
	}

}
