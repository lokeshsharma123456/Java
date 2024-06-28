package com.techmojo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.techmojo.beans.Person;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext c = new ClassPathXmlApplicationContext("spring.xml");
//    	Person p = (Person)c.getBean("person");
//        System.out.println(p );
    	
    	Person p = c.getBean(Person.class);
    	System.out.println(p);
    }
}
