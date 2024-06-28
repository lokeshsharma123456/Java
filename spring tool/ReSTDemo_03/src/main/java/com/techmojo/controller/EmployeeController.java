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
//import com.techmojo.exception.InvalidDepartmentIdException;
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
	public ResponseEntity<Employee> findEmplooyeeById(@PathVariable int id) throws InvalidIdException{
		Employee employee = employeeService.searchEmployee(id);
		ResponseEntity<Employee> responseEntity = new ResponseEntity<Employee>(employee, HttpStatus.FOUND);
		return responseEntity;
	}
	
	
	
	
	@GetMapping
	public ResponseEntity <List<Employee>> findAllEmployee(){
		List<Employee> list = employeeService.listOfEmployees();
		ResponseEntity<List<Employee>> responseEntity = new ResponseEntity<List<Employee>>(list, HttpStatus.OK);
		 return responseEntity;
	}
	
	@PostMapping
	public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee1){
		Employee employee = employeeService.recruit(employee1);
		ResponseEntity<Employee> responseEntity = new ResponseEntity<Employee>(employee, HttpStatus.ACCEPTED);
		return responseEntity;
	}
	
	
//	edit @p==
	@PutMapping("/{id}")
	public ResponseEntity<Employee> editEmployee(@PathVariable int id, @RequestBody Employee employee) throws InvalidIdException{
		if(id != employee.getId()) {
			throw new InvalidIdException("Id  of emp " + id + " is not valid");
		}	
		Employee employeePromote = employeeService.promote(employee);
		ResponseEntity<Employee> responseEntity = new ResponseEntity<Employee>(employeePromote, HttpStatus.I_AM_A_TEAPOT);
		return responseEntity;
		
	} 	
	
//	delete
	@DeleteMapping("/{id}")
	public ResponseEntity<Employee> deleteEmployee (@PathVariable int id)  throws InvalidIdException{
		
		Employee employee = employeeService.terminate(id);
		ResponseEntity<Employee> responseEntity = new ResponseEntity<Employee>(employee, HttpStatus.OK);
		return responseEntity; 
	}
	
	
	

}
