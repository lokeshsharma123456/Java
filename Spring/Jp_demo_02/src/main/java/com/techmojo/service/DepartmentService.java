package com.techmojo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techmojo.entity.Department;
import com.techmojo.entity.Employee;
import com.techmojo.exception.InvalidDepartmentIdException;
import com.techmojo.repo.DepartmentRepo;
import com.techmojo.repo.EmployeeRepo;

@Service
public class DepartmentService {

	DepartmentRepo departmentRepo;
	EmployeeRepo employeeRepo;
	
	
	@Autowired
    public void setEmployeeRepo(EmployeeRepo employeeRepo) {
		this.employeeRepo = employeeRepo;
	}
	@Autowired
	public void setDepartmentRepo(DepartmentRepo departmentRepo) {
    	System.out.println("Autowirin department Repo:");
		this.departmentRepo = departmentRepo;
	}
	public DepartmentService() {
		super();
		// TODO Auto-generated constructor stub
	}
	public List<Employee> findEmployeeByDepartment(Department department) {
		return employeeRepo.findAllByDepartment(department);
	}
	
	public Department findDepartmentById(int id) throws InvalidDepartmentIdException{
		Optional<Department> optDepartment = departmentRepo.findById(id);
		if(!optDepartment.isPresent())
			throw new InvalidDepartmentIdException("Employee id " + id + "is invalid");
		return optDepartment.get();
	}
	
	public List<Department> findAllDepartments(){
		return departmentRepo.findAll();
	}
	
	public Department saveDepartment(Department department) {
		System.out.println("Savaing department "+ department);
		System.out.println("Repo " + departmentRepo);
		return departmentRepo.save(department);
	}
	
	public Department editDepartment(Department department) throws InvalidDepartmentIdException{
		findDepartmentById(department.getId());
		return departmentRepo.save(department);
	}

}
