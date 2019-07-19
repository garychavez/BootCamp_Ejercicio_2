package com.everis.bootcamp.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.everis.bootcamp.model.entity.Teachers;

public interface TeachersRepository extends JpaRepository<Teachers, Integer>{

}
