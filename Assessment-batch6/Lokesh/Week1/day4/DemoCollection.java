package com.week1.day4;

interface Employee {
	public int calculateIncomeTax();

}

class EmployeeImplement implements Employee {

	@Override
	public int calculateIncomeTax() {

		return 10;
	}

}

public class DemoCollection {

	public static void main(String[] args) {

		Employee obj = new EmployeeImplement();

		System.out.println(obj.calculateIncomeTax());

	}

}
