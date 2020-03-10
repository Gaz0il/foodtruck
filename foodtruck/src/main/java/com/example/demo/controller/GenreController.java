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

import com.example.demo.model.Genre;
import com.example.demo.repo.GenreRepo;

@RestController
@RequestMapping("/genre")
public class GenreController {
	
	@Autowired
	private GenreRepo repo;
	
	@GetMapping("findAll")
	public List<Genre> findAll() {
		return repo.findAll();
	}
	
	@GetMapping("find/{id}")
	public Optional<Genre> findById(@RequestParam int id) {
		return repo.findById(id);
	}
	
	@PostMapping("create")
	public void Create(@RequestBody Genre genre) {
		repo.save(genre);
	}
	
	@DeleteMapping("delete")
	public void delete(@RequestBody Genre genre) {
		repo.delete(genre);
		
	}
	@PutMapping("update")
	public void update() {
		
	}

}
