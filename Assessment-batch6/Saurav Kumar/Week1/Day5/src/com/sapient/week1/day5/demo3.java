package com.sapient.week1.day5;

class InsufficientBalance extends Exception {
	public InsufficientBalance() {
		super("Invalid transaction");
	}
}

public class demo3 {
	public static String transaction(int bal, int withdraw) {
		
		try {
			if(withdraw > bal) {
				throw new InsufficientBalance();
			}
			
			return "Transaction successful";
			
		} catch (InsufficientBalance e) {
			return e.getMessage();
		}
		finally {
			System.out.println("transaction ended");
		}
	}
	
	public static void main(String[] args) {
		
		
	}
}
