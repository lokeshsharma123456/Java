package com.techmojo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.techmojo.beans.Person;
import com.techmojo.servce.PersonService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext c = new ClassPathXmlApplicationContext("spring.xml");
    	PersonService ps = c.getBean(PersonService.class);
    	Person p = new Person(111, "Lokesh", "Lokesh@gmail.com");
    	ps.save(p);
    	System.out.println( "Search 999:" + ps.find(999) );
    }
}
