package com.techmojo.beans;

public class Triangle extends Polygon{

	public Triangle() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Triangle(double base, double height) {
		super(base, height);
	}
	
	@Override
	public double getA() {
		// TODO Auto-generated method stub
		System.out.print("I am base: ");
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
		return 0.5*a*b;
	}
}
