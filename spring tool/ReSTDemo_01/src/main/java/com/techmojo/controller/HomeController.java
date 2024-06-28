package com.techmojo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
//@CrossOrigin
public class HomeController {
	

	public HomeController() {
		// TODO Auto-generated constructor stub
	}
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	@ResponseBody
	public String sayHelloGET() {
		return "HelloWorld!!!!!!----GET";
	}
	
	@RequestMapping(value = "/hello", method = RequestMethod.POST)
	@ResponseBody
	public String sayHelloPOST() {
		return "HelloWorld!!!!!! -- POST";
	}
	
	@RequestMapping(value = "/hello", method = RequestMethod.PUT)
	@ResponseBody
	public String sayHelloPUT() {
		return "HelloWorld!!!!!! --- PUT";
	}
	
	@RequestMapping(value = "/hello", method = RequestMethod.DELETE)
	@ResponseBody
	public String sayHelloDelete() {
		return "HelloWorld!!!!!!---DELETE";
	}
}
