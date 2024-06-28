package com.techmojo.app;

import org.apache.log4j.Logger;

import com.techmojo.beans.Shopping;
import com.techmojo.exception.InsufficientFindException;
public class DemoApp {
	//static as main is also static so allow static inside it 
	static Logger logger = Logger.getLogger(DemoApp.class);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shopping s = new Shopping();
		double myAccountBal = 5000.00;
		double prodCost = 5500.00;
//		try {
			try {
				logger.warn("Trying to buy product of cost "+ prodCost + ". My account balance  is "+ myAccountBal );
				myAccountBal = s.buyProduct(myAccountBal, prodCost);
				logger.warn("After calling My account balance  is "+ myAccountBal );
			} catch (InsufficientFindException e) {
				// TODO Auto-generated catch block
//				e.printStackTrace();
				logger.error(e);
			}
//		}
		 
		System.out.println("After order updated bal :" + myAccountBal);
	}

}
