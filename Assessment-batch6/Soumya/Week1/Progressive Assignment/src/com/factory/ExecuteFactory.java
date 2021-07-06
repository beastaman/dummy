package com.factory;

import java.util.Arrays;
import java.util.List;

public class ExecuteFactory {

	public static void main(String[] args) {
		int choice = 4;
		double num1 = 100.0, num2 = 25.0;

		// Factory design pattern
		Arithmetic arithmetic = FactoryDesign.getFactoryObject(choice);
		arithmetic.setData(num1, num2);
		arithmetic.calculate();
		arithmetic.display();

		// Lambda expression:
		List<Calculator> calculators = Arrays.asList((a, b) -> a + b, (a, b) -> a - b, (a, b) -> a * b,
				(a, b) -> a / b);
		int choice2 = 4;
		Arithmetic arithmetic1 = FactoryDesign.getFactoryObject(choice2);
		arithmetic1.setData(num1, num2);
		arithmetic1.calculate(calculators.get(choice2 - 1));
		arithmetic1.display();

	}

}
