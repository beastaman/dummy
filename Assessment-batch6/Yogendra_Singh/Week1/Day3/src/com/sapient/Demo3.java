package com.sapient;

public class Demo3 {

	public static void main(String[] args) {
		System.out.println("Enter Two Numbers : ");
		int num1=Read.scanner.nextInt();
		int num2=Read.scanner.nextInt();
		MathematicalOperation obj = new Addition(num1, num2);
		obj.calculate();
		obj.displayData();
		obj = new Subtraction(25, 10);
		obj.calculate();
		obj.displayData();
		obj = new Multiplication(15, 35);
		obj.calculate();
		obj.displayData();
		obj = new Division(25, 5);
		obj.calculate();
		obj.displayData();
		obj = new Division(25, 0);
		obj.calculate();
		obj.displayData();
	}

}
