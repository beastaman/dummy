package com.dayfour;

public class Multiplication extends MathematicalOperation{
	public Multiplication(double n1,double n2)
	{
		super(n1,n2);
	}
	@Override
	public void calculate()
	{
		System.out.println("Performing Multiplication ");
		num3=num1*num2;
	}
}
