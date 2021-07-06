package com.sapient;

//import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Week1 day 3");
		//addTwoNumber();
		AdditionOfTwoNo obj = new AdditionOfTwoNo();
		int number1 = Read.scanner.nextInt();
		int number2 = Read.scanner.nextInt();
		obj.setData(number1, number2);
		obj.calculateResult();
		System.out.println(obj.getData());
	}
	
	public static void addTwoNumber() {
		//Scanner scanner = new Scanner(System.in);
		
		int a = Read.scanner.nextInt();
		int b = Read.scanner.nextInt();
		System.out.println(a + b);
		//scanner.close();
	}
}
