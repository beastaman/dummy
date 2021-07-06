package com.week1.Problem1;

import static org.junit.Assert.*;

import org.junit.Test;

public class LambdaExpressionTester {

	@Test
	public void Test() {
		LambdaExpression exp1 = new LambdaExpression();
		assertEquals(-1,exp1.getInstance(323,0,'/'));
	}
	@Test
	public void Test2() {
		LambdaExpression exp1 = new LambdaExpression();
		assertEquals(-80,exp1.getInstance(-64,16,'-'));
	}
	@Test
	public void Test3() {
		LambdaExpression exp1 = new LambdaExpression();
		assertEquals(-110,exp1.getInstance(-55,2,'*'));
	}
	
	
}
