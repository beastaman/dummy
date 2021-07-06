package com.week1.Assignment1;

import static org.junit.Assert.*;

import org.junit.Test;

public class LambdaExpTester {

	@Test
	public void Test() {
		LambdaExp1 exp1 = new LambdaExp1();
		assertEquals(-1,exp1.getInstance(323,0,'/'));
	}
	
	@Test
	public void Test1() {
		LambdaExp1 exp1 = new LambdaExp1();
		assertEquals(24,exp1.getInstance(6,4,'*'));
		
	}
	@Test
	public void Test2() {
		LambdaExp1 exp1 = new LambdaExp1();
		assertEquals(-11,exp1.getInstance(-18,7,'+'));
	}
	@Test
	public void Test3() {
		LambdaExp1 exp1 = new LambdaExp1();
		assertEquals(-1,exp1.getInstance(99,100,'-'));
	}
	
	@Test
	public void Test4() {
		LambdaExp1 exp1 = new LambdaExp1();
		assertEquals(-110,exp1.getInstance(-55,2,'*'));
	}
	
	@Test
	public void Test5() {
		LambdaExp1 exp1 = new LambdaExp1();
		assertEquals(-80,exp1.getInstance(-64,16,'-'));
	}
}
