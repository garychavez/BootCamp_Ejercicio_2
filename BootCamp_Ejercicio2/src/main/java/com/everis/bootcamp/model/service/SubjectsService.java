package com.everis.bootcamp.model.service;

import java.util.List;

import javax.security.auth.Subject;

public interface SubjectsService {

	//the CRUD methods are created
	Subject save(Subject model) throws Exception;
	
	Subject update(Subject model)throws Exception;
	
	void delete(Integer id)throws Exception;
	
	void get(Integer id)throws Exception;
	
	List<Subject> findAll(Subject model)throws Exception;
}
