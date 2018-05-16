package com.spring.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.spring.client.entities.Employee;
import com.spring.client.service.EmService;

@RestController
public class EmController {
	
	@Autowired
	EmService service;
	
	@GetMapping("/emplo/get/{id}")
	public Employee get(@PathVariable("id") Integer id){
		return service.getEmployeeById(id);
	}
	@GetMapping("/emplo")
	public Employee get1(Integer id){
		return service.getEmployeeById(id);
	}
}
