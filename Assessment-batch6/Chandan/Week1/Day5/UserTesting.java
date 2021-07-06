package com.sapient.day5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.sapient.day4.EmployeeTo;

class UserTesting {

	@Test
	public void EmpTOTest1() {
		
		EmployeeTo employeeTo = new EmployeeTo(20, "chandan", "maji", 5548);
		assertEquals(employeeTo.getAge(), 20);
		
	}
	
	@Test
	public void EmpTOTest2() {
		
		EmployeeTo employeeTo = new EmployeeTo(20, "chandan", "maji", 5548);
		assertEquals(employeeTo.getFname(), "chandan");
		
	}
	
	@Test
	public void EmpTOTest3() {
		
		EmployeeTo employeeTo = new EmployeeTo(20, "chandan", "maji", 5548);
		assertEquals(employeeTo.getLname(), "maji");
		
	}
	
	@Test
	public void EmpTOTest4() {
		
		EmployeeTo employeeTo = new EmployeeTo(20, "chandan", "maji", 5548);
		assertEquals(employeeTo.getSalary(), 5548);
		
	}
	
	
	@Test
	public void transactTest1() {
		String msg = Except.transact(10000, 5000);
		
		assertEquals(msg, "Transaction Done");
		
	}
	
	@Test
	public void transactTest2() {
		String msg = Except.transact(1000, 5000);
		
		assertEquals(msg, "Insufficient Balance");
		
	}
	@Test
	public void transactTest3() {
		String msg = Except.transact(-1000, 5000);
		
		assertEquals(msg, "Invalid Balance");
		
	}

}
