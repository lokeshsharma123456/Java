package com.techmojo.app;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String>names = new LinkedList<String>();
		names.pop();
		names.add("Lokesh");
		names.add("Sharma");
		names.add("Utkarsh");
		names.add("Abhijeet");
		int n = names.size();
		System.out.println("Size of names " + n);
		System.out.println("buddies "+ names.get(2) + " " +names.get(3));
		
		names.push("Cheenu");
		System.out.println("Size of names " + names.size());
		names.pop();
		for(String l : names)
		{
			System.out.println(l);
		}
		
	}

}
