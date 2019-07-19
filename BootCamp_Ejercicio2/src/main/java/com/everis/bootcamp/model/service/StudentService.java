package com.everis.bootcamp.model.service;

import java.util.List;

import com.everis.bootcamp.model.entity.Student;

public interface StudentService {

	//the CRUD methods are created
	Student save(Student model) throws Exception;
	
	Student update(Student model) throws Exception;
	
	void delete(Student model) throws Exception;
	
	void get(Integer id) throws Exception;
	
	List<Student> findAll(Student model) throws Exception;
}
