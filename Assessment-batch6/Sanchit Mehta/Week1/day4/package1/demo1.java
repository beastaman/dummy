package com.package1;

import java.util.ArrayList;

public class demo1 {

	public static void main(String[] args) {
		//POJO => Plain Old Java Object (carries data from 1 point to another point)
		//this has only data members
		
		//BO (Business Object) => Only Logic To perform certain operations
		//for BO, object is supplied by POJO
		
		//DAO => Data Access Object
		//TO => Transfer Object
		
		TaxCalculation tax = new TaxCalculation();
		ArrayList<EmployeeTO> employeeList= new ArrayList<EmployeeTO>();
		for(int i=0;i<5;i++) {
			EmployeeTO employee = new EmployeeTO(22+i,99952+50*i,"userFname"+Integer.toString(i),"userLname"+Integer.toString(i));
			employeeList.add(employee);
			System.out.println(tax.calculateTax(employee));
			
		}
		
		System.out.println(employeeList);
		EmployeeTO emp1 = new EmployeeTO();	//default constructor
		
		//setting data of Transfer Object using setters
//		EmployeeTO emp1=new EmployeeTO();
		emp1.setAge(22);
		emp1.setFname("Sanchit");
		emp1.setLname("Mehta");
		emp1.setSalary(99952);
//		getting data from TO
		
		
		// 1 ====> using getters
//		System.out.println(employee.getAge());
//		System.out.println(employee.getFname());
//		System.out.println(employee.getLname());
//		System.out.println(employee.getSalary());
		
		
//		2 ====> using toString method
		System.out.println(emp1);	//using toString Method
		
		

	}

}
