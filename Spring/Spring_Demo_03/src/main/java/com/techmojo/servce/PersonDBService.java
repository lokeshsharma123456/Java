package com.techmojo.servce;

import org.springframework.stereotype.Service;

import com.techmojo.beans.Person;

//@Service
public class PersonDBService implements PersonService{

	public PersonDBService() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void save(Person p) {
		// TODO Auto-generated method stub
		System.out.println("Saving peron to db" + p);
		
	}

	@Override
	public Person find(int id) {
		// TODO Auto-generated method stub
		System.out.println("Finding a person form DB with id:"+ id);
		return new Person(id, "DummyName", "likesh@gmail.com");
		
	}

}
