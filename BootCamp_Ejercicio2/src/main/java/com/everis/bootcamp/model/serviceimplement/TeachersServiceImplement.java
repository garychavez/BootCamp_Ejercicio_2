package com.everis.bootcamp.model.serviceimplement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.everis.bootcamp.model.entity.Teachers;
import com.everis.bootcamp.model.repository.TeachersRepository;
import com.everis.bootcamp.model.service.TeachersService;

@Service
public class TeachersServiceImplement implements TeachersService{

	@Autowired
	private TeachersRepository teachersRepository;
	
	@Override
	@Transactional
	public Teachers save(Teachers model) throws Exception {
		return null;
	}

	@Override
	@Transactional
	public Teachers upda(Teachers model) throws Exception {
		return null;
	}

	@Override
	@Transactional
	public void delete(Integer id) throws Exception {
		
	}

	@Override
	@Transactional(readOnly = true)
	public void get(Integer id) throws Exception {
		
	}

	@Override
	@Transactional(readOnly = true)
	public List<Teachers> findAll(Teachers model) throws Exception {
		return null;
	}

}
