package com.sapient;

public class Demo1 {

	public static void main(String[] args) {

		System.out.println("Welcome to Java Project!");
		
		Add add = new Add();
		int a, b;
		
		System.out.print("\nEnter two numbers : ");
		a = Read.scanner.nextInt();
		b = Read.scanner.nextInt();
		add.setData(a, b);
		System.out.println(a + " + " + b + " = " + add.getData());
	}

}
