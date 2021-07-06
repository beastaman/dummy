package com.sapient.day5;
class InsufficientBalance extends Exception {
	public InsufficientBalance() {
		super("Balance Insufficient, your transaction is cancelled");
	}
}
public class ExceptionDemo2 {

	public static String main(String[] args) {
		
		int balance=100000;
		int withdraw = 500000;
		String str;
		try {
			
			if(withdraw>balance)
			{
				throw new InsufficientBalance();
			}
			str="Please wait your transaction is under process";
		}
		catch(InsufficientBalance e)
		{
			str= (e.getMessage());
		}
		finally {
//			System.out.println("ended ");
		}
		System.out.println("ended ");
		return str;
	}

}
