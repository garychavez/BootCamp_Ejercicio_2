package com.everis.bootcamp.model.service;

import java.util.List;

import com.everis.bootcamp.model.entity.Classes;

public interface ClassesService {

	//the CRUD methods are created
	Classes save(Classes model) throws Exception;
	
	Classes update(Classes model) throws Exception;
	
	void delete(Integer id) throws Exception;
	
	void get(Integer id) throws Exception;
	
	List<Classes> findAll(Classes model) throws Exception;
}