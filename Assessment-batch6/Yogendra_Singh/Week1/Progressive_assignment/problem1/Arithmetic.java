package com.assignment.problem1;

public abstract class Arithmetic {
	double num1;
	double num2;
	double num3;
	public void setData(double num1,double num2)
	{
		this.num1=num1;
		this.num2=num2;
	}
	public abstract void calculate() throws DivisionByZeroException;
	public void displayData()
	{
		System.out.println("Calculation of "+num1+" and "+num2+" is : " + num3 );
	}
	protected abstract void calculate(Calculate calculate) throws DivisionByZeroException;
}
