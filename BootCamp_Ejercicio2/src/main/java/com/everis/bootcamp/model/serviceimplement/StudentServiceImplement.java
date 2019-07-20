package com.everis.bootcamp.model.serviceimplement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.everis.bootcamp.model.entity.Student;
import com.everis.bootcamp.model.repository.StudentRepository;
import com.everis.bootcamp.model.service.StudentService;

@Service
public class StudentServiceImplement implements StudentService {

	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	@Transactional
	public Student save(Student model) throws Exception {
		return studentRepository.save(model);
	}

	@Override
	@Transactional
	public Student update(Student model) throws Exception {
		return studentRepository.save(model);
	}

	@Override
	@Transactional
	public void delete(Integer id) throws Exception {
		studentRepository.deleteById(id);
	}

	@Override
	@Transactional(readOnly = true)
	public void get(Integer id) throws Exception {
		studentRepository.findById(id);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Student> findAll(Student model) throws Exception {
		return studentRepository.findAll();
	}

}
