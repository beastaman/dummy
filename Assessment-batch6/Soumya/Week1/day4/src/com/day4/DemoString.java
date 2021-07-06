package com.day4;

public class DemoString {

	public static void main(String[] args) {
		String querry = "Select fname, lname, age from table1 where age = 20";
		// Scanner sc = new Scanner(System.in);

		String array[] = querry.split(" ");

//		for (String x : array) {
//			System.out.println(x);
//		}

		String array1[] = querry.split("from");

		for (String x : array1) {
			System.out.println(x);
		}

		String array2[] = array1[0].split(" ");
		for (int i = 1; i < array2.length; ++i) {
			System.out.println(array2[i]);
		}

//		String array3[] = querry.split("table1");
//		System.out.println(array3[array3.length - 1]);
//
//		String array4[] = array1[1].split(" ");
//		System.out.println(array4[1]);

		System.out.println("table name(s):- \n" + (querry.split("from ")[1]).split(" where")[0]
				+ " \n\nwhere condition:- \n" + querry.split(" where ")[1]);

	}

}
