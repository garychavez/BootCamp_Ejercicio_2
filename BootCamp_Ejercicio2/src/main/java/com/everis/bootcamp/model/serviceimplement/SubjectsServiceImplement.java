package com.everis.bootcamp.model.serviceimplement;

import java.util.List;

import javax.security.auth.Subject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.everis.bootcamp.model.repository.SubjectsRepository;
import com.everis.bootcamp.model.service.SubjectsService;

@Service
public class SubjectsServiceImplement implements SubjectsService {

	@Autowired
	private SubjectsRepository subjectsRepository;
	
	@Override
	@Transactional
	public Subject save(Subject model) throws Exception {
		return subjectsRepository.save(model);
	}

	@Override
	@Transactional
	public Subject update(Subject model) throws Exception {
		return subjectsRepository.save(model);
	}

	@Override
	@Transactional
	public void delete(Integer id) throws Exception {
		subjectsRepository.deleteById(id);;
	}

	@Override
	@Transactional(readOnly = true)
	public void get(Integer id) throws Exception {
		subjectsRepository.findById(id);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Subject> findAll(Subject model) throws Exception {
		return subjectsRepository.findAll();
	}

}
