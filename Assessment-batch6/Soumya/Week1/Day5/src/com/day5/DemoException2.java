package com.day5;

class InsufficientBalance extends Exception {
	public InsufficientBalance() {
		super("Insufficient Balance, Transaction Cancelled.");
	}
}

public class DemoException2 {

	public static String fun1(int balance, int withdraw) {
		if (balance < 0)
			return "Negative balance not possible";
		try {
			if (balance < withdraw) {
				throw new InsufficientBalance();
			}
			return "Transaction will be done shortly";
			// System.out.println("Transacrtion will be done shortly");
		} catch (InsufficientBalance e) {
			// System.out.println(e.getMessage());
			return e.getMessage();
		} finally {
			System.out.println("End");
		}

	}

	public static void main(String[] args) {

		System.out.println(fun1(100, 200));
	}

}
