package com.sapient.day5;

public class ExceptionsDemo {

	public static String fun(EmployeeTO e1, EmployeeTO e2) {
		if (e1.getSalary() < e2.getSalary())
			return "employee 1 is earning more";
		else
			return "employee 2 is earning more";
	}

	public static void main(String[] args) {
		EmployeeTO e1 = new EmployeeTO("user1", 12, 563738);
		EmployeeTO e2 = new EmployeeTO("user2", 43, 3738);

		try {
			fun(e1, e2);
		} catch (Exception e) {
			System.out.println("Employee is not present");
		}
	}
}
