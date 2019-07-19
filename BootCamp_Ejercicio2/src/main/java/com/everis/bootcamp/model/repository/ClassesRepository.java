package com.everis.bootcamp.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.everis.bootcamp.model.entity.Classes;

public interface ClassesRepository extends JpaRepository<Classes, Integer> {

}
