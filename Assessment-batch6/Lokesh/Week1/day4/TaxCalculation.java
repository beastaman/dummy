package com.week1.day4;

public class TaxCalculation {

	public double calculateTax(EmployeeTO employeeTO) {

		return employeeTO.getSalaly() * 0.1;

	}
}
