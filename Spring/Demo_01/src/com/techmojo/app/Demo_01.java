package com.techmojo.app;

import com.techmojo.beans.Greeting;

public class Demo_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Greeting greeting  = new Greeting();
		System.out.println("Message : " + greeting.greet());
		greeting = null;
		System.gc();
	}
	

}
