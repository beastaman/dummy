package com.sapient.day5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UserDefinedExceptionTest {

	@Test
	public void EmpTOTest1() {
		EmployeeTO employeeTo = new Employee(1,"user",10);
	}

}
