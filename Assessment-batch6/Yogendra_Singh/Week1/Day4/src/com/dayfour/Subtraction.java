package com.dayfour;

public class Subtraction extends MathematicalOperation {

	public Subtraction(double n1,double n2)
	{
		super(n1,n2);
	}
	@Override
	public void calculate()
	{
		System.out.println("Performing Subtraction ");
		num3=num1-num2;
	}
}
