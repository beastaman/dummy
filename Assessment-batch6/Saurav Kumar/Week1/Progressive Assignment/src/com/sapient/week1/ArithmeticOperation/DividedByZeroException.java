package com.sapient.week1.ArithmeticOperation;

public class DividedByZeroException extends Exception{
	public DividedByZeroException() {
		super("Dividing a number by zero is not valid");
	}
}
