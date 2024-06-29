package com.techmojo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.techmojo.entity.Employee;
import com.techmojo.entity.Employee2;

@Service
public class KafkaConsumerService {
	
	Employee2Service employee2Service;
	ObjectMapper objectMapper;
	
	@Autowired
	public void setEmployee2Service(Employee2Service employee2Service) {
		this.employee2Service = employee2Service;
	}
	
	@Autowired
	public void setObjectMapper(ObjectMapper objectMapper) {
		this.objectMapper = objectMapper;
	}
	
	@KafkaListener(topics = "$(kafka.topic}", groupId = "${spring.kafka.consumer.group-id}")
	public void consume(String message) {
		
		try {
			Employee employee = objectMapper.readValue(message, Employee.class);
			Employee2 employee2 = new Employee2();
			employee2.setId(employee.getId());
			employee2.setDepartment("Deprtment:" + employee.getDepartment());
			employee2.setName(employee.getName());
			employee2Service.saveEmployee2(employee2);
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
