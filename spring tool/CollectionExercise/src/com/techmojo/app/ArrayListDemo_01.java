package com.techmojo.app;

import java.util.ArrayList;

public class ArrayListDemo_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> names= new ArrayList<String>();
		names.add("Lokesh");
		names.add("Sharma");
		names.add("Utkarsh");
		names.add("Abhijeet");
		int n = names.size();
		System.out.println("Size of names " + n);
		System.out.println("buddies "+ names.get(2) + " " +names.get(3));
	}

}
