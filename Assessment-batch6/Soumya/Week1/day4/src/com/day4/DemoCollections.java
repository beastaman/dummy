package com.day4;

interface Employee {
	public int calculateIncomeTax();

}

class EmployeeImplement implements Employee {

	@Override
	public int calculateIncomeTax() {

		return 10;
	}

}

public class DemoCollections {

	public static void main(String[] args) {

		Employee obj = new EmployeeImplement();

		System.out.println(obj.calculateIncomeTax());

	}

}
