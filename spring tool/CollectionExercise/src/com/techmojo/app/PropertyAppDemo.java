package com.techmojo.app;

import java.util.Properties;

public class PropertyAppDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Properties props = new Properties();
		props.setProperty("name", "Lokesh");
		props.setProperty("email", "a@gamil.com");
		
		System.out.println(props.getProperty("name"));
		System.out.println(props);
	}

}
