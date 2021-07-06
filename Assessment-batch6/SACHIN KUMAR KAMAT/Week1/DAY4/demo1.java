package com.sapient;

public class Demo2 {

	public static void main(String[] args) 
	
	{
	//	Scanner scanner = new  Scanner(System.in);
		
		String query = "Select Fname,Lname from Table1 where Age=20" ;
		
		String array[] = query.split(" ");
		
		for(String x: array ) {
			System.out.println(x);
		}
		
		String array1[] = query.split("from");
		for(String x: array1 ) {
			System.out.println(x);
		}
		String array2[] = array[1].split("from");
		for(int i=1;i<array2.length;i++ ) {
			System.out.println(array2[i]);
		}
		
		String array3[] = query.split("table1");
			System.out.println(array3[array3.length-1]);

			String array4[] = array1[1].split(" ");
			System.out.println(array4[1]);
			
			System.out.println("table name(s):- \n"+(query.split("from ")[1]).split(" where")[0]+" \n\nwhere condition:- \n"+query.split(" where ")[1]);
	}
}
