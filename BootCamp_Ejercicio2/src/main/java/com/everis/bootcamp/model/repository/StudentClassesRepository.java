package com.everis.bootcamp.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.everis.bootcamp.model.entity.StudentClasses;

public interface StudentClassesRepository extends JpaRepository<StudentClasses, Integer> {

}
