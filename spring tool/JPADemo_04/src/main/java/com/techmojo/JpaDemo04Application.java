package com.techmojo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.techmojo.entity.Student;
import com.techmojo.service.StudentService;

@SpringBootApplication
public class JpaDemo04Application {

	public static void main(String[] args) {
		ApplicationContext ct = SpringApplication.run(JpaDemo04Application.class, args);
		StudentService studService = ct.getBean(StudentService.class);
//    	Creation part started------------------------------------------
		Student emp1 = new Student("e1", "e1@gmail.com");
		Student emp2 = new Student("e2", "e2@gmail.com");
		Student emp3 = new Student("e3", "e3@gmail.com");
		Student emp4 = new Student("e3", "e4@gmail.com");
//    	Employee emp5 = new Employee("e5", "e5@gmail.com", "DbAdmin");
        System.out.println( "Hello World! : Before save f " + emp1);
        Student savedstud = studService.recruit(emp1);
        System.out.println("SavedEmp" + savedstud);
        studService.recruit(emp1);
        studService.recruit(emp2);
        studService.recruit(emp3);
        studService.recruit(emp4);
//       Creation part ended---------------------------------
	}

}
