package com.week1.Assignment1;

import java.util.Scanner;

public class LambdaExpRunner {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		char choice = scanner.next().charAt(0);
		
		ArithmeticLambdaExp operation;
		
		LambdaExp1 exp1 = new LambdaExp1();
		
		if(exp1.getInstance(num1, num2, choice)!=-1)
			System.out.println(exp1.getInstance(num1, num2, choice));
		
		else System.out.println("Invalid choice selected");
	}
}
