package com.techmojo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class MVCDemo {
	
	@RequestMapping("/hello")
	public String hello() {
		return "hello.jsp";
	}
	
	@RequestMapping("/yup")
	public String yup() {
		return "yup.jsp";
	}
	@RequestMapping("/welcome")
	public ModelAndView SayWelcome() {
		System.out.println("Welcome");
		ModelAndView modelAndView = new ModelAndView("Welcome.jsp");
		modelAndView.addObject("name", "techmojo");
		
		return modelAndView;
	}
}
