package com.techmojo.servce;

import org.springframework.stereotype.Component;

import com.techmojo.beans.Person;

@Component
public class PersonFileService implements PersonService {

	public PersonFileService() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void save(Person p) {
		// TODO Auto-generated method stub
		System.out.println(p);

	}

	@Override
	public Person find(int id) {
		// TODO Auto-generated method stub
		System.out.println("Finding a person form DB with id:"+ id);
		return new Person(id, "DummyName", null);
//		return null;
	}

}
