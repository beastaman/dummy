package assignment.sapient.week1.q1.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import assignment.sapient.week1.q1.logic.Arithmetic;
import assignment.sapient.week1.q1.logic.ArithmeticFactory;
import assignment.sapient.week1.q1.logic.DivideByZeroException;

class ArithmeticTester {

	@ParameterizedTest
	@CsvSource({"1,2,3", "5,4,9", "7,11,18", "45,16,61", "78,19,97"})
	void testAdd(int num1, int num2, double expected) {
		Arithmetic arithmetic = ArithmeticFactory.getArithmeticOperator(1);
		arithmetic.setData(num1, num2);
		try {
			arithmetic.calculate();
		}
		catch (DivideByZeroException dz) {
			fail("DivideByZeroException occurred");
		}
		
		assertEquals(arithmetic.getResult(), expected);
		
	}
	
	
	@ParameterizedTest
	@CsvSource({"1,2,-1", "5,4,1", "7,11,-4", "45,16,29", "78,19,59"})
	void testSub(int num1, int num2, double expected) {
		Arithmetic arithmetic = ArithmeticFactory.getArithmeticOperator(2);
		arithmetic.setData(num1, num2);
		try {
			arithmetic.calculate();
		}
		catch (DivideByZeroException dz) {
			fail("DivideByZeroException occurred");
		}
		
		assertEquals(arithmetic.getResult(), expected);
		
	}
	
	
	@ParameterizedTest
	@CsvSource({"1,2,2", "5,4,20", "7,11,77", "45,16,720", "78,19,1482"})
	void testMul(int num1, int num2, double expected) {
		Arithmetic arithmetic = ArithmeticFactory.getArithmeticOperator(3);
		arithmetic.setData(num1, num2);
		try {
			arithmetic.calculate();
		}
		catch (DivideByZeroException dz) {
			fail("DivideByZeroException occurred");
		}
		
		assertEquals(arithmetic.getResult(), expected);
		
	}
	
	
	@ParameterizedTest
	@CsvSource({"1,2,0.50", "5,4,1.25", "7,11,0.64", "45,16,2.81", "78,19,4.11"})
	void testDiv(int num1, int num2, double expected) {
		Arithmetic arithmetic = ArithmeticFactory.getArithmeticOperator(4);
		arithmetic.setData(num1, num2);
		try {
			arithmetic.calculate();
		}
		catch (DivideByZeroException dz) {
			fail("DivideByZeroException occurred");
		}
		
		assertEquals(arithmetic.getResult(), expected);
		
	}
	
	
	@Test
	void divideExceptionTest() {
		Arithmetic arithmetic = ArithmeticFactory.getArithmeticOperator(4);
		arithmetic.setData(45, 0);
		
		assertThrows(DivideByZeroException.class, arithmetic::calculate);
	}
	
	

}
