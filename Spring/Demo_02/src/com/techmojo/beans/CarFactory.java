package com.techmojo.beans;

public class CarFactory {
	public static Car getVehicle() {
		Car v = new Salavia();
		return v;
//		return new Salavia();
	}
}
