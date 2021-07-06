package com.sapient;

public class Division extends MathematicalOperation {
	public Division(int num1,int num2)
	{
		super(num1,num2);
	}
	@Override
	public void calculate()
	{
		System.out.println("Performing Division ");
		if(num2 != 0)
			num3=num1/num2;
	}
}
