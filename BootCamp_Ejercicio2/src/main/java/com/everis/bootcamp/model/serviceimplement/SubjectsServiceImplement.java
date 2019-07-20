package com.everis.bootcamp.model.serviceimplement;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.everis.bootcamp.model.entity.Subjects;
import com.everis.bootcamp.model.repository.SubjectsRepository;
import com.everis.bootcamp.model.service.SubjectsService;

@Service
public class SubjectsServiceImplement implements SubjectsService {

	@Autowired
	private SubjectsRepository subjectsRepository;
	
	@Override
	@Transactional
	public Subjects save(Subjects model) throws Exception {
		return subjectsRepository.save(model);
	}

	@Override
	@Transactional
	public Subjects update(Subjects model) throws Exception {
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
	public List<Subjects> findAll(Subjects model) throws Exception {
		return subjectsRepository.findAll();
	}

}
