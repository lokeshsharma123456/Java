package com.techmojo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WishController {
	
	@RequestMapping("/hello")
	public String Hello(){
		System.out.println("Hello");
		return "hello.jsp";
	} 
	@RequestMapping("/home")
	public String GoHome(){		
		System.out.println("Ghar ja ");
		return "home.jsp";
	}
}
