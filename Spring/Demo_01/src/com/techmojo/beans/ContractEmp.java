package com.techmojo.beans;

public class ContractEmp extends Employee {
	double payRent;

	public ContractEmp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ContractEmp(int empid, String name, String email, double payRent) {
		super(empid, name, email);
		// TODO Auto-generated constructor stub
		this.payRent = payRent;
	}

//	@Override
	public String toString() {
		return "ContractEmp [" + super.toString() + " payRent=" + payRent + "]";
	}
	
	
}
