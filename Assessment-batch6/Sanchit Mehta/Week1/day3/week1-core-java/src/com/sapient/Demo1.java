package com.sapient;

public class Demo1 {
	
	
	public void add() {
		
		int a=Read.scanner.nextInt();
		int b=Read.scanner.nextInt();
		int c=a+b;
		System.out.println(c);
		Read.scanner.close();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to new java project");
//		Demo1 demo=new Demo1();
//		demo.add();
		additionOfTwoNumbers object=new additionOfTwoNumbers();
		
		int num1=Read.scanner.nextInt();
		int num2=Read.scanner.nextInt();
		object.calculate(num1, num2);
		object.output();

	}

}
