package com.techmojo.beans;

import java.util.Comparator;

public class StudentIdComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.id - o2.id;
	}

	 
	 

}
