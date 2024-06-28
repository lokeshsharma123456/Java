package com.techmojo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techmojo.entity.Person;

public interface PersonRepo extends JpaRepository<Person, Integer> {
	
}
