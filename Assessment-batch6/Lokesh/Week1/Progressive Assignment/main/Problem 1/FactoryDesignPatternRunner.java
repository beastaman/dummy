package com.week1.Problem1;

import java.util.Scanner;

public class FactoryDesignPatternRunner {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		char choice = scanner.next().charAt(0);
		
		FactoryDP factorydp = new FactoryDP();
		
		Arithmetic operation = factorydp.getInstance(choice);
		
		if(operation!=null) {
			operation.setData(num1, num2);
			operation.calculate(num1, num2);
			operation.display();
		}
		else System.out.println("Invalid choice selected!");
		
	}

}
