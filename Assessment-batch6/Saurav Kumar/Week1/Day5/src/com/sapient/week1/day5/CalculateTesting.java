package com.sapient.week1.day5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculateTesting {

	@Test
	public void AdditionTest() {
		Calculate calc = (a, b)->(a+b);
		int actual = calc.cal(200, 300);
		assertEquals(actual, 500);
	}

	@Test
	public void SubtractionTest() {
		Calculate calc = (a, b)->(a-b);
		int actual = calc.cal(200, 300);
		assertEquals(actual, -100);
	}
	
	@Test
	public void MultiplicationTest() {
		Calculate calc = (a, b)->(a*b);
		int actual = calc.cal(20, 30);
		assertEquals(actual, 600);
	}
	
	@Test
	public void DivisionTest() {
		Calculate calc = (a, b)->(a/b);
		int actual = calc.cal(30, 4);
		assertEquals(actual, 7);
	}
}
