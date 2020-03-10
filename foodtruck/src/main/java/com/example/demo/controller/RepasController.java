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

import com.example.demo.model.Repas;
import com.example.demo.repo.RepasRepo;

@RestController
@RequestMapping("/repas")
public class RepasController {

	@Autowired
	private RepasRepo repo;

	@GetMapping("findAll")
	public List<Repas> findAll() {
		return repo.findAll();
	}

	@GetMapping("find/{id}")
	public Optional<Repas> findById(@RequestParam int id) {
		return repo.findById(id);
	}

	@PostMapping("create")
	public void Create(@RequestBody Repas repas) {
		repo.save(repas);
	}

	@DeleteMapping("delete")
	public void delete(@RequestBody Repas repas) {
		repo.delete(repas);

	}

	@PutMapping("update")
	public void update() {

	}

}
