package com.sapient.day4;

import java.util.Scanner;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		EmployeeTo emps[] = new EmployeeTo[2];
		
		for(int i=0; i<emps.length; i++) {
			System.out.println(String.format("Employee %d Details", (i+1)));
			System.out.print("Age: ");
			int age = scanner.nextInt();
			scanner.nextLine();
			System.out.print("First Name: ");
			String fname = scanner.nextLine();
			System.out.print("Last Name: ");
			String lname = scanner.nextLine();
			System.out.print("Salary: ");
			int salary = scanner.nextInt();
			
			emps[i] = new EmployeeTo(age, fname, lname, salary);
			
		}
		
		TaxCalculation tax = new TaxCalculation();
		
		System.out.println("\nDetails of Emplyees");
		for(int i=0; i<emps.length; i++) {
			System.out.println(emps[i]);
			System.out.println("Tax = " + tax.calculateTax(emps[i]));
		}
		
		
//		EmployeeTo emp = new EmployeeTo(21, "Chandan", "Maji", 19999);
		
//		emp.setAge(21);
//		emp.setFname("Chandan");
//		emp.setLname("Maji");
//		emp.setSalary(19999);
		
//		System.out.println(emp.getAge());
//		System.out.println(emp.getFname());
//		System.out.println(emp.getLname());
//		System.out.println(emp.getSalary());
		
//		System.out.println(emp);
		

	}

}
