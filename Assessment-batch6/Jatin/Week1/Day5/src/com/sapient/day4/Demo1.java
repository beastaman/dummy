package com.sapient.day4;

public class Demo1 {

	public static void main(String[] args) { // The different objects are pojo(transfer object( this carries the data
												// from one point to another point
												// The second type of objects are the business object, which contains
												// only the logic , for this object data is supplied by pojo.
												// The 3rd type of object is DAO

		// EmployeeTO emp1 = new EmployeeTO("Jatin", 21, "Singh", 1000);
		// EmployeeTO emp2 = new EmployeeTO("user1", 21, "Singh", 2000);
		// EmployeeTO emp3 = new EmployeeTO("user2", 21, "Singh", 500);
		// EmployeeTO emp4 = new EmployeeTO("user3", 21, "Singh", 4000);
		// EmployeeTO emp5 = new EmployeeTO("user4", 21, "Singh", 100);

		EmployeeTO[] employee = new EmployeeTO[5];

		employee[0] = new EmployeeTO("Jatin", 21, "Singh", 1000);
		employee[1] = new EmployeeTO("user1", 21, "Singh", 2000);
		employee[2] = new EmployeeTO("user2", 21, "Singh", 500);
		employee[3] = new EmployeeTO("user3", 21, "Singh", 4000);
		employee[4] = new EmployeeTO("user4", 21, "Singh", 100);

		TaxCalculation tax = new TaxCalculation();

		for (int i = 0; i < employee.length; i++) {
			System.out.println(employee[i]);
			System.out.println(tax.calculateTax(employee[i]));
		}

		// emp1.setFname("Jatin");
		// emp1.setAge(21);
		// emp1.setLname("Singh");
		// emp1.setSalary(1000);

		// System.out.println(emp1.getFname());
		// System.out.println(emp1.getLname());
		// System.out.println(emp1.getAge());
		// System.out.println(emp1.getSalary());
		// System.out.println(emp1);


	}
}
