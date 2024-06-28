package com.techmojo.producer;

import org.apache.kafka.common.protocol.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import com.techmojo.entity.Person;

@Component
public class KafkaProducer {
	
	KafkaTemplate<String, String> kafkaTemplate;
	@Autowired
	public void setKafkaTemplate(KafkaTemplate<String, String> kafkaTemplate) {
		this.kafkaTemplate = kafkaTemplate;
	}

	
	@Value("${kafka.topic}")
	String kafkaTopic;//get from aplication file
	
	public void produce(Person person) {
		//json datt of the person 
		String jsonString = "{"
	            + "\"id\": " + person.getId() + ","
	            + "\"name\": \"" + person.getName() + "\","
	            + "\"email\": \"" + person.getEmail() + "\""
	            + "}";
		kafkaTemplate.send(kafkaTopic, jsonString);
		System.out.println("Produced Message : " + jsonString);
	}
}
