package com.everis.bootcamp.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.everis.bootcamp.model.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
