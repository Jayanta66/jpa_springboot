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

import com.jpa.jpaproject.bean.Employee;
import com.jpa.jpaproject.repository.EmployeeRepository;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeRepository repository;
	
	// http://localhost:8080/courses
	@GetMapping("/employee")
	public List<Employee> getAllEmployee() {		
		return repository.findAll();
	}

	
	
	@GetMapping("/employee/{id}")
	public Employee getEmployeeDetails(@PathVariable long id) {
		
		Optional<Employee> employee = repository.findById(id);
		
		if(employee.isEmpty()) {
			throw new RuntimeException("Course not found with id " + id);
		}
	
		return employee.get();
	}
	
	

	@PostMapping("/employee")
	public void createEmployee(@RequestBody Employee employee){
		repository.save(employee);		
	}
	

	
	@PutMapping("/employee/{id}")
	public void updateEmployee(@PathVariable long id, @RequestBody Employee employee){
		repository.save(employee);		
	}

	
	@DeleteMapping("/employee/{id}")
	public void deleteEmployee(@PathVariable long id){
		repository.deleteById(id);
	}
	
}