package com.week1.Problem1;

import static org.junit.Assert.*;

import org.junit.Test;

public class FactoryDesignPatterTester {

	@Test
	public void Test() {
		Arithmetic operation = new Div();
		operation.calculate(12, 0);
		assertEquals(-1,operation.getData());
		
	}
	@Test
	public void Test2() {
		Arithmetic operation = new Mul();
		operation.calculate(122, 100);
		assertEquals(12200,operation.getData()); 
		
	}
	@Test
	public void Test3() {
		Arithmetic operation = new Add();
		operation.calculate(34, -22);
		assertEquals(12,operation.getData()); 
		
	}	
}
