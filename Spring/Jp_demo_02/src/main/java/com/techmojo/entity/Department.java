package com.techmojo.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "department")
public class Department {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String name;
	String location;
	
	@OneToMany(mappedBy = "department", cascade = CascadeType.ALL)
	List<Employee> employees;
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


	public String getLocation() {
		return location;
	}


	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + ", location=" + location +"]";
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public List<Employee> getEmployees() {
		return employees;
	}


	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}


	
	public Department() {
		// TODO Auto-generated constructor stub
	}

	 
	public Department(String deptName, String locatoion) {
		super();
		
		this.name = deptName;
		this.location = locatoion;
		
	}
	

	 

	 
	
}
