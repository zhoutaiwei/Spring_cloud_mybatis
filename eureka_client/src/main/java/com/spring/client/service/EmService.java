package com.spring.client.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.client.dao.Dao;
import com.spring.client.entities.Employee;

@Service
public class EmService {
	
	@Autowired
	Dao dao;
	public Employee getEmployeeById(Integer id){
		return dao.findById(id);
	}
}
