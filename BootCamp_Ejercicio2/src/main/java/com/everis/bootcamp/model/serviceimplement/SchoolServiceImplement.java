package com.everis.bootcamp.model.serviceimplement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.everis.bootcamp.model.entity.School;
import com.everis.bootcamp.model.repository.SchoolRepository;
import com.everis.bootcamp.model.service.SchoolService;

@Service
public class SchoolServiceImplement implements SchoolService {

	@Autowired
	private SchoolRepository schoolRepository;
	
	@Override
	@Transactional
	public School save(School model) throws Exception {
		return schoolRepository.save(model);
	}

	@Override
	@Transactional
	public School update(School model) throws Exception {
		return schoolRepository.save(model);
	}

	@Override
	@Transactional
	public void delete(Integer id) throws Exception {
		schoolRepository.deleteById(id);
	}

	@Override
	@Transactional(readOnly = true)
	public void get(Integer id) throws Exception {
		schoolRepository.findById(id);
	}

	@Override
	@Transactional(readOnly = true)
	public List<School> findAll(School model) throws Exception {
		return schoolRepository.findAll();
	}

}
