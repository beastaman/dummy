package com.dayfour;

public class Addition extends MathematicalOperation {
	public Addition(double num1,double num2)
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
