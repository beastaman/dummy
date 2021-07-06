package p2;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EmployeeTesting {

	@Test
	public void Emptest1() {
		EmployeeTO employeeTO = new EmployeeTO(1,"userf1","userl1",25,56000);
		assertEquals("userf1", employeeTO.getFname());
	}
	
	
	@Test
	public void Emptest2() {
		EmployeeTO employeeTO = new EmployeeTO(2,"userf2","userl2",21,66000);
		assertEquals("userl2", employeeTO.getLname());
	}
	
	@Test
	public void Emptest3() {
		EmployeeTO employeeTO = new EmployeeTO(3,"userf3","userl3",22,87000);
		assertEquals(22, employeeTO.getAge());
	}
	
	@Test
	public void Emptest4() {
		EmployeeTO employeeTO = new EmployeeTO(4,"userf4","userl4",24,55000);
		assertEquals(55000, employeeTO.getSalary());
	}
	
	@Test
	public void Emptest5() {
		EmployeeTO employeeTO = new EmployeeTO(5,"userf5","userl5",-7,57400);
		assertEquals("Age should be a positive number!", employeeTO.checkAge());
	}
	
	@Test
	public void Emptest6() {
		EmployeeTO employeeTO = new EmployeeTO(6,"userf5","userl5",-1,-1);
		assertEquals("Age should be a positive number!", employeeTO.checkAge());
		assertEquals("Salary amount should be a positive number!", employeeTO.checkSalary());
	}
	
//	@Test
//	public void Demo4Test() {
//		ExceptionExample example = new ExceptionExample();
//		assertEquals("Transaction is under process",example.func1());
//	}
//	
	@Test
	public void Demo4Test1() {
		ExceptionExample example = new ExceptionExample();
		assertEquals("Amount should be greater than zero!", example.func1());
	}

}
