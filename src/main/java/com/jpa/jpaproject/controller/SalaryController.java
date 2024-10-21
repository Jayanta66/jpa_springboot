package com.jpa.jpaproject.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jpa.jpaproject.bean.Salary;
import com.jpa.jpaproject.repository.SalaryRepository;


@RestController
public class SalaryController {
	
	@Autowired
	private SalaryRepository repository;
	
	@GetMapping("/salary")
	public List<Salary> getAllSalary() {		
		return repository.findAll();
	}
	
	
	@GetMapping("/salary/{id}")
	public Salary getSalaryDetails(@PathVariable long id) {
		
		Optional<Salary> salary = repository.findById(id);
		
		if(salary.isEmpty()) {
			throw new RuntimeException("Course not found with id " + id);
		}
	
		return salary.get();
	}


	@PostMapping("/salary")
	public void createSalary(@RequestBody Salary salary){
		repository.save(salary);		
	}
	

	
	@PutMapping("/salary/{id}")
	public void updateSalary(@PathVariable long id, @RequestBody Salary salary){
		repository.save(salary);		
	}

	
	@DeleteMapping("/salary/{id}")
	public void deleteSalary(@PathVariable long id){
		repository.deleteById(id);
	}
		
}