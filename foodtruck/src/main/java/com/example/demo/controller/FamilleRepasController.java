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

import com.example.demo.model.FamilleRepas;
import com.example.demo.repo.FamilleRepasRepo;


@RestController
@RequestMapping("/famillerepas")
public class FamilleRepasController {
	
	@Autowired
	private FamilleRepasRepo repo;
	
	@GetMapping("findAll")
	public List<FamilleRepas> findAll() {
		return repo.findAll();
	}
	
	@GetMapping("find/{id}")
	public Optional<FamilleRepas> findById(@RequestParam int id) {
		return repo.findById(id);
	}
	
	@PostMapping("create")
	public void Create(@RequestBody FamilleRepas familleRepas) {
		repo.save(familleRepas);
	}
	
	@DeleteMapping("delete")
	public void delete(@RequestBody FamilleRepas familleRepas) {
		repo.delete(familleRepas);
		
	}
	@PutMapping("update")
	public void update() {
		
	}

}
