package com.sapient;

public class Calculator {

	public static int add(int a, int b) {
		return a+b;
	}

	public static double add(double a, double b) {
		return a+b;
	}

	public static double multiply(double a, double b) {
		return a*b;
	}

	public static double divide(double a, double b) {
		return a/b;
	}
	
	public static void main(String[] args) {

		int a, b;
		
		System.out.print("\nEnter two numbers : ");
		a = Read.scanner.nextInt();
		b = Read.scanner.nextInt();
		
		System.out.println(a + " + " + b + " = " + Calculator.add(a, b));
		System.out.println(a + " * " + b + " = " + Calculator.multiply(a, b));
		System.out.println(a + " / " + b + " = " + Calculator.divide(a, b));
	}

}
