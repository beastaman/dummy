package com.dayfour;

public class Demo {

	public static void main(String[] args) {
		
		EmployeeTO emp =new EmployeeTO();
		emp.setAge(22);
		emp.setFirstName("Yogendra Singh ");
		emp.setLastName("Ranawat");
		emp.setSalary(50000);
//		System.out.println(emp.getAge());
//		System.out.println(emp.getFirstName());
//		System.out.println(emp.getLastName());
//		System.out.println(emp.getSalary());
		System.out.println(emp.getClass());
		System.out.println(emp);
		
		
		EmployeeTO emp1 =new EmployeeTO(21,"Raghav ","Kumar",53999);
		System.out.println(emp1);
		
		
		EmployeeTO emp2[] = new EmployeeTO[5];
		TaxCalculation tax= new TaxCalculation();
		for(int i=0;i<5;++i)
		{
			int age = Read.scanner.nextInt();
			String fname= Read.scanner.next();
			String lname= Read.scanner.next();
			double salary = Read.scanner.nextDouble();
			emp2[i]= new EmployeeTO(age,fname,lname,salary);
		}
		for(int i=0;i<5;++i)
		{
			System.out.println(emp2[i]);
			System.out.println(tax.calculateTax(emp2[i]));
		}
	}

}
