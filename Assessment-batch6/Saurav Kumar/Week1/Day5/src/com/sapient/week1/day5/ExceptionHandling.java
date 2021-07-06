package com.sapient.week1.day5;

public class ExceptionHandling {
	
	public static int Div(int a, int b) throws ArithmeticException{
		return a/b;
	}
	
	public static void main(String[] args) {
		
		int a = 29, b = 0;
		try {
			System.out.println(Div(a, b));
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
		
	}
	
}
