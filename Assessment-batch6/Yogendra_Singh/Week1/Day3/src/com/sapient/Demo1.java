package com.sapient;

public class Demo1 {
	public static void main(String[] args){
		AddTwoNumbersWithConstructor obj = new AddTwoNumbersWithConstructor();
		int x=Read.scanner.nextInt();
		int y=Read.scanner.nextInt();
		obj.setData(x, y);
		obj.addNumbers();
		AddTwoNumbersWithConstructor obj1 = new AddTwoNumbersWithConstructor(x);
		obj.displayData();
		obj1.addNumbers();
		AddTwoNumbersWithConstructor obj2 = new AddTwoNumbersWithConstructor(x,y);
		obj1.displayData();
		obj2.addNumbers();
		obj2.displayData();
		System.gc();
	}

}
