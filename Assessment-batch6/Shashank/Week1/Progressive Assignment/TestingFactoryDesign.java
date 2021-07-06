package Assignment;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestingFactoryDesign {

	@Test
	public void Test() {
		Arithmetic operation = new Division(12,2);
		operation.calculate();
		assertEquals(-1,operation.getData());
		
	}
	@Test
	public void Test2() {
		Arithmetic operation = new Multiplication(68,100);
		operation.calculate();
		assertEquals(6800,operation.getData()); 
		
	}
	@Test
	public void Test3() {
		Arithmetic operation = new Addition(14,20);
		operation.calculate();
		assertEquals(34,operation.getData()); 
		
	}
	@Test
	public void Test4() {
		Arithmetic operation = new Subtraction(14,20);
		operation.calculate();
		assertEquals(-6,operation.getData()); 
		
	}

}
