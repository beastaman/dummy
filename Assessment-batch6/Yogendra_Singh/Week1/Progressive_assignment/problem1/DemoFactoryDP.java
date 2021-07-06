package com.assignment.problem1;

import java.util.*;

class Calculation {
	public static Arithmetic getMethod(int choice,double n1,double n2) {
		if(choice == 1)
			return new Addition(n1, n2);
		else if(choice == 2)
			return new Subtraction(n1, n2);
		else if(choice == 3)
			return new Multiplication(n1, n2);
		else
			return new Division(n1, n2);
	}
}
public class DemoFactoryDP {

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
		Arithmetic obj = Calculation.getMethod(choice, num1, num2);
	    try {
			obj.calculate();
			obj.displayData();
		} catch (DivisionByZeroException e) {
			System.out.println(e.getMessage());
		}
	    
	}

}
