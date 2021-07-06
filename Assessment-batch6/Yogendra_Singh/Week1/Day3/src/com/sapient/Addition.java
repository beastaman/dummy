package com.sapient;

public class Addition extends MathematicalOperation {
	public Addition(int num1,int num2)
	{
		super(num1,num2);
	}
	@Override
	public void calculate()
	{
		System.out.println("Performing Addition ");
		num3=num1+num2;
	}
}
