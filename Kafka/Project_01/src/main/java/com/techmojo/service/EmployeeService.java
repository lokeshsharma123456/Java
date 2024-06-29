package com.techmojo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.techmojo.entity.Employee;
import com.techmojo.exception.InvalidIdException;
import com.techmojo.repo.EmployeeRepo;

@Service
public class EmployeeService {
	
	EmployeeRepo employeeRepo;
	RedisTemplate<String, Employee>redisTemplate;
	ObjectMapper objMapper;
	KafkaProducerService kafkaProducerService;
	
	@Autowired
	public void setKafkaProducerService(KafkaProducerService kafkaProducerService) {
		this.kafkaProducerService = kafkaProducerService;
	}

	private static final String CACHE_KEY_STRING = "Employee::";
	
	@Autowired
	public void setRedisTemplate(RedisTemplate<String, Employee> redisTemplate) {
		this.redisTemplate = redisTemplate;
	}
	@Autowired
	public void setObjMapper(ObjectMapper objMapper) {
		this.objMapper = objMapper;
	}

	@Autowired
	public void setEmployeeRepo(EmployeeRepo employeeRepo) {
		this.employeeRepo = employeeRepo;
	}
	
	//saveemploee
	public Employee recruit(Employee emp) {
		Employee employee = employeeRepo.save(emp);
		String cacheKey = CACHE_KEY_STRING + employee.getId();
		redisTemplate.opsForValue().set(cacheKey, employee);
		
		try {
			String message = objMapper.writeValueAsString(employee);
			System.out.println("Message(SAVE) to kafka "+ message);
			kafkaProducerService.sendMessage(message);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return employee;
	}
	public Employee saveEmployee(Employee emp) {
		
		Employee employee = employeeRepo.save(emp);
		String cacheKey = CACHE_KEY_STRING + employee.getId();
		redisTemplate.opsForValue().set(cacheKey, employee);
		return employee;
	}
	
	public List<Employee> listOfEmployees(){
		
		return employeeRepo.findAll();
	}
	
	public Employee searchEmployee(int id) throws InvalidIdException {
		String cacheKey = CACHE_KEY_STRING + id;
		System.out.println("cachekey : " + cacheKey);
		Employee emp =  redisTemplate.opsForValue().get(cacheKey);
		if(emp == null) {
			emp = employeeRepo.findById(id).orElse(null);
			
			if(emp != null)
				redisTemplate.opsForValue().set(cacheKey, emp);
			else
				throw new InvalidIdException("Employee Id = " + id + "not foun");
		}
		return emp;
	}
	
	public Employee promote(Employee emp) throws InvalidIdException{
		if(! employeeRepo.existsById(emp.getId()))
			throw new InvalidIdException("Employee Id" + "not found to edit");
		searchEmployee(emp.getId());
		String cacheKey = CACHE_KEY_STRING + emp.getId();
		redisTemplate.opsForValue().set(cacheKey, emp);
		try {
			String message = objMapper.writeValueAsString(emp);
			System.out.println("Message(EDIT) to kafka "+ message);
			kafkaProducerService.sendMessage(message);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return employeeRepo.save(emp);
	}
		
	public Employee terminateEmployee(int id) throws InvalidIdException {
		if(! employeeRepo.existsById(id))
			throw new InvalidIdException("Employee Id" + "not found to delete");
		
		Employee delEmp = searchEmployee(id);
		employeeRepo.deleteById(id);
		String cacheKey = CACHE_KEY_STRING + id;
		redisTemplate.delete(cacheKey);
		
		String message = "Employee with id "+ id + " is deleted";
		System.out.println("Message [delete] to kafka" + message);
		kafkaProducerService.sendMessage(message);
		return delEmp;
	}
}
