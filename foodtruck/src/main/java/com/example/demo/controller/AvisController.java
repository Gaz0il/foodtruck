package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.Avis;
import com.example.demo.repo.AvisRepo;



public class AvisController {
	
	@Autowired
	private AvisRepo repo;
	
	@GetMapping("findAll")
	public List<Avis> findAll() {
		return repo.findAll();
	}
	
	@GetMapping("find/{id}")
	public Optional<Avis> findById(@RequestParam int id) {
		return repo.findById(id);
	}
	
	@PostMapping("create")
	public void Create(@RequestBody Avis avis) {
		repo.save(avis);
	}
	
	@DeleteMapping("delete")
	public void delete(@RequestBody Avis avis) {
		repo.delete(avis);
		
	}
	@PutMapping("update")
	public void update() {
		
	}

}
