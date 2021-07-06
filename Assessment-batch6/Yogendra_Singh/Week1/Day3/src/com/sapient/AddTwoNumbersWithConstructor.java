package com.sapient;

public class AddTwoNumbersWithConstructor {
	protected int num1;
	protected int num2;
	protected int num3;
	public AddTwoNumbersWithConstructor()
	{
		this.num1=101;
		this.num2=99;
		System.out.println("In Zero Argument Constructor ");
	}
	public AddTwoNumbersWithConstructor(int num1)
	{
		this.num1=this.num2=num1;
		System.out.println("In One Argument Constructor ");
	}
	public AddTwoNumbersWithConstructor(int num1,int num2)
	{
		this.num1=num1;
		this.num2=num2;
		System.out.println("In Two Argument Constructor ");
	}
	public void setData(int x,int  y)
	{
		num1=x;
		num2=y;
	}
	public void setData(String x,String  y)
	{
		num1=Integer.parseInt(x);
		num2=Integer.parseInt(y);
	}
	public void addNumbers()
	{
		num3=num1+num2;
	}
	public void displayData()
	{
		System.out.println("sum of "+num1+" and "+num2+" is : " + num3 );
	}
	protected void finalize(){
		System.out.println("Object is destroyed");
	}
}
