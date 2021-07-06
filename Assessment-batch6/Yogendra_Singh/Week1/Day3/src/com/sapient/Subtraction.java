package com.sapient;

public class Subtraction extends MathematicalOperation {

	public Subtraction(int num1,int num2)
	{
		super(num1,num2);
	}
	@Override
	public void calculate()
	{
		System.out.println("Performing Subtraction ");
		num3=num1-num2;
	}
}
