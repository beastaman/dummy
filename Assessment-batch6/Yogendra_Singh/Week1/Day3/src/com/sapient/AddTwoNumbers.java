package com.sapient;

public class AddTwoNumbers {
	private int num1;
	private int num2;
	private int num3;
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
}
