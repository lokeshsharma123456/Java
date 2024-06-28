package com.techmojo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techmojo.entity.Employee;
import com.techmojo.exception.InvalidClassException;
import com.techmojo.repo.EmployeeRepo;

 
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
	//recuit
//	terminate
//	promote	
	EmployeeRepo employeeRepo;

	 
	@Autowired
	public void setEmployeeRepo(EmployeeRepo employeeRepo) {
		this.employeeRepo = employeeRepo;
	}
	public Employee recruit(Employee emp) {
		return employeeRepo.save(emp);
	}
	
	public List<Employee> listOfEmployees(){
		return employeeRepo.findAll();		
	}
//	'termiate'
	public Employee terminate(int id) throws InvalidClassException {
		Employee delEmp = searchEmployee(id);
		employeeRepo.deleteById(id);
		return delEmp;

	}
	
//	searchempliyee
	public Employee searchEmployee(int id) throws InvalidClassException{
		Optional<Employee> optEmp = employeeRepo.findById(id);
		if(!optEmp.isPresent())
			throw new InvalidClassException("Employee Id "+id+"  is not available in database");
		
		return optEmp.get();
		
	}
	
//	promote
	public Employee promote(Employee emp) throws InvalidClassException {
		searchEmployee(emp.getId());
		return employeeRepo.save(emp);
	}
	

}
