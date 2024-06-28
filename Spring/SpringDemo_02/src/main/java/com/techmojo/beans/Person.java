package com.techmojo.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person {
	
	@Value("101")
	int id;
	@Value("Priya")
	String name;
	@Value("Priya@gmail.com")
	String email;
	Address addr;
	@Autowired
	public Person(Address addr) {
		// TODO Auto-generated constructor stub
		this.addr = addr;
	}
	public Person(int id, String name, String email, Address addr) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.addr = addr;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Address getAddr() {
		return addr;
	}
	@Autowired
	public void setAddr(Address addr) {
		this.addr = addr;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", email=" + email + ", addr=" + addr + "]";
	}
	
	
	
	
}
