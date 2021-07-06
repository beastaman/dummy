package com.sapient.day5;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ExceptionsDemoTest {

	@Test
	void test_for_checking_employee1_earn_more() {
		EmployeeTO e1 = new EmployeeTO("user1", 12, 563);
		EmployeeTO e2 = new EmployeeTO("user2", 43, 3738);
		ExceptionsDemo exp = new ExceptionsDemo();

		String actual = exp.fun(e1, e2);

		assertEquals(actual, "employee 1 is earning more");
	}

	@Test
	void test_for_checking_employe2_earn_more() {
		EmployeeTO e1 = new EmployeeTO("user1", 12, 563344);
		EmployeeTO e2 = new EmployeeTO("user2", 43, 3738);
		ExceptionsDemo exp = new ExceptionsDemo();

		String actual = exp.fun(e1, e2);

		assertEquals(actual, "employee 2 is earning more");
	}
}
