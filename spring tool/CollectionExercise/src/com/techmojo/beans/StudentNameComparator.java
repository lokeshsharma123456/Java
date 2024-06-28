package com.techmojo.beans;

import java.util.Comparator;

public class StudentNameComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
//		if(o1.name == o2.name)
		return (o1.name).compareTo(o2.name);
		 
	}

	 

}
