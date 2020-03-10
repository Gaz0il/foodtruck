package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Produit;
import com.example.demo.repo.ProduitRepo;

@RestController
@RequestMapping("/produit")
public class ProduitController {
	
	@Autowired
	private ProduitRepo repo;
	
	@GetMapping("findAll")
	public List<Produit> findAll() {
		return repo.findAll();
	}

	@PostMapping("create")
	public void Create(@RequestBody Produit produit) {
		repo.save(produit);
	}
}
