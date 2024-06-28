package com.techmojo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.techmojo.model.Student;

@Controller
public class StudentController {
	
	@RequestMapping("/stud")
	public ModelAndView method1() {
		ModelAndView mav = new ModelAndView("student.jsp");
		Student stud = new Student(101, "lokesh", "lokesh@gmail.com");
		mav.addObject("stud", stud);
		
		return mav;
	}

}
