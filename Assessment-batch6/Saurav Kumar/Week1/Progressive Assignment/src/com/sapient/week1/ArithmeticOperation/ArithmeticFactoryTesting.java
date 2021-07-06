package com.sapient.week1.ArithmeticOperation;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArithmeticFactoryTesting {

	@Test
	void AddTest() {
		Arithmetic obj = ArithmeticFactory.getArithmeticObject(1);
		obj.setData(30, 20);
		obj.calculate();
		
		assertEquals(obj.num3, 50);
	}
	
	@Test
	void SubTest() {
		Arithmetic obj = ArithmeticFactory.getArithmeticObject(2);
		obj.setData(30, 20);
		obj.calculate();
		
		assertEquals(obj.num3, 10);
	}
	
	@Test
	void MulTest() {
		Arithmetic obj = ArithmeticFactory.getArithmeticObject(3);
		obj.setData(30, 20);
		obj.calculate();
		
		assertEquals(obj.num3, 600);
	}
	
	@Test
	void DivTest() {
		Arithmetic obj = ArithmeticFactory.getArithmeticObject(4);
		obj.setData(30, 20);
		obj.calculate();
		
		assertEquals(obj.num3, 1);
	}
	
	

}
