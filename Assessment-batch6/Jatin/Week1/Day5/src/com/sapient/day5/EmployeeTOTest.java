package com.sapient.day5;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class EmployeeTOTest {

	@Test
	void test_for_checking_name() {
		EmployeeTO employee = new EmployeeTO("User1", 12, 12244);

		assertEquals(employee.getFname(), "User1");
	}

	@Test
	void test_for_checking_age() {
		EmployeeTO employee = new EmployeeTO("User1", 12, 12244);

		assertEquals(employee.getAge(), 12);
	}

	@Test
	void test_for_checking_salary() {
		EmployeeTO employee = new EmployeeTO("User1", 12, 12244);

		assertEquals(employee.getSalary(), 12244);
	}

}
