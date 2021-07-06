package com.sapient;


public class Demo {
	
//	public void addTwoNumbers() {
//		
//		int num1 = Read.scanner.nextInt();
//		int num2 = Read.scanner.nextInt();
//		
//		System.out.println("Result = " + (num1+num2));
//		
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Java Project!!");
		
//		Demo obj = new Demo();
//		
//		obj.addTwoNumbers();
		
		
		AddingTwoNumber obj;
		
		obj = new AddingTwoNumber();
		System.out.println("Result = " + obj.add());
		
		obj = new AddingTwoNumber(25);
		System.out.println("Result = " + obj.add());
		
		obj = new AddingTwoNumber(10, 15);
		System.out.println("Result = " + obj.add());
		
		obj = null;
		
		System.gc();
	}

}
