package com.dayfour;

public class TaxCalculation {
	public double calculateTax(EmployeeTO emp) {
		return emp.getSalary() *  0.1 ;
	}
}
