package com.sapient.day5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UserDefinedExceptionTesing {

	@Test
	void test() {
		EmployeeTO e1=new EmployeeTO(1, "Shubham", 21);
		int expectedage=21;
		int actualage=e1.getAge();
		assertEquals(expectedage, actualage);
	}
	@Test
	void test2() {
		EmployeeTO e1=new EmployeeTO(1, "Shubham", 21);
		String expected="Shubham";
		String actual=e1.getEmpName();
		assertEquals(expected, actual);
	}
	@Test
	void test3() {
		EmployeeTO e1=new EmployeeTO(1, "Shubham", 21);
		int expectedage=1;
		int actualage=e1.getEmpId();
		assertEquals(expectedage, actualage);
	}
	@Test
	void test4() {
		String actual=ExceptionDemo2.main(null);
		String expected="Balance Insufficient, your transaction is cancelled";
		assertEquals(expected, actual);
		
	}
	

}
