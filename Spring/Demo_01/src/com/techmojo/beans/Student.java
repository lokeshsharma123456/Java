package com.techmojo.beans;

public class Student {
	int id;
	String name;
	int subMarks1;
	int subMarks2;
	int subMarks3;
	public Student()
	{
		
	}

	public double getTotal()
	{
		return subMarks1 + subMarks2 + subMarks3;
	}
	public Student(int id, String name, int subMarks1, int subMarks2, int subMarks3) {
		super();
		this.id = id;
		this.name = name;
		this.subMarks1 = subMarks1;
		this.subMarks2 = subMarks2;
		this.subMarks3 = subMarks3;
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
	public int getSubMarks1() {
		return subMarks1;
	}
	public void setSubMarks1(int subMarks1) {
		this.subMarks1 = subMarks1;
	}
	public int getSubMarks2() {
		return subMarks2;
	}
	public void setSubMarks2(int subMarks2) {
		this.subMarks2 = subMarks2;
	}
	public int getSubMarks3() {
		return subMarks3;
	}
	public void setSubMarks3(int subMarks3) {
		this.subMarks3 = subMarks3;
	}
	public double getAvg()
	{
		return getTotal() / 3;
	}

}
