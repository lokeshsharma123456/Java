package com.techmojo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import com.techmojo.entity.Person;
import com.techmojo.producer.KafkaProducer;

@Service
public class DataInitializationService implements CommandLineRunner{
	
	KafkaProducer kafkaProducer;
	@Autowired
	public void setKafkaProducer(KafkaProducer kafkaProducer) {
		this.kafkaProducer = kafkaProducer;
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		for(int c=1; c<=10; c++) {
			Person person = new Person(c, "Person"+c, "person"+c+ "@gmail.com");
			kafkaProducer.produce(person);
		}
		
	}
	
	

}
