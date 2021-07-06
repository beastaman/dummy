package com.day5;

public class DemoException {

	public static int divide(int a, int b) throws ArithmeticException {
		return a / b;
	}

	public static void main(String[] args) {

		int a = 10, b, c;
		b = 0;

		try {
			c = divide(a, b);
			System.out.println(c);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}

	}

}
