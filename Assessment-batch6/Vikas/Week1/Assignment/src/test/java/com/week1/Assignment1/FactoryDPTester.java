package com.week1.Assignment1;

import static org.junit.Assert.*;

import org.junit.Test;

public class FactoryDPTester {

	@Test
	public void Test() {
		Arithmetic operation = new Div();
		operation.calculate(12, 0);
		assertEquals(-1,operation.getData()); //checking for /zero exception
		
	}
	
	@Test
	public void Test1() {
		Arithmetic operation = new Add();
		operation.calculate(34, -22);
		assertEquals(12,operation.getData()); 
		
	}
	@Test
	public void Test2() {
		Arithmetic operation = new Sub();
		operation.calculate(46, -98);
		assertEquals(144,operation.getData()); 
		
	}
	@Test
	public void Test3() {
		Arithmetic operation = new Div();
		operation.calculate(12, 6);
		assertEquals(2,operation.getData()); 
		
	}
	
	@Test
	public void Test4() {
		Arithmetic operation = new Mul();
		operation.calculate(6,0);
		assertEquals(0,operation.getData()); 
		
	}
	
	@Test
	public void Test5() {
		Arithmetic operation = new Mul();
		operation.calculate(122, 100);
		assertEquals(12200,operation.getData()); 
		
	}
}
