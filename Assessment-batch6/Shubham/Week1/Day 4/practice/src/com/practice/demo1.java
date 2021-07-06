package com.practice;

public class demo1 {

	public static void main(String[] args) {
//			different objects are pojo()
		EmployeeTO emp1 = new EmployeeTO(21, "Shubham", "Agrawal", 100);
		
		EmployeeTO emp[] = new EmployeeTO[5];
		emp[0]=emp1;
		emp[1]=new EmployeeTO(21, "User2", "Agrawal", 100);
		emp[2]=new EmployeeTO(21, "User3", "Agrawal", 100);
		emp[3]=new EmployeeTO(21, "User4", "Agrawal", 100);
		emp[4]=new EmployeeTO(21, "User5", "Agrawal", 100);
//		System.out.println(emp1.getAge());
//		System.out.println(emp1.getFname());
//		System.out.println(emp1.getLname());
//		System.out.println(emp1.getSalary());
		
		TaxCalculation tax=new TaxCalculation();
		for(int i=0;i<emp.length;i++)
		{
			System.out.println(emp[i]);
			System.out.println(tax.calculateTax(emp[i]));
		}
	}

}
