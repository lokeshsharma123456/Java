package com.techmojo.app;

import java.util.HashSet;
import java.util.TreeMap;
import java.util.TreeSet;


import com.techmojo.beans.Student;
import com.techmojo.beans.StudentIdComparator;
import com.techmojo.beans.StudentNameComparator;

public class StudentSetApp {

	public static void main(String[] args) {
		// TODO Auto-generated constructor stub
//		StudentIdComparator comp = new StudentIdComparator();
//		TreeSet<Student> stud = new TreeSet<Student>();

////		TreeSet<Student> stud = new TreeSet<Student>(new StudentIdComparator());
//		TreeSet<Student> stud = new TreeSet<Student>(new StudentNameComparator());
//		stud.add(new Student(101, "Lokesh"));
//		stud.add(new Student(102, "Divya"));
//		stud.add(new Student(103, "utkarsh"));
//		stud.add(new Student(105, "Abhijeet"));
//		stud.add(new Student(104, "Abhijeet"));
//		for(Student i : stud) {
//			System.out.println(i);
//		}
		
		HashSet<Student>stud = new HashSet<Student>();
		Student s1 = new Student(101, "LokeshSharma");
		stud.add(s1);
		s1 = new Student(101, "arun");
		stud.add(s1);
		stud.add(new Student(101, "arun"));
		stud.add(new Student(103, "varun"));
		stud.add(new Student(102, "larun"));
		
		TreeMap<Integer, Student>mp = new TreeMap<Integer, Student>();
		
		for(Student s : stud)
			mp.put(s.getId(), s);
		for(Integer key : mp.keySet()) {
			System.out.println(key +" "+mp.get(key));
		}
		String str = "Lokesh:sharma:abhijeet:divya:shree:muhmad:salam";
		String[] arrstr = str.split(":");
		for(String i: arrstr)
			System.out.println(i);
		
//		string Date = ""
	}

}
