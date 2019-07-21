package com.everis.bootcamp.model.service;

import java.util.List;
import java.util.Optional;

import com.everis.bootcamp.model.entity.StudentClasses;

public interface  StudentClassesService {

	 //the CRUD methods are created

	  StudentClasses save (StudentClasses model) throws Exception ;
	 
	  StudentClasses update(StudentClasses model) throws Exception ;
	 
	  void delete(Integer id) throws Exception;
	 
	  Optional<StudentClasses > get(Integer id) throws Exception;
	 
	  List<StudentClasses>findAll(StudentClasses model)throws Exception;
}
