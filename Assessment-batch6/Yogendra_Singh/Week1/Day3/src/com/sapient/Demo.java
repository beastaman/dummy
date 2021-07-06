package com.sapient;

public class Demo {
	
	public static void main(String[] args) {
		System.out.println("Hello world !! Welcome to Demo Java Project ");
		AddTwoNumbers obj = new AddTwoNumbers();
		int x=Read.scanner.nextInt();
		int y=Read.scanner.nextInt();
		obj.setData(x, y);
		obj.addNumbers();
		obj.displayData();
		
		String s1;
		String s2;
		s1=Read.scanner.next();
		s2=Read.scanner.next();
		obj.setData(s1, s2);
		obj.addNumbers();
		obj.displayData();
		
	}

}

