package com.techmojo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import techmojo.beans.Person;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args )
    {
    	ApplicationContext c = new ClassPathXmlApplicationContext("spring.xml");
    	Person person1 = (Person)c.getBean("test");
    	Person person2 = (Person)c.getBean("test");
    	if(person1 == person2) {
    		System.out.println("Single instance");
    	}
    	else {
    		System.out.println("Different instance");
    	}
    	
//        System.out.println(person );
    }
}


//<beans xmlns="http://www.springframework.org/schema/beans"
//xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
//xsi:schemaLocation="http://www.springframework.org/schema/beans
//https://www.springframework.org/schema/beans/spring-beans.xsd">