package com.techmojo.beans;

public class Employee {
	int Empid;
	String name;
	String email;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int empid, String name, String email) {
		super();
		Empid = empid;
		this.name = name;
		this.email = email;
	}
	public int getEmpid() {
		return Empid;
	}
	public void setEmpid(int empid) {
		Empid = empid;
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
	public String toString() {
		return "Employeeid :" + Empid + ", name = " + name + ", email = " + email;
	}
}
