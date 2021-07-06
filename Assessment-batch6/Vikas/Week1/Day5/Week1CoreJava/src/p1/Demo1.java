package p1;

public class Demo1 {

	public static void main(String[] args) {
		
//		EmployeeTO obj1 = new EmployeeTO(25,"vikas","malinda",50000);//TO stand for transfer object
//		EmployeeTO obj2 = new EmployeeTO(21,"lokesh","shankar",60000);
//		EmployeeTO obj3 = new EmployeeTO(23,"pankaj","dahiya",30000);
//		EmployeeTO obj4 = new EmployeeTO(24,"aritra","mustafi",20000);
//		EmployeeTO obj5 = new EmployeeTO(21,"sachin","kamat",40000);
//		obj.setFname("John");
//		obj.setLname("Doe");
//		obj.setAge(25);
//		obj.setSalary(50000);
		
		EmployeeTO obj[] = new EmployeeTO[5];
		obj[0] = new EmployeeTO(25,"vikas","malinda",50430);//TO stand for transfer object
		obj[1] = new EmployeeTO(21,"lokesh","shankar",66000);
		obj[2] = new EmployeeTO(23,"pankaj","dahiya",30500);
		obj[3] = new EmployeeTO(24,"aritra","mustafi",21000);
		obj[4] = new EmployeeTO(21,"sachin","kamat",40900);
		
		TaxCalculation taxcalulator = new TaxCalculation();
		
		int i = 0;
		while(i<obj.length) {
			System.out.println(obj[i].getFname());
			System.out.println(obj[i].getLname());
			System.out.println(obj[i].getAge());
			System.out.println(obj[i].getSalary());
			//System.out.println(obj);
			System.out.println(taxcalulator.calcuateTax(obj[i].getSalary()));
			System.out.println();
			i++;
		}
	}

}
