package main.java.problem1;

import java.util.*;

public class CalculationUse {

	public static void main(String[] args) {

		int choice = 4;
		double num1 = 100;
		double num2 = 0;

		// Factory design pattern
		try {
			Arithmetic arithmetic = FactoryClass.getFactoryObject(choice);
			arithmetic.setData(num1, num2);
			arithmetic.calculate();
			arithmetic.display();
		} catch (DivisionByZeroException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {

		}

		try {
			// Lambda expression:
			List<Calculator> calculators = Arrays.asList((a, b) -> a + b, (a, b) -> a - b, (a, b) -> a * b,
					(a, b) -> a / b);

			Arithmetic arithmetic1 = FactoryClass.getFactoryObject(choice);
			arithmetic1.setData(num1, num2);
			arithmetic1.calculate(calculators.get(choice - 1));
			arithmetic1.display();
		} catch (DivisionByZeroException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {

		}

	}

}
