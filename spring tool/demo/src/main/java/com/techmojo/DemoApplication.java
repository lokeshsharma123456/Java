package com.techmojo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.techmojo.beans.FileService;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		System.out.println("Heoolo ");
//		SpringApplication.run(DemoApplication.class, args);
//		no xml file requied
		System.out.println("\nbye");
		ApplicationContext ct = SpringApplication.run(DemoApplication.class, args);
		FileService fs = ct.getBean(FileService.class);
		fs.process();
	}

}
