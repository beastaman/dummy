package com.sapient;

public class demo1 {
	public static void main(String[]args) 
	{
		//TODO auto generated
		//the different types of object are POJO (Plain Old java object )also called as Transfer Object and it 
        //carries THE DATA FROM one place to other
		//only data members
		
		
		//2nd type of object is : Business Objects which contains only the logics to perform settlements
		// & data is supplied here by POJO(Transfer object)
		
		//3rd type of object is : Data Access Object which contains only the logics to perform settlements
		// & data is supplied here by POJO(Transfer object)
		
		EmployeeTO []employee = new EmployeeTO[5];
		
		employee[0] = new EmployeeTO(22,"Sachin","Kamat",100000);
		employee[1] = new EmployeeTO(29,"Virat","Kohli",20000000);
		employee[2] = new EmployeeTO(36,"MS","Dhoni",30000000);
		employee[3] = new EmployeeTO(34,"Yuvraj","Singh",10000000);
		employee[4] = new EmployeeTO(47,"Sachin","Tendulkar",10000000);
		
		

		TaxCalculation tax= new TaxCalculation();
		
		
		for(int i=0;i<employee.length;i++) {
			System.out.println(employee[i]);
			System.out.println(tax.calculateTax(employee[i]));
		}
			
		
	
		
		
	/**	emp1.setLname(21);
		emp1.setFname("Sachin");
		emp1.setAge("Kamat");
		emp1.setSalary(100000);
		
		System.out.println(emp1.getAge());
		System.out.println(emp1.getFname());
		System.out.println(emp1.getLname());
		 System.out.println(emp1.getSalary());
	**/	 
		//System.out.println(emp1);
			
	}

}
