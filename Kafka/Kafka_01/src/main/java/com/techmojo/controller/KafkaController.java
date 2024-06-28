package com.techmojo.controller;

import org.apache.kafka.common.protocol.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.techmojo.producer.KafkaProducer;

@RestController
public class KafkaController {
	
	KafkaProducer kafkaProducer;

	@Autowired
	public void setKafkaProducer(KafkaProducer kafkaProducer) {
		this.kafkaProducer = kafkaProducer;
	}
	
	@PostMapping("/send")
	public String sendMessage(@RequestParam String message) {
		System.out.println("Before sending");
		kafkaProducer.sendMessage("topic01", message);
		System.out.println("After sending");
		return "Message sent :" + message;
		
	}
}	
