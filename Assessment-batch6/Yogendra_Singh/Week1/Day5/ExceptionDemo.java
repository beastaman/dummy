package com.dayfive;

class InsufficientBalance extends Exception {

	public InsufficientBalance() {
		super("Insufficient balance, your transaction failed !!! ");
	}
}

public class ExceptionDemo {

	public static void main(String[] args) {
	}

	public String f1(int balance,int withdraw) {
		try {
			if(balance<0)
				return "Balance can't be negative";
			if (balance < withdraw) 
				throw new InsufficientBalance();
			return "Please wait, transaction is under process !! " ;
		}
		catch (InsufficientBalance e) {
			return e.getMessage();
		}
//		finally {
//			return "End here" ;
//		}
	}
}
