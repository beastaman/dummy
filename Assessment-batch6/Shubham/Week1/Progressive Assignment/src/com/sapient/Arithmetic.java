package com.sapient;

public abstract class Arithmetic {
	protected int num1;
	protected int num2;
	protected double num3;
	
	public Arithmetic(int num1, int num2) {
		super();
		setData(num1,num2);
	}

	public void setData(int num1, int num2)
	{
		this.num1=num1;
		this.num2=num2;
	}
	
	public void display()
	{
		System.out.println("num1: "+num1);
		System.out.println("num2: "+num2);
		System.out.println("num3: "+num3);
	}
	public abstract void calculate();
}
