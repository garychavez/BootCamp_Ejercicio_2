package com.everis.bootcamp.model.service;

import java.util.List;

import com.everis.bootcamp.model.entity.School;

public interface SchoolService {

	//the CRUD methods are created
	School save(School model) throws Exception;
	
	School update(School model ) throws Exception;
	
	void delete(Integer id) throws Exception;
	
	void get(Integer id) throws Exception;
	
	List<School> findAll(School model) throws Exception;
}
