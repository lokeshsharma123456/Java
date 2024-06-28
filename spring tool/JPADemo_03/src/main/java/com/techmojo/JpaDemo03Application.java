package com.techmojo;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.techmojo.entity.Employee;
import com.techmojo.exception.InvalidClassException;
import com.techmojo.service.EmployeeService;

@SpringBootApplication
public class JpaDemo03Application {

	public static void main(String[] args) {
		ApplicationContext ct = SpringApplication.run(JpaDemo03Application.class, args);
//		 new ClassPathXmlApplicationContext("spring.xml");
    	EmployeeService empService = ct.getBean(EmployeeService.class);
//    	Creation part started------------------------------------------
//    	Employee emp1 = new Employee("e1", "e1@gmail.com", "jriiiiiiiiiiiiiiiiiiiiiiDev");
//    	Employee emp2 = new Employee("e2", "e2@gmail.com", "tester");
//    	Employee emp3 = new Employee("e3", "e3@gmail.com", "linuzx");
//    	Employee emp4 = new Employee("e4", "e4@gmail.com", "jrev");
////    	Employee emp5 = new Employee("e5", "e5@gmail.com", "DbAdmin");
//        System.out.println( "Hello World! : Before save f " + emp1);
//        Employee savedEmp = empService.recruit(emp1);
//        System.out.println("SavedEmp" + savedEmp);
//        empService.recruit(emp1);
//        empService.recruit(emp2);
//        empService.recruit(emp3);
//        empService.recruit(emp4);
//       Creation part ended---------------------------------
        
        
        try {
			Employee e1 = empService.searchEmployee(3);
			System.out.println("e1 "+ e1);
			e1.setDesignation("Sr.developer");
			empService.promote(e1);
			List<Employee> employees = empService.listOfEmployees();
			for(Employee employee : employees)
				System.out.println(employee);
			
			
			
			Employee e2 = empService.searchEmployee(101);
			System.out.println("e2 "+ e2);
		} catch (InvalidClassException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
