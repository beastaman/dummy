package com.sapient.week1.day5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UserDefinedExceptionTesting {

	@Test
	public void empTOTest1() {
		
		EmployeeTO employeeTO = new EmployeeTO(11, "user", 90);
		assertEquals(employeeTO.getId(), 11);
		
	}

	@Test
	public void empTOTest2() {
		
		EmployeeTO employeeTO = new EmployeeTO(11, "user", 90);
		assertEquals(employeeTO.getName(), "user");
		
	}
	
	@Test
	public void empTOTest3() {
		
		EmployeeTO employeeTO = new EmployeeTO(11, "user", 90);
		assertEquals(employeeTO.getAge(), 90);
		
	}
	
	@Test
	public void empTOTest4() {
		
		EmployeeTO employeeTO = new EmployeeTO(11, "user", 90);
		String actual = "EmployeeTO [id=" + employeeTO.getId() + ", name=" + employeeTO.getName() + ", age=" + employeeTO.getAge() + "]";
		assertEquals(employeeTO.toString(), actual);
		
	}
	
	@Test
	public void UserDefinedExceptionTest() {
		
		demo3 obj = new demo3();
		String actual = obj.transaction(8921, 3812);
		
		assertEquals(actual, "Transaction successful");
	}
	
	@Test
	public void UserDefinedExceptionTest2() {
		
		demo3 obj = new demo3();
		String actual = obj.transaction(8921, 39812);
		
		assertEquals(actual, "Invalid transaction");
	}
	
}












