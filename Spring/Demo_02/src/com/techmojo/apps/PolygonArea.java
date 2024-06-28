package com.techmojo.apps;

import com.techmojo.beans.Polygon;
import com.techmojo.beans.Rectangle;
import com.techmojo.beans.Triangle;

public class PolygonArea{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Polygon p;
		p = new Triangle(12.5, 6.5);
		System.out.println("Area of Triangle :" + p.getArea());
		System.out.println(p.getA());
		p = new Rectangle(12.5, 6.5);
		System.out.println("Area of Rectangle :" + p.getArea());
//		p = new Polygon(5, 8);
//		System.out.println("Area of Polygon :" + p.getArea());
//		It will not work
	}

}
