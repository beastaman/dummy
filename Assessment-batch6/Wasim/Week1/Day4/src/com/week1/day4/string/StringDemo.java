package com.week1.day4.string;

public class StringDemo {

	public static void main(String[] args) {

		String query = "Select fname, lname from table1 , table2 where table1.uid = table2.uid";

		String[] arr = query.split(" ");

		System.out.println("----------------");

		for (String string : arr) {
			System.out.println(string);
		}

		System.out.println("----------------");

		String[] array1 = query.split("from");

		for (String string : array1) {
			System.out.println(string);
		}

		System.out.println("----------------");

		String array2[] = array1[0].split(" ");

		for (int i = 1; i < array2.length; i++) {
			System.out.println(array2[i]);
		}

		System.out.println("----------------");

		String array3[] = query.split("from")[1].split("where");

		System.out.println("Table name : " + array3[0]);

		System.out.println("----------------");
		String array4[] = query.split("where");

		System.out.println("Condition :" + array4[1]);
	}

}
