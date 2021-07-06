package p1;

public class Demo1 {
	
	public static void main(String[] args) {
		
		// The different types of objects are :
		//   POJO (Transfer Object : carry data from one point to another point),
		//   Business Object (contains only logic to perform certain things for this object data is supplied by POJO),
		//   DAO (Data Access Object)
		
		EmployeeTO emp = new EmployeeTO("Emp", "1", 21, 20000);
//		emp.setFname("Emp");
//		emp.setLname("1");
//		emp.setAge(21);
//		emp.setSalary(10000);

//		System.out.println(emp.getFname());
//		System.out.println(emp.getLname());
//		System.out.println(emp.getAge());
//		System.out.println(emp.getSalary());
		System.out.println(emp);
		
		System.out.println("Details of Five Employees");
		EmployeeTO[] emps = new EmployeeTO[5];
		TaxCalculator taxCalculator = new TaxCalculator();
		for (int i=0;i<5;i++) {
			emps[i] = new EmployeeTO("Emp", (i+1) + "", 21+i, (i+1)*10000);
			System.out.print(emps[i]);
			System.out.println(" tax=" + taxCalculator.calculateTax(emps[i]));
		}
	}
	
}
