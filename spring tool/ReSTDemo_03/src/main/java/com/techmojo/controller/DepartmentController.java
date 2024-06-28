package com.techmojo.controller;

//import java.io.InvalidClassException;
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

import com.techmojo.entity.Department;
import com.techmojo.entity.Employee;
//import com.techmojo.entity.department;
import com.techmojo.exception.InvalidIdException;
import com.techmojo.service.DepartmentService;

@RestController
@RequestMapping("/department")
public class DepartmentController {

	public DepartmentController() {
		// TODO Auto-generated constructor stub
	}
	private DepartmentService departmentService;

	@Autowired
	public void setDepartmentService(DepartmentService departmentService) {
		this.departmentService = departmentService;
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Department> findDepartmentById(@PathVariable int id) throws InvalidIdException{
		Department department = departmentService.searchDepartment(id);
		ResponseEntity<Department> responseEntity = new ResponseEntity<Department>(department, HttpStatus.FOUND);
		return responseEntity;
	}
	
	@GetMapping("/{id}/employees")
	public ResponseEntity<List<Employee>> findEmployeesByDepartment(@PathVariable int id) throws InvalidIdException{
		Department department = departmentService.searchDepartment(id);
		List<Employee> employees = departmentService.findEmployeeByDepartment(department);
		System.out.println("--------n\\nn\n\n\n\n\n\n\n\n" + employees + "----------------------------------\n\n\n\n\n\n");
		ResponseEntity<List<Employee>> responseEntity = new ResponseEntity<List<Employee>>(employees, HttpStatus.FOUND);
		return responseEntity;
	}
	
	
	
	@GetMapping
	public ResponseEntity <List<Department>> findAlldepartment(){
		List<Department> list = departmentService.findAllDepartments();
		ResponseEntity<List<Department>> responseEntity = new ResponseEntity<List<Department>>(list, HttpStatus.OK);
		 return responseEntity;
	}
	
	@PostMapping()
	public ResponseEntity<Department> savedepartment(@RequestBody Department department1){
		Department department = departmentService.newDepartmentAdd(department1);
		ResponseEntity<Department> responseEntity = new ResponseEntity<Department>(department, HttpStatus.ACCEPTED);
		return responseEntity;
	}
	
	
//	edit @p==
	@PutMapping("/{id}")
	public ResponseEntity<Department> editDepartment(@PathVariable int id, @RequestBody Department department) throws InvalidIdException{
		if(id != department.getId()) {
			throw new InvalidIdException("Id  of emp " + id + " is not valid");
		}	
		Department departmentPromote = departmentService.editDepartment(department);
		ResponseEntity<Department> responseEntity = new ResponseEntity<Department>(departmentPromote, HttpStatus.I_AM_A_TEAPOT);
		return responseEntity;
		
	} 	
	
//	delete
	@DeleteMapping("/{id}")
	public ResponseEntity<Department> deletedepartment (@PathVariable int id)  throws InvalidIdException{
		
		Department department = departmentService.terminate(id);
		ResponseEntity<Department> responseEntity = new ResponseEntity<Department>(department, HttpStatus.OK);
		return responseEntity; 
	}

}
