package com.assignment.problem1;

public class Division extends Arithmetic {
	public Division(double n1,double n2)
	{
		setData(n1, n2);
	}
	@Override
	public void calculate() throws DivisionByZeroException
	{
		System.out.println("Performing Division : ");
			if(num2 == 0)
				throw new DivisionByZeroException();
			num3=num1/num2;
	}
	@Override
	protected void calculate(Calculate calculate) throws DivisionByZeroException {
		System.out.println("Performing Division : ");
		if(num2 == 0)
			throw new DivisionByZeroException();
		num3=calculate.calculate(num1, num2);
		
	}
}
