package com.assignment.problem1;

import java.util.ArrayList;
import java.util.List;

public class DemoLamdaExpression {
	public static void main(String[] args) {
		System.out.println("Enter Two Numbers : ");
		double num1=Read.scanner.nextInt();
		double num2=Read.scanner.nextInt();
		System.out.println("Enter choice which operation to perform : ");
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		int choice=Read.scanner.nextInt();

	    try {
			List<Calculate> cal = new ArrayList<Calculate>();
			cal.add(((a,b)->(a+b) ));
			cal.add(((a,b)->(a-b) ));
			cal.add(((a,b)->(a*b) ));
			cal.add(((a,b)->(a/b) ));
			Arithmetic arithmetic = Calculation.getMethod(choice, num1, num2);
			arithmetic.calculate(cal.get(choice-1));
			arithmetic.displayData();
		} catch (DivisionByZeroException e) {
			System.out.println(e.getMessage());
		}
	}
}
