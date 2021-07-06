package com.sachinweek1assignment;


public class Factory {

	public static Arithmetic getArithmetic(double num1, double num2, int choice) {
		
		Arithmetic[] operations = new Arithmetic[5];

		operations[1] = new Addition(num1, num2);
		operations[2] = new Minus(num1, num2);
		operations[3] = new Multiplication(num1, num2);
		operations[4] = new Division(num1, num2);
		
		return operations[choice];
	}

}