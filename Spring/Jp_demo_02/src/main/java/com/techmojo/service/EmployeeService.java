package com.techmojo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techmojo.entity.Employee;
import com.techmojo.exception.InvalidDepartmentIdException;
import com.techmojo.repo.EmployeeRepo;

@Service
public class EmployeeService {
	
	EmployeeRepo employeeRepo;

	@Autowired
	public void setEmployeeRepo(EmployeeRepo employeeRepo) {
		this.employeeRepo = employeeRepo;
	}
	public Employee saveEmployee(Employee emp) {
		return employeeRepo.save(emp);
	}
	
	public List<Employee> listOfEmployees(){
		return employeeRepo.findAll();		
	}
//	'termiate'
	public Employee terminate(int id) throws InvalidDepartmentIdException {
		Employee delEmp = searchEmployee(id);
		employeeRepo.deleteById(id);
		return delEmp;

	}
	
//	searchempliyee
	public Employee searchEmployee(int id) throws InvalidDepartmentIdException{
		Optional<Employee> optEmp = employeeRepo.findById(id);
		if(!optEmp.isPresent())
			throw new InvalidDepartmentIdException("Employee Id "+id+"  is not available in database");
		
		return optEmp.get();
		
	}
	
//	promote
	public Employee promote(Employee emp) throws InvalidDepartmentIdException {
		searchEmployee(emp.getId());
		return employeeRepo.save(emp);
	}
	
	
}
