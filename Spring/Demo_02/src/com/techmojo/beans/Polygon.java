package com.techmojo.beans;

public abstract class Polygon {
	double a;
	double b;
	public Polygon() {
		// TODO Auto-generated constructor stub
		super();
	}
	public Polygon(double x, double y) {
		a = x;
		b = y;
	}
	public double getA() {
		return a;
	}
	public void setA(double a) {
		this.a = a;
	}
	public double getB() {
		return b;
	}
	public void setB(double b) {
		this.b = b;
	}
//	@Override
	abstract public double getArea() ;
//		return a*b;
//	}
}
