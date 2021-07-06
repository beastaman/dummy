package com.sapient;

public class Demo4 {
	public static void main(String[] args) {
		System.out.println("Enter Two Numbers : ");
		int num1=Read.scanner.nextInt();
		int num2=Read.scanner.nextInt();
		MathematicalOperation obj[] = new MathematicalOperation[4];
		System.out.println("Enter choice which operation to perform : ");
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		int choice=Read.scanner.nextInt();
		obj[0] = new Addition(num1,num2);
		obj[1] = new Subtraction(num1,num2);
		obj[2] = new Multiplication(num1,num2);
		obj[3] = new Division(num1,num2);
		obj[choice-1].calculate();
		obj[choice-1].displayData();
	}
}
