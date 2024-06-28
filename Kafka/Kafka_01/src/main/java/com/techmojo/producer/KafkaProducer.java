package com.techmojo.producer;

import java.util.concurrent.CompletableFuture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Component;

 

@Component
public class KafkaProducer {

	public KafkaProducer() {
		// TODO Auto-generated constructor stub
	}
	KafkaTemplate<String, String> kafkaTemplate;
	@Autowired
	public void setKafkaTemplate(KafkaTemplate<String, String> kafkaTemplate) {
		this.kafkaTemplate = kafkaTemplate;
	}
	
	public void sendMessage(String topic, String message) {
//		kafkaTemplate.send(topic, message); need some more efficient way like competable how to show messages
		CompletableFuture<SendResult<String, String>>future = kafkaTemplate.send(topic, message);
		future.whenComplete((result, ex) -> {
			if(ex == null) {
				System.out.println("Send message : [" + message + "] with offset : [" + result.getRecordMetadata().offset() + "]");
			}
			else {
				System.out.println("Unable to send message : [" + message +"] due to :" + ex.getMessage());
			}
		});
		future.whenComplete((result, ex) -> {
			
		});
	}

}
