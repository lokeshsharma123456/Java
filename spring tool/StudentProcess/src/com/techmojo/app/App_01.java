package com.techmojo.app;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.techmojo.service.StudentOperations;

public class App_01 {

	public static void main(String[] args) {
		System.out.println("Welcome to Student processing system");
		StudentOperations studentOperations = new StudentOperations();
		try {
			studentOperations.process("student.txt", "student_output.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("End of processing.");
	}

}
