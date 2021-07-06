package com.package1;

public class TaxCalculation {
	public int calculateTax(EmployeeTO emp) {
		return (int) (emp.getSalary()*10/100);
	}
}
