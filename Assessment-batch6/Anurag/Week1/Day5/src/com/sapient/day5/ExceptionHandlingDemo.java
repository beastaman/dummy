package com.sapient.day5;

public class ExceptionHandlingDemo {

	public static void f1(int a, int b) throws ArithmeticException {
		int c = a / b;
		System.out.println(c);
	}

	public static void main(String[] args) {

		System.out.println("program begin : ");

		int a, b, c;

		a = 10;
		b = 0;

//		f1(a, b);

		try {

//			c = a / b;
//			System.out.println(c);

			f1(a, b);

		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}

		System.out.println("Ends");

	}

}
