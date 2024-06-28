package com.techmojo.beans;

public class RegularEmp extends Employee{
	double basicPay;

	public RegularEmp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RegularEmp(int empid, String name, String email, double basicPay) {
		super(empid, name, email);
		// TODO Auto-generated constructor stub
		this.basicPay = basicPay;
	}

	@Override
	public String toString() {
		return "RegularEmp ["+ super.toString()+" basicPay=" + basicPay + "]";
	}
	
	

}
