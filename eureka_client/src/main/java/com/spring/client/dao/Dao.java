package com.spring.client.dao;

import org.apache.ibatis.annotations.Mapper;

import com.spring.client.entities.Employee;

@Mapper
public interface Dao {
		
	public Employee findById(Integer id);
	
}
