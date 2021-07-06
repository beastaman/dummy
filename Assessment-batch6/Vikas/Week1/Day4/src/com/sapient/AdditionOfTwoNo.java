package com.sapient;

public class AdditionOfTwoNo {
	
	protected int number1, number2, result;
	
//	public AdditionOfTwoNo() {
//		//zero argument constructor
//		this.number1 = 100;
//		this.number2 = 200;
//		System.out.println("zero argument constructor");
//	}
//	
//	public AdditionOfTwoNo(int number1) {
//		//one argument constructor
//		this.number1 = this.number2 = number1; 
//		System.out.println("one argument constructor");
//	}
//	
//	public AdditionOfTwoNo(int number1, int number2) {
//		//two argument constructor
//		this();
//		this.number1 = number1;
//		this.number2 = number2;
//		System.out.println("two argument constructor");
//	}	
	public void setData(int number1, int number2) {
		this.number1 = number1;
		this.number2 = number2;
	}
	
	public void calculateResult() {
		this.result = this.number1 + this.number2;
	}
	
	public int getData() {
		return this.result;
	}
	
	public void displayData() {
		System.out.println("num1 = "+ number1 +", num2 = " + number2
				 + ", result = " + result + "\n");
	}
	
	@Override  
    protected void finalize()   
    {   
        System.out.println("finalize method called");   
    }  
}
