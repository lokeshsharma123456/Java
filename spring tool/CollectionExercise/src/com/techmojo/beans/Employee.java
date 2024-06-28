package com.techmojo.beans;

public class Employee implements Comparable<Employee> {
	int id;
	String name;
	String email;
	public Employee() {
		// TODO Auto-generated constructor stub
		super();
	}
	public Employee(int id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
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
	@Override
	public int compareTo(Employee other) {
		// TODO Auto-generated method stub
//		if this object i shighter than "other" result +ve
//		== return 0
//		<  return -ve
//		if(this.id > other.id)
//			return 1;
//		else if(this.id == other.id)
//			return 0;
//		else
//			return -1;
		return this.id - other.id;
	}
	
	
}
