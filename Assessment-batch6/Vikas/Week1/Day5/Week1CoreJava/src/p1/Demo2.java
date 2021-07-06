package p1;

public class Demo2 {

	public static void main(String[] args) {
		
		String qry = "select fname, lname, salary, age from EmployeeTable where salary>20000";
		
		String array1[] = qry.split("from");
		String array4[] = array1[0].split(" ");
		
		for(int i = 1;i<array4.length;i++) {
			System.out.println(array4[i]);
			System.out.println(" ");
		}
		
		String array2[] = array1[1].split(" ");
		
		System.out.println("table name is : "+ array2[1]);
		
		String array3[] = array1[1].split("where");
		
		System.out.println("where clause is "+ array3[1]);
				
	}

}
