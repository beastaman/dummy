package com.dayfive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.dayfour.EmployeeTO;

class UserDefinedExceptionTesting {
	
	@Test
	public void EmpTOTest1() {
		
		EmployeeTO employeeTO = new EmployeeTO(22,"User1","sname1",52000);
		assertEquals(employeeTO.getAge() , 22);
		
	}

	@Test
	public void EmpTOTest2() {

		EmployeeTO employeeTO = new EmployeeTO(22,"User1","sname1",52000);
		assertEquals(employeeTO.getFirstName(), "User1");

	}

	@Test
	public void EmpTOTest3() {

		EmployeeTO employeeTO = new EmployeeTO(22,"User1","sname1",52000);
		assertEquals(employeeTO.getSalary(), 52000);
	}
	
	@Test
	public void EmpTOTest4() {

		EmployeeTO employeeTO = new EmployeeTO(22,"User1","sname1",52000);
		assertEquals(employeeTO.getLastName() ,"sname1");
	}

	@Test
	public void EmpTOTest5() {

		EmployeeTO employeeTO = new EmployeeTO(22,"User1","sname1",52000);
		String expected = "EmployeeTO [age=" + employeeTO.getAge() + ", firstName=" + 
		employeeTO.getFirstName() + ", lastName=" + employeeTO.getLastName() + ", salary=" + employeeTO.getSalary()
				+ "]";
		assertEquals(employeeTO.toString(), expected);
		
	}

	@Test
	public void UserDefinedExceptionTest1() {
		ExceptionDemo demo = new ExceptionDemo();
		String actual = demo.f1(10000,5000);
		String expected = "Please wait, transaction is under process !! ";
		assertEquals(expected, actual);

	}

	@Test
	public void UserDefinedExceptionTest2() {
		ExceptionDemo demo = new ExceptionDemo();
		String actual = demo.f1(10000,50000);
		String expected = "Insufficient balance, your transaction failed !!! ";
		assertEquals(expected, actual);
	}

	@Test
	public void UserDefinedExceptionTest3() {
		ExceptionDemo demo = new ExceptionDemo();
		String actual = demo.f1(-10000, 50000);
		String expected = "Balance can't be negative";
		assertEquals(expected, actual);
	}
	
}
