package com.sapient.day5;


public class ExceptionsDemo extends Exception {
	
	public ExceptionsDemo(){
		super("User defined Exception occured");
	}

}

class Except{
	
	public static String transact(int balance, int payment) {
		
		if(balance<0)
			return "Invalid Balance";
		
		else if(balance < payment)
			return "Insufficient Balance";
		
		
		return "Transaction Done";
		
	}
	
}
