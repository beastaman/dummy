package com.day4;

public class Demo1 {

	public static void main(String[] args) {
		// different objects are POJO (transfer object, this will only carry data)
		// 2nd type of objects are business objects, for these objects data is supplied
		// by POJO
		// 3rd type of object is data access object (DAO)

		EmployeeTO emp1 = new EmployeeTO(22, "Soumya", "Dandapat", 1000);
		EmployeeTO emp2 = new EmployeeTO(22, "Wasim", "Jaffar", 1000);
		EmployeeTO emp3 = new EmployeeTO(22, "Nitin", "Kumar", 1000);
		EmployeeTO emp4 = new EmployeeTO(22, "Aman", "Kumar", 1000);
		EmployeeTO emp5 = new EmployeeTO(22, "siddhant", "Kapoor", 1000);

		EmployeeTO[] employees = new EmployeeTO[5];
		employees[0] = new EmployeeTO(22, "Soumya", "Dandapat", 1000);
		employees[1] = new EmployeeTO(22, "Wasim", "Jaffar", 1000);
		employees[2] = new EmployeeTO(22, "Nitin", "Kumar", 1000);
		employees[3] = new EmployeeTO(22, "Aman", "Kumar", 1000);
		employees[4] = new EmployeeTO(22, "siddhant", "Kapoor", 1000);

		TaxCalculation taxCalculator = new TaxCalculation();

		for (int i = 0; i < 5; ++i) {
			System.out.println(employees[i]);
			System.out.println(taxCalculator.calculateTax(employees[i]));
		}
//		emp1.setAge(22);
//		emp1.setFname("Soumya");
//		emp1.setLname("Dandapat");
//		emp1.setSalary(1000);

//		System.out.println(emp1.getAge());
//		System.out.println(emp1.getFname());
//		System.out.println(emp1.getLname());
//		System.out.println(emp1.getSalary());

	}
}
