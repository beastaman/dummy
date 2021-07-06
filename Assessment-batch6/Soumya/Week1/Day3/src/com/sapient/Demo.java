package com.sapient;

public class Demo {

	public void add() {

		int number1 = read.scanner.nextInt();
		int number2 = read.scanner.nextInt();

		System.out.println(number1 + number2);

	}

	public static void main(String[] args) {
		System.out.println("Welcome to Java Project");

//		Demo obj = new Demo();
//		obj.add();

		int number1 = read.scanner.nextInt();
		int number2 = read.scanner.nextInt();

		Arithmetic obj = new Arithmetic();
		Arithmetic obj2 = new Arithmetic();
		obj.setData(number1, number2);
		obj2.setData("20", "20");
		System.out.println(obj.getData());
		System.out.println(obj2.getData());
		obj.displayData();
		obj = new Arithmetic();
		System.gc();
	}
}
