package com.techmojo.beans;

public class Greeting {
	public String greet(){
		String msg = "Hello folks!!";
		return msg;
	}
	public void finalize()
	{
		System.out.println("Called finalize");
	}
}
