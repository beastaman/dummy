package com.week1.day4.collections;

public class DemoEmployeeUse {

	public static void main(String[] args) {

		EmployeeTO employeeTO1 = new EmployeeTO();

		employeeTO1.setAge(20);
		employeeTO1.setFirstName("Wasim");
		employeeTO1.setLastName("Jafar");
		employeeTO1.setSalaly(1000000);

		System.out.println(employeeTO1.toString());

		EmployeeTO employeeTO2 = new EmployeeTO("Wasim", "Jafar", 10000, 22);

		System.out.println(employeeTO2.toString());

		EmployeeTO employeeTO[] = new EmployeeTO[5];

		TaxCalculation taxCalculation = new TaxCalculation();

		for (int i = 0; i < employeeTO.length; i++) {
			employeeTO[i] = new EmployeeTO("User" + i, "Jafar" + i, 100000 + i, 22 + i);
		}

		for (int i = 0; i < employeeTO.length; i++) {
			System.out.println(employeeTO[i]);
			System.out.println(taxCalculation.calculateTax(employeeTO[i]));
		}

		System.out.println(taxCalculation.calculateTax(employeeTO1));

	}
}
