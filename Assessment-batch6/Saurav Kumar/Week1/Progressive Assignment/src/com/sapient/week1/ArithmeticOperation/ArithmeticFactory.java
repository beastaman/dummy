package com.sapient.week1.ArithmeticOperation;

public class ArithmeticFactory {
	public static Arithmetic getArithmeticObject(int choice) {
		
		if(choice == 1) return new Add();
		if(choice == 2) return new Sub();
		if(choice == 3) return new Mul();
		return new Div();
	}
}
