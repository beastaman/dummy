package com.sapient.week1.ArithmeticOperation;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ArithmeticByLambdaTesting {
	@Test
	void AddTest() {
		assertEquals(ArithmeticByLambda.performOperation(20, 10, (a, b)->(a+b)), 30);
	}
	
	@Test
	void SubTest() {
		assertEquals(ArithmeticByLambda.performOperation(20, 10, (a, b)->(a-b)), 10);
	}
	
	@Test
	void MulTest() {
		assertEquals(ArithmeticByLambda.performOperation(20, 10, (a, b)->(a*b)), 200);
	}
	
	@Test
	void DivTest() {
		assertEquals(ArithmeticByLambda.performOperation(20, 10, (a, b)->(a/b)), 2);
	}
	
}
