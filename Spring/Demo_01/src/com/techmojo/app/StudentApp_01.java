package com.techmojo.app;

import com.techmojo.beans.Student;

public class StudentApp_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Student stud = new Student(1, "Lokesh Sharma", 50, 80, 99);
		Student stud2 = new Student(21, "kishore", 34, 89, 90);
		Student stud3 = new	Student();
		System.out.println("Avg of stud1 :" + stud.getAvg());
		stud3.setId(89);
		stud3.setSubMarks1(67);
		stud3.setSubMarks2(67);
		stud3.setSubMarks3(67);
		System.out.println("Avg of stud3 :" + stud3.getAvg());
		System.out.println("NAmeof stud3 :" + stud3.getName());
		System.out.println("Name of student1 :" + stud.getName());
		System.out.println("Name of faculty:" + stud2.getName());
	}

}
