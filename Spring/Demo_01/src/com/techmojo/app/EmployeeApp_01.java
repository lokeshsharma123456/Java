package com.techmojo.app;

import com.techmojo.beans.ContractEmp;
import com.techmojo.beans.Employee;
import com.techmojo.beans.RegularEmp;

public class EmployeeApp_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 RegularEmp regemp = new RegularEmp(1221, "Lokesh Regular", "lokesh@regular.com", 122121.9);
		 ContractEmp contemp = new ContractEmp(125, "shamra contract", "sharma.contract@gmail.com", 158.00);
		 System.out.println("Regular Emp: " + regemp);
		 System.out.println("Contract Emp:" + contemp);
		
	}

}
