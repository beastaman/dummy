package com.sapient.day3;

public class Demo1 {

	public static void read() {
		int num1 = Read.scanner.nextInt();
		int num2 = Read.scanner.nextInt();

		AdditionOfTwoNumber obj1 = new AdditionOfTwoNumber(num1, num2);
		System.out.println(obj1.numbersSum());
		obj1.finalize();
		obj1 = new AdditionOfTwoNumber(num1);
		System.out.println(obj1.numbersSum());
		Read.scanner.close();
		obj1 = null;
		System.gc();
	}
	public static void main(String[] args) {
		System.out.println("Welcome to java");
		read();

	}

}
