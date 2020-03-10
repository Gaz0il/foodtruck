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

import com.example.demo.model.Adresse;
import com.example.demo.repo.AdresseRepo;


@RestController
@RequestMapping("/adresse")
public class AdresseController {
	
	@Autowired
	private AdresseRepo repo;
	
	@GetMapping("findAll")
	public List<Adresse> findAll() {
		return repo.findAll();
	}
	
	@GetMapping("find/{id}")
	public Optional<Adresse> findById(@RequestParam int id) {
		return repo.findById(id);
	}
	
	@PostMapping("create")
	public void Create(@RequestBody Adresse addr) {
		repo.save(addr);
	}
	
	@DeleteMapping("delete")
	public void delete(@RequestBody Adresse addr) {
		repo.delete(addr);
		
	}
	@PutMapping("update")
	public void update() {
		
	}

}
