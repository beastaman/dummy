package com.assignment.problem1;

public class Subtraction extends Arithmetic {

	public Subtraction(double n1,double n2)
	{
		setData(n1, n2);
	}
	@Override
	public void calculate()
	{
		System.out.println("Performing Subtraction : ");
		num3=num1-num2;
	}
	@Override
	protected void calculate(Calculate calculate) throws DivisionByZeroException {
		System.out.println("Performing Subtraction : ");
		num3=calculate.calculate(num1, num2);
	}
}
