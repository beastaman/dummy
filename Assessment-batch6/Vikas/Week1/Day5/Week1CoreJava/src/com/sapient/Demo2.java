package com.sapient;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdditionOfTwoNo obj = new AdditionOfTwoNo();
		obj.setData(15, 5);
		obj.calculateResult();
		obj.displayData();
		
//		obj = new AdditionOfTwoNo();
//		obj.calculateResult();
//		obj.displayData();
//		
//		obj = new AdditionOfTwoNo(10);
//		obj.calculateResult();
//		obj.displayData();
//		
//		obj = new AdditionOfTwoNo(8,6);
//		obj.calculateResult();
//		obj.displayData();

		obj = null;
		
		System.gc();   
	}
	
}
