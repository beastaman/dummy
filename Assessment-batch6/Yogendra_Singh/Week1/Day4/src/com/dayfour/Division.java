package com.dayfour;

public class Division extends MathematicalOperation {
	public Division(double n1,double n2)
	{
		super(n1,n2);
	}
	@Override
	public void calculate()
	{
		System.out.println("Performing Division ");
		if(num2 != 0)
			num3=num1/num2;
	}
}
