package com.sapient.day5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UserDefinedExceptionTesting {
	
	@Test
	public void EmpTOTest1() {
		
		EmployeeTO employeeTO = new EmployeeTO(1, "user", 10);
		assertEquals(employeeTO.getEmpId(), 1);
		
	}

	@Test
	public void EmpTOTest2() {

		EmployeeTO employeeTO = new EmployeeTO(1, "user", 10);
		assertEquals(employeeTO.getName(), "user");

	}

	@Test
	public void EmpTOTest3() {

		EmployeeTO employeeTO = new EmployeeTO(1, "user", 10);
		assertEquals(employeeTO.getAge(), 10);
	}

	@Test
	public void EmpTOTest4() {

		EmployeeTO employeeTO = new EmployeeTO(1, "user", 10);
		String expected = "EmployeeTO [empId=" + employeeTO.getEmpId() + ", name=" + employeeTO.getName() + ", age="
				+ employeeTO.getAge() + "]";
		assertEquals(employeeTO.toString(), expected);
		
	}

	@Test
	public void UserDefinedExceptionTest1() {
		ExceptionDemo2 demo2 = new ExceptionDemo2();
		String actual = demo2.fun1(10000, 5000);
		String expected = "Please wait, transactions is under process";
		assertEquals(expected, actual);

	}

	@Test
	public void UserDefinedExceptionTest2() {
		ExceptionDemo2 demo2 = new ExceptionDemo2();
		String actual = demo2.fun1(10000, 50000);
		String expected = "Balance insufficient, your transactions is cancelled";
		assertEquals(expected, actual);
	}

	@Test
	public void UserDefinedExceptionTest3() {
		ExceptionDemo2 demo2 = new ExceptionDemo2();
		String actual = demo2.fun1(-10000, 50000);
		String expected = "Balance cannot be negative";
		assertEquals(expected, actual);
	}
	
}
