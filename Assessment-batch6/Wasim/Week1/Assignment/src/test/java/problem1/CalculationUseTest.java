package test.java.problem1;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

import org.junit.jupiter.api.Test;

import main.java.problem1.*;

class CalculationUseTest {

	double num1;
	double num2;

	Arithmetic arithmetic;
	List<Calculator> calculators;

	public CalculationUseTest() {
		this.num1 = 100;
		this.num2 = 60;
		calculators = Arrays.asList((a, b) -> a + b, (a, b) -> a - b, (a, b) -> a * b, (a, b) -> a / b);
	}

	@Test
	public void addition() {
		int choice = 1;
		try {
			arithmetic = FactoryClass.getFactoryObject(choice);
			arithmetic.setData(num1, num2);
			arithmetic.calculate();

			assertEquals(arithmetic.getNum3(), 160);
		} catch (Exception e) {
		}

	}

	@Test
	public void subtraction() {
		int choice = 2;

		try {
			arithmetic = FactoryClass.getFactoryObject(choice);
			arithmetic.setData(num1, num2);
			arithmetic.calculate();

			assertEquals(arithmetic.getNum3(), 40);
		} catch (Exception e) {
		}
	}

	@Test
	public void multiplication() {
		int choice = 3;

		try {
			arithmetic = FactoryClass.getFactoryObject(choice);
			arithmetic.setData(num1, num2);
			arithmetic.calculate();

			assertEquals(arithmetic.getNum3(), 6000);
		} catch (Exception e) {
		}
	}

	@Test
	public void division() {
		int choice = 4;

		try {
			arithmetic = FactoryClass.getFactoryObject(choice);
			arithmetic.setData(num1, num2);
			arithmetic.calculate();

			assertEquals(arithmetic.getNum3(), 5.0 / 3);
		} catch (Exception e) {
		}
	}

	@Test
	public void divisionExceptionThrown() {
		int choice = 4;
		boolean thrown = false;

		try {
			arithmetic = FactoryClass.getFactoryObject(choice);
			arithmetic.setData(num1, 0);
			arithmetic.calculate();

		} catch (Exception e) {
			thrown = true;
		}
		assertTrue(thrown);
	}

	@Test
	public void additionWithLambdaExpression() {
		int choice = 1;
		try {
			arithmetic = FactoryClass.getFactoryObject(choice);
			arithmetic.setData(num1, num2);
			arithmetic.calculate(calculators.get(choice - 1));

			assertEquals(arithmetic.getNum3(), 160);
		} catch (Exception e) {
		}
	}

	@Test
	public void subtractionWithLambdaExpression() {
		int choice = 2;

		try {
			arithmetic = FactoryClass.getFactoryObject(choice);
			arithmetic.setData(num1, num2);
			arithmetic.calculate(calculators.get(choice - 1));

			assertEquals(arithmetic.getNum3(), 40);
		} catch (Exception e) {
		}
	}

	@Test
	public void multiplicationWithLambdaExpression() {
		int choice = 3;

		try {
			arithmetic = FactoryClass.getFactoryObject(choice);
			arithmetic.setData(num1, num2);
			arithmetic.calculate(calculators.get(choice - 1));

			assertEquals(arithmetic.getNum3(), 6000);
		} catch (Exception e) {
		}
	}

	@Test
	public void divisionWithLambdaExpression() {
		int choice = 4;

		try {
			arithmetic = FactoryClass.getFactoryObject(choice);
			arithmetic.setData(num1, num2);
			arithmetic.calculate(calculators.get(choice - 1));

			assertEquals(arithmetic.getNum3(), 5.0 / 3);
		} catch (Exception e) {
		}
	}

	@Test
	public void divisionWithLambdaExpressionExceptionThrown() {
		int choice = 4;
		boolean thrown = false;

		try {
			arithmetic = FactoryClass.getFactoryObject(choice);
			arithmetic.setData(num1, 0);
			arithmetic.calculate(calculators.get(choice - 1));

		} catch (Exception e) {
			thrown = true;
		}
		assertTrue(thrown);
	}

}
