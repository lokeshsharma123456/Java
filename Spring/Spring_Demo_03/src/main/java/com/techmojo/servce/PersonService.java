package com.techmojo.servce;

import com.techmojo.beans.Person;

public interface PersonService {
	public void save(Person p);
	public Person find(int id);
}
