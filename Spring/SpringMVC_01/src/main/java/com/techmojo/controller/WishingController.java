package com.techmojo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WishingController {
	
	@RequestMapping("/hello")
	public void name() {
		System.out.println("Hello");
	}
	
}
