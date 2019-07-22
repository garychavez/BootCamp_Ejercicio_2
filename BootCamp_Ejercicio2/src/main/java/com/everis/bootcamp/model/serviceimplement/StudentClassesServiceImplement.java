package com.everis.bootcamp.model.serviceimplement;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

import com.everis.bootcamp.model.entity.Classes;
import com.everis.bootcamp.model.entity.Student;
import com.everis.bootcamp.model.entity.StudentClasses;
import com.everis.bootcamp.model.repository.StudentClassesRepository;
import com.everis.bootcamp.model.service.StudentClassesService;

@Service
public class StudentClassesServiceImplement implements StudentClassesService {

	@Autowired
	private StudentClassesRepository studentClassesRepository;
	

	@Override
//	@Transactional
	public StudentClasses save(StudentClasses model) throws Exception {
		return studentClassesRepository.save(model);
	}

	@Override
//	@Transactional
	public StudentClasses update(StudentClasses model) throws Exception {
		return studentClassesRepository.save(model);
	}

	@Override
//	@Transactional
	public void delete(Integer id) throws Exception {
		studentClassesRepository.deleteById(id);
	}

	@Override
//	@Transactional(readOnly = true)
	public Optional<StudentClasses> get(Integer id) throws Exception {
		return studentClassesRepository.findById(id);
	}

	@Override
//	@Transactional(readOnly = true)
	public List<StudentClasses> findAll(StudentClasses model) throws Exception {
		return studentClassesRepository.findAll();
	}

//	@Override
////	public StudentClasses get(Integer student_id, Integer class_id, Date date_from) throws Exception {
//		public StudentClasses get(Integer student_id, Integer class_id) throws Exception {
//		Map<String , Integer> pathVariable = new HashMap <String , Integer>();
//		pathVariable.put("idst",student_id)	;
//		Object variable = null;
//		Student student= ((RestTemplate) variable).getForObject("http://localhost:8096/Student/Get/{id}", Student.class,pathVariable);
//		
//		pathVariable.put("idcl",class_id )	;
//		Object variable1 = null;
//		Classes classes= ((RestTemplate) variable1).getForObject("http://localhost:8096/Classes/Get/{id}", Classes.class,pathVariable);
//		
////		Map<String , Date> pathVariable1 = new HashMap <String , Date>();
////		pathVariable1.put("date",date_from )	;
////		Object variable2 = null;
////		StudentClasses date= ((RestTemplate) variable2).getForObject("http://localhost:8096/StudentClasses/Get/{date}", StudentClasses.class,pathVariable1);
//
//
//		return new StudentClasses();
//	}

}
