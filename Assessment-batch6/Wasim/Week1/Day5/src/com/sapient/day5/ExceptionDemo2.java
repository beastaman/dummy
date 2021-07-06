package com.sapient.day5;

class InsufficientBalance extends Exception {

	public InsufficientBalance() {
		super("Balance insufficient, your transactions is cancelled");
	}

}

public class ExceptionDemo2 {

	public static String fun1(int balance, int withdraw) {

		try {

			if (balance < 0) {
				return "Balance cannot be negative";
			}

			if (balance < withdraw) {
				throw new InsufficientBalance();
			}

			return "Please wait, transactions is under process";

		}

		catch (InsufficientBalance e) {
			return e.getMessage();
		}

		finally {
			System.out.println("ended :");
		}

	}

	public static void main(String[] args) {
	}
}
