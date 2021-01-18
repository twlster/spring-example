package com.example.multimodule.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.multimodule.model.Person;


public interface PersonReposiroty extends JpaRepository<Person, Long>{

	public Person findByFirstName(Long id);
	
	
	@Query("SELECT a FROM Person a WHERE a.age BETWEEN :first AND :second")
	public List<Person> findByAgeBetween(Long first, Long second);
	
}
