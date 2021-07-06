package com.dayfour;

public class MathematicalOperation {
	double num1;
	double num2;
	double num3;
	public MathematicalOperation(double num1,double num2)
	{
		this.num1=num1;
		this.num2=num2;
	}
	public void calculate() {}
	public void displayData()
	{
		System.out.println("Calculation of "+num1+" and "+num2+" is : " + num3 );
	}
}
