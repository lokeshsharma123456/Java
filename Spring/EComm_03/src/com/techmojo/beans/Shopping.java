package com.techmojo.beans;
import org.apache.log4j.Logger;

//aime is to throw custom excption so it looks beautiful
//java.lang.Exception: Your balance is5000.0 which is not sufficient to spend 5500.0
//at EComm_02/com.techmojo.beans.Shopping.buyProduct(Shopping.java:9)
//at EComm_02/com.techmojo.app.DemoApp.main(DemoApp.java:14)
//After order updated bal :5000.0
// somehow to get safe from above
import com.techmojo.exception.InsufficientFindException;
public class Shopping {
	Logger logger = Logger.getLogger(Shopping.class);
	public double buyProduct(double balance, double prodCost) throws InsufficientFindException
	{
		logger.debug("Inside of buyProduct with "+balance+" and prodCost: " + prodCost);
		double updatedBal;
		try {
			if(balance < prodCost) {
				logger.warn("Balance is lower than prodCost");
				InsufficientFindException ae = new InsufficientFindException("Your balance is" + balance + " which is not sufficient to spend "+prodCost );
				throw ae;
			}
			updatedBal =  balance - prodCost;
			logger.debug("Balance updated to "+updatedBal);
		}
		finally {
			System.out.println("Complete to interact with your back");
		}
		logger.debug("Returning updated to "+updatedBal);
		return updatedBal;
	}
}
