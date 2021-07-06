package com.factory;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class TestFactory {

	static double num1;
	static double num2;
	static double decimalPlace;

	Arithmetic arithmetic;
	static List<Calculator> calculators;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		num1 = 100.0;
		num2 = 12.5;
		decimalPlace = 0.0001d;
		calculators = Arrays.asList((a, b) -> a + b, (a, b) -> a - b, (a, b) -> a * b, (a, b) -> a / b);
	}

	@Test
	public void testAddition() {
		int choice = 1;

		arithmetic = FactoryDesign.getFactoryObject(choice);
		arithmetic.setData(num1, num2);
		arithmetic.calculate();

		assertEquals(arithmetic.getNum3(), 112.5, decimalPlace);
	}

	@Test
	public void testSubtraction() {
		int choice = 2;

		arithmetic = FactoryDesign.getFactoryObject(choice);
		arithmetic.setData(num1, num2);
		arithmetic.calculate();

		assertEquals(arithmetic.getNum3(), 87.5, decimalPlace);
	}

	@Test
	public void testMultiplication() {
		int choice = 3;

		arithmetic = FactoryDesign.getFactoryObject(choice);
		arithmetic.setData(num1, num2);
		arithmetic.calculate();

		assertEquals(arithmetic.getNum3(), 1250, decimalPlace);
	}

	@Test
	public void testDivision() {
		int choice = 4;

		arithmetic = FactoryDesign.getFactoryObject(choice);
		arithmetic.setData(num1, num2);
		arithmetic.calculate();

		assertEquals(arithmetic.getNum3(), 8, decimalPlace);
	}

	@Test
	public void testAdditionWithLambdaExpression() {
		int choice = 1;

		arithmetic = FactoryDesign.getFactoryObject(choice);
		arithmetic.setData(num1, num2);
		arithmetic.calculate(calculators.get(choice - 1));

		assertEquals(arithmetic.getNum3(), 112.5, decimalPlace);
	}

	@Test
	public void testSubtractionWithLambdaExpression() {
		int choice = 2;

		arithmetic = FactoryDesign.getFactoryObject(choice);
		arithmetic.setData(num1, num2);
		arithmetic.calculate(calculators.get(choice - 1));

		assertEquals(arithmetic.getNum3(), 87.5, decimalPlace);
	}

	@Test
	public void testMultiplicationWithLambdaExpression() {
		int choice = 3;

		arithmetic = FactoryDesign.getFactoryObject(choice);
		arithmetic.setData(num1, num2);
		arithmetic.calculate(calculators.get(choice - 1));
		assertEquals(arithmetic.getNum3(), 1250, decimalPlace);
	}

	@Test
	public void testDivisionWithLambdaExpression() {
		int choice = 4;

		arithmetic = FactoryDesign.getFactoryObject(choice);
		arithmetic.setData(num1, num2);
		arithmetic.calculate(calculators.get(choice - 1));

		assertEquals(arithmetic.getNum3(), 8, decimalPlace);
	}

}
