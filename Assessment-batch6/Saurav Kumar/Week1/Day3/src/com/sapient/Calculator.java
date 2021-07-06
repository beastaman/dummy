package com.sapient;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		
		Operation op1 = new Add(a, b);
		System.out.println("Result of Addition is " + op1.getResult());

		
		Operation op2 = new Subtract(a, b);
		System.out.println("Result of subtraction is " + op2.getResult());
		
		Operation op3 = new Multiply(a, b);
		System.out.println("Result of multiplication is " + op3.getResult());
		
		Operation op4 = new Divide(a, b);
		System.out.println("Result of division is " + op4.getResult());
	}
}
