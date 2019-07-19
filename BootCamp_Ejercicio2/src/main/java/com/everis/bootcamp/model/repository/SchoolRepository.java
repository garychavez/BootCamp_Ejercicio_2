package com.everis.bootcamp.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.everis.bootcamp.model.entity.School;

public interface SchoolRepository extends JpaRepository<School, Integer> {

}
