package com.day4;

public class TaxCalculation {

	public int calculateTax(EmployeeTO emp) {
		return (int) (emp.getSalary() * 0.1);
	}

}
