package com.techmojo.beans;

import com.techmojo.exception.InAppropriateValuesException;
import com.techmojo.exception.InsufficientNumberOfValuesException;
import com.techmojo.exception.NonParsableContentException;

public class Student {
	int id;
	String name;
	String email;
	int sub1;
	int sub2;
	int sub3;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int id, String name, String email, int sub1, int sub2, int sub3) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.sub3 = sub3;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getSub1() {
		return sub1;
	}
	public void setSub1(int sub1) {
		this.sub1 = sub1;
	}
	public int getSub2() {
		return sub2;
	}
	public void setSub2(int sub2) {
		this.sub2 = sub2;
	}
	public int getSub3() {
		return sub3;
	}
	public void setSub3(int sub3) {
		this.sub3 = sub3;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + ", sub1=" + sub1 + ", sub2=" + sub2
				+ ", sub3=" + sub3 + "]";
	}
	public String toCSV() {
		return id+", "+name+", "+email+", "+sub1+", "+sub2+", "+sub3;
	}
	public static Student parseStudent(String studCSV) throws InsufficientNumberOfValuesException, InAppropriateValuesException, NonParsableContentException {
		String[] values = studCSV.split(",");
		if( values.length != 6 ) {
			throw new InsufficientNumberOfValuesException("Required 6 but given "+values.length);
		}
		if ( values[0].trim().length()==0 ||
				values[1].trim().length()==0 ||
				values[2].trim().length()==0 ||
				values[3].trim().length()==0 ||
				values[4].trim().length()==0 ||
				values[5].trim().length()==0) {
			throw new InAppropriateValuesException("Values are not appropriate : " + values);
		}
		int id = Integer.parseInt(values[0].trim());
		String name = values[1].trim();
		String email = values[2].trim();
		int sub1 = 0;
		int sub2 = 0;
		int sub3 = 0;
		try {
			sub1 = Integer.parseInt(values[3].trim());
			sub2 = Integer.parseInt(values[4].trim());
			sub3 = Integer.parseInt(values[5].trim());
		}
		catch(NumberFormatException nfe) {
			throw new NonParsableContentException(nfe);
		}
		Student student = new Student(id, name, email, sub1, sub2, sub3);
		return student;
	}
	public int getTotal() {
		int total ;
		total = sub1 + sub2 + sub3;
		return total;
	}
}
