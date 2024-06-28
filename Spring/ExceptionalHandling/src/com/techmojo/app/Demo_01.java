package com.techmojo.app;

public class Demo_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 9;
		int b = 10;
//		int c = a/b;
		int []ar = new int[4];
//		System.out.println(" val at 6" + ar[4]);
		
		try {
			int c = a/b;
			System.out.println("Result" + c);
		}
		catch(ArithmeticException ae) {
			System.out.println(ae);
		}
		
		try {
			int d = ar[5];
			System.out.println("value of out of bound :" + d);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("End");
	}

}
