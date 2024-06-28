package com.techmojo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techmojo.entity.Department;
import com.techmojo.entity.Employee;
import com.techmojo.exception.InvalidIdException;
import com.techmojo.repo.DepartmentRepo;
import com.techmojo.repo.EmployeeRepo;

import jakarta.transaction.Transactional;

@Service
public class DepartmentService {

	DepartmentRepo departmentRepo;
	EmployeeRepo employeeRepo;
	public DepartmentService() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Autowired
    public void setEmployeeRepo(EmployeeRepo employeeRepo) {
		this.employeeRepo = employeeRepo;
	}
	
	@Autowired
	public void setDepartmentRepo(DepartmentRepo departmentRepo) {
    	System.out.println("Autowiring department Repo:");
		this.departmentRepo = departmentRepo;
	}
	
	public List<Employee> findEmployeeByDepartment(Department department) {
		return employeeRepo.findAllByDepartment(department);
	}
	
	 
	
	public Department findDepartmentById(int id) throws InvalidIdException{
		Optional<Department> optDepartment = departmentRepo.findById(id);
		if(!optDepartment.isPresent())
			throw new InvalidIdException("Employee id " + id + "is invalid");
		return optDepartment.get();
	}
	
	
	//Listing  all department
	public List<Department> findAllDepartments(){
		return departmentRepo.findAll();
	}
	
	
	//Add new department
	public Department newDepartmentAdd(Department department) {
		System.out.println("Savaing department "+ department);
		System.out.println("Repo " + departmentRepo);
		return departmentRepo.save(department);
	}
	
	
	//Search depertmnet by id
	public Department searchDepartment(int id) throws InvalidIdException{
		Optional<Department> optEmp = departmentRepo.findById(id);
		if(!optEmp.isPresent())
			throw new InvalidIdException("Employee Id "+id+"  is not available in database");
		
		return optEmp.get();
		
	}
	
	//Delete a department like remov
//	@Transactional
	public Department terminate(int id) throws InvalidIdException {
		Department delEmp = searchDepartment(id);
		departmentRepo.deleteById(id);
		return delEmp;

	}
	
	//Edit a department
	public Department editDepartment(Department department) throws InvalidIdException{
		findDepartmentById(department.getId());
		return departmentRepo.save(department);
	}
	
	
//	 
	
}
