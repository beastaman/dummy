package com.dayfive;

public class ExceptionHandlingDemo {

	public static void f1(int a, int b) throws ArithmeticException {
		int c = a / b;
		System.out.println(c);
	}

	public static void main(String[] args) {

		// Throwable: super class of all exceptions 
//		1)Exceptions  -> subclasses: arithmetic
//		2) Error
		
		//Handling:
		// 1) should be specific
		// 2) should be handled centralised (only one place to handle the errors like main)
		// 3) by keywords -> try,catch,throws,finally
		
		//Exceptions sre of two types
		// 1) system defined exceptions
		// 2) user defined exceptions -> user can create own exceptions by extending exception class
//		                              ->we normally use them to check business rules are violated or not
		//							->user defined exception is not called we have to throw it
		System.out.println("In Program --> ");
		int a=10, b=0, c;
		try {
			f1(a, b);

		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		System.out.println("Out Of Program  ----> ");

	}

}
