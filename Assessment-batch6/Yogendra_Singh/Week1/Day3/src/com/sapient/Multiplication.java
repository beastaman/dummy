package com.sapient;

public class Multiplication extends MathematicalOperation{
	public Multiplication(int num1,int num2)
	{
		super(num1,num2);
	}
	@Override
	public void calculate()
	{
		System.out.println("Performing Multiplication ");
		num3=num1*num2;
	}
}
