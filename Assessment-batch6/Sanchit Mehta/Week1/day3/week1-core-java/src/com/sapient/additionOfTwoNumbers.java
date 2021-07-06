package com.sapient;

public class additionOfTwoNumbers {
	
	int num1,num2,num3;
	

	public void calculate(int num1,int num2) {
		this.num1=num1;
		this.num2=num2;
		this.num3=this.num2+this.num1;
	}
	public int answer() {
		return this.num3;
	}
	public void output() {
		System.out.println(this.num3);
	}

}
