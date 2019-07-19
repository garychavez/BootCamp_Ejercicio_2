package com.everis.bootcamp.model.service;

import java.util.List;
import com.everis.bootcamp.model.entity.Teachers;

public interface TeachersService {
	
	//the CRUD methods are created
	Teachers save(Teachers model) throws Exception;
	
	Teachers upda(Teachers model) throws Exception;
	
	void delete(Integer id)throws Exception;
	
	void get(Integer id)throws Exception;
	
	List<Teachers> findAll(Teachers model)throws Exception;
}
