package com.techmojo.app;

import java.util.TreeSet;

import com.techmojo.beans.Employee;

public class EmployeeSetApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Employee> emp = new TreeSet<Employee>();
		emp.add(new Employee(101, "Lokesh", "lokesh@gmail.com"));
		emp.add(new Employee(102, "Divya", "divya@gmail.com"));
		emp.add(new Employee(103, "utkarsh", "utkarsh@gmail.com"));
		emp.add(new Employee(104, "Abhi", "renge@gmail.com"));
		emp.add(new Employee(104, "Abhijeet", "renge@gmail.com"));
		System.out.println("Number of Emp :" + emp.size());
		
	}

}
