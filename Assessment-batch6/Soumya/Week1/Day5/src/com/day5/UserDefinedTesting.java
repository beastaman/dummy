package com.day5;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class UserDefinedTesting {

	@Test
	public void CheckEmpTOId() {

		EmployeeTO employeeTO = new EmployeeTO(1, "user", 10);
		assertEquals(employeeTO.getEmpId(), 1);

	}

	@Test
	public void CheckEmpTOName() {

		EmployeeTO employeeTO = new EmployeeTO(1, "user", 10);
		assertEquals(employeeTO.getName(), "user");

	}

	@Test
	public void CheckEmpTOAge() {

		EmployeeTO employeeTO = new EmployeeTO(1, "user", 10);
		assertEquals(employeeTO.getAge(), 10);
	}

	@Test
	public void CheckEmpTOData() {

		EmployeeTO employeeTO = new EmployeeTO(1, "user", 10);
		String expected = "EmployeeTO [empId=" + employeeTO.getEmpId() + ", name=" + employeeTO.getName() + ", age="
				+ employeeTO.getAge() + "]";
		assertEquals(employeeTO.toString(), expected);

	}

	@Test
	public void CheckCorrectTransaction() {
		DemoException2 demo2 = new DemoException2();
		String actual = demo2.fun1(10000, 5000);
		String expected = "Transaction will be done shortly";
		assertEquals(expected, actual);

	}

	@Test
	public void CheckInsufficientBalance() {
		DemoException2 demo2 = new DemoException2();
		String actual = demo2.fun1(10000, 50000);
		String expected = "Insufficient Balance, Transaction Cancelled.";
		assertEquals(expected, actual);
	}

	@Test
	public void CheckNegativeBalance() {
		DemoException2 demo2 = new DemoException2();
		String actual = demo2.fun1(-10000, 50000);
		String expected = "Negative balance not possible";
		assertEquals(expected, actual);
	}
}
