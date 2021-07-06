package com.week1.day4.designPattern;

import com.week1.day4.utilities.Read;

class CalculationFactory {

	public static Calculation getFactory(int choice, int num1, int num2) {

		if (choice == 1) {
			return new Addition(num1, num2);
		}

		else if (choice == 2) {
			return new Subtraction(num1, num2);
		}

		else if (choice == 3) {
			return new Multiplication(num1, num2);
		}

		else {
			return new Division(num1, num2);
		}

	}

	public static Calculation addition, subtraction, multiplication, division;

	public static Calculation getFactorySingleton(int choice, int num1, int num2) {

		if (choice == 1) {
			if (addition == null)
				addition = new Addition();

			addition.setValues(num1, num2);

			return addition;
		}

		else if (choice == 2) {
			if (subtraction == null)
				subtraction = new Subtraction();

			subtraction.setValues(num1, num2);
			return subtraction;
		}

		else if (choice == 3) {
			if (multiplication == null)
				multiplication = new Multiplication();

			multiplication.setValues(num1, num2);

			return multiplication;
		}

		else {
			if (division == null)
				division = new Division();

			division.setValues(num1, num2);

			return division;
		}

	}

}

public class DemoFactoryDP {

	public static void main(String[] args) {

		int choice = Read.scanner.nextInt();
		int num1 = Read.scanner.nextInt();
		int num2 = Read.scanner.nextInt();

		Calculation calculation = CalculationFactory.getFactory(choice, num1, num2);

		calculation.compute();
		calculation.displayData();
	}

}
