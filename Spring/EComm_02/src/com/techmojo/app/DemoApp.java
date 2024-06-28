package com.techmojo.app;

import com.techmojo.beans.Shopping;

public class DemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shopping s = new Shopping();
		double myAccountBal = 5000.00;
		double prodCost = 5500.00;
//		try {
			try {
				myAccountBal = s.buyProduct(myAccountBal, prodCost);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
//		}
		 
		System.out.println("After order updated bal :" + myAccountBal);
	}

}
