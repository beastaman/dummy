package com.assignment.problem1;

public class Addition extends Arithmetic {
	public Addition(double num1,double num2)
	{
		setData(num1, num2);
	}
	@Override
	public void calculate()
	{
		System.out.println("Performing Addition : ");
		num3=num1+num2;
	}
	@Override
	protected void calculate(Calculate calculate) throws DivisionByZeroException {
		System.out.println("Performing Addition : ");
		num3=calculate.calculate(num1, num2);
		
	}
}
