package com.techmojo.beans;

public class Rectangle extends Polygon {
	
	public Rectangle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Rectangle(double length, double width) {
		super(length, width);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getA() {
		// TODO Auto-generated method stub
		return super.getA();
	}

	@Override
	public void setA(double a) {
		// TODO Auto-generated method stub
		super.setA(a);
	}

	@Override
	public double getB() {
		// TODO Auto-generated method stub
		return super.getB();
	}

	@Override
	public void setB(double b) {
		// TODO Auto-generated method stub
		super.setB(b);
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return a*b;
	}

	 
	
}
