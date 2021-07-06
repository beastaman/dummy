package com.sapient;

public class Task1 {

	public static void main(String[] args) {
		AdditionOfTwoNo obj = new AdditionOfTwoNo();
		obj.setData(8, 4);
		obj.calculateResult();
		obj.displayData();
		
		obj = new MultiplcationOfTwoNo();
		obj.setData(8, 4);
		obj.calculateResult();
		obj.displayData();
		
		obj = new DivisionOfTwoNo();
		obj.setData(8, 4);
		obj.calculateResult();
		obj.displayData();
		
		obj = new SubtractionOfTwoNo();
		obj.setData(8, 4);
		obj.calculateResult();
		obj.displayData();
	}

}
