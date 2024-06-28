package com.techmojo.beans;

public class Shopping {
	public double buyProduct(double balance, double prodCost) throws Exception
	{
		double updatedBal;
		try {
			if(balance < prodCost) {
				Exception ae = new Exception("Your balance is" + balance + " which is not sufficient to spend "+prodCost );
				throw ae;
			}
			updatedBal =  balance - prodCost;
		}
		finally {
			System.out.println("Complete to interact with your back");
		}
		return updatedBal;
	}
}
