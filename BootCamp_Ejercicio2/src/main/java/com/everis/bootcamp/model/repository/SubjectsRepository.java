package com.everis.bootcamp.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.everis.bootcamp.model.entity.Subjects;

public interface SubjectsRepository extends JpaRepository<Subjects, Integer> {

}
