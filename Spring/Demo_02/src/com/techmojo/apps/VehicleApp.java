package com.techmojo.apps;

import com.techmojo.beans.Car;
import com.techmojo.beans.CarFactory;
import com.techmojo.beans.Fortuner;
import com.techmojo.beans.Salavia;

public class VehicleApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Fortuner v = new Fortuner();
//		v.turnDirection();
//		v.accelerate();
//		v.fourWheel();
//		v.stop();
//		v.accelerate();
//		
//		Salavia s = new Salavia();
//		s.accelerate();
//		s.turnDirection();
//		s.roofTop();
//		s.stop();
		
//		if fourutner and salavia failse then to make it loosely coupled 
//		Car v = new Fortuner();
//		v.accelerate();
//		v.stop();
//		v.turnDirection();
//		System.out.println("------------------");
////		now two dif refernences
//		Car v1 = new Salavia();
//		v1.accelerate();
//		v1.turnDirection();
//		v1.stop();
		
		Car v1 = CarFactory.getVehicle();
		v1.accelerate();
		v1.turnDirection();
		v1.stop();
	}

}
