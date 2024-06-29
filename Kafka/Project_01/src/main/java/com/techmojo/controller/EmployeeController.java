package com.techmojo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techmojo.entity.Employee;
import com.techmojo.exception.InvalidIdException;
import com.techmojo.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	private EmployeeService employeeService;

	@Autowired
	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}
	
	@GetMapping("/{id}")
	public  ResponseEntity<Employee> findEmployeeById(@PathVariable int id) throws InvalidIdException{
		Employee emp = employeeService.searchEmployee(id);
		return new ResponseEntity<Employee>(emp, HttpStatus.FOUND);
	}
	@GetMapping()
	public ResponseEntity<List<Employee>> findAllEmployee(){
		return new ResponseEntity<List<Employee>>(employeeService.listOfEmployees(), HttpStatus.OK);
	}
	@PostMapping()
	public ResponseEntity<Employee> saveEmployee(@RequestBody Employee emp){
		Employee employee = employeeService.recruit(emp);
		return new ResponseEntity<Employee>(employee, HttpStatus.CREATED);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Employee> editEmployee(@PathVariable int id, @RequestBody Employee emp) throws InvalidIdException{
		if(id != emp.getId())
			throw new InvalidIdException("ID is not valid" + id);
		Employee employeePromote = employeeService.promote(emp);
		return new ResponseEntity<Employee>(employeePromote, HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Employee> deleteEmployee(@PathVariable int id) throws InvalidIdException{		
		return new ResponseEntity<Employee>(employeeService.terminateEmployee(id), HttpStatus.OK);
	}
	
	
	
}
