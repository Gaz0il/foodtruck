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

import com.example.demo.model.Profil;
import com.example.demo.repo.ProfilRepo;

@RestController
@RequestMapping("/profil")
public class ProfilController {
	
	@Autowired
	private ProfilRepo repo;
	
	@GetMapping("findAll")
	public List<Profil> findAll() {
		return repo.findAll();
	}
	
	@GetMapping("find/{id}")
	public Optional<Profil> findById(@RequestParam int id) {
		return repo.findById(id);
	}
	
	@PostMapping("create")
	public void Create(@RequestBody Profil profil) {
		repo.save(profil);
	}
	
	@DeleteMapping("delete")
	public void delete(@RequestBody Profil profil) {
		repo.delete(profil);
		
	}
	@PutMapping("update")
	public void update() {
		
	}

}
