package com.techmojo;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.internal.build.AllowPrintStacktrace;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.techmojo.entity.Department;
import com.techmojo.entity.Employee;
import com.techmojo.exception.InvalidDepartmentIdException;
import com.techmojo.service.DepartmentService;
import com.techmojo.service.EmployeeService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ct = new ClassPathXmlApplicationContext("spring.xml");
    	EmployeeService employeeService = ct.getBean(EmployeeService.class) ;
    	DepartmentService departmentService = ct.getBean(DepartmentService.class);
//    	
    	Department d1 = new Department("HR", "Hyderabad");
    	Department d2 = new Department("Technical", "Banglore");
    	
//    	departmentService.saveDepartment(d2);
//    	departmentService.saveDepartment(d1);
    	
    	Employee e1 = new Employee("e1", "e1@gmail.com", d1);
    	Employee e2 = new Employee("e2", "e2@gmail.com", d2);
    	Employee e3 = new Employee("e3", "e3@gmail.com", d1);
    	Employee e4 = new Employee("e4", "e4@gmail.com", d2);
    	
//    	List<Employee> list1 = new ArrayList<Employee>();
//    	list1.add(e1);
//    	list1.add(e2);
//    	
//    	List<Employee> list2 = new ArrayList<Employee>();
//    	list2.add(e4);
//    	list2.add(e3);
//    	j
//    	d1.setEmployees(list1);
//    	
//    	d2.setEmployees(list2);
//        System.out.println( "Hello World!" );
//    	
//    	employeeService.saveEmployee(e1);
//    	employeeService.saveEmployee(e2);
//    	employeeService.saveEmployee(e3);
//    	employeeService.saveEmployee(e4);
//    	DepartmentService departmentService = new DepartmentService();
    	
		/*
		 * ct.registerShutdownHook(); try { Department d3 =
		 * departmentService.findDepartmentById(2); List<Employee> emps =
		 * departmentService.findEmployeeByDepartment(d3); for(Employee emp : emps) {
		 * System.out.println(emp);
		 * 
		 * } }catch(InvalidDepartmentIdException e) { e.printStackTrace(); }
		 */
    	try {
            Department d3 = departmentService.findDepartmentById(2);

            // Accessing employees within a transactional context
            List<Employee> emps = departmentService.findEmployeeByDepartment(d3);

            // Print employees
            for (Employee emp : emps) {
                // Accessing each employee's details
//            	Department dep = emp.getDepartment();
                System.out.println(emp);
            }
        } catch (InvalidDepartmentIdException e) {
            e.printStackTrace();
        }
    	
    	
    }
}
