package com.everis.bootcamp.model.service;

import java.util.List;

import com.everis.bootcamp.model.entity.StudentClasses;

public abstract   class StudentClassesService {

	 //the CRUD methods are created

	 abstract StudentClasses save (StudentClasses model) throws Exception ;
	 abstract StudentClasses update(StudentClasses model) throws Exception ;
	 abstract void delete(Integer id) throws Exception;
	 abstract void get(Integer id) throws Exception;
	 abstract List<StudentClasses>findAll(StudentClasses model)throws Exception;
}
