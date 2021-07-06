package com.sapient.day4;

public class Demo2 {

	public static void main(String[] args) { // Scannner scanner=new Scanner(System.in);

		String query = "Select fname, lname, age from table1 where age=20";

		String array[] = query.split(" ");

		// System.out.println(arr);
		// for (String x : array) {
		// System.out.println(x);
		// }

		String array1[] = query.split("from");
		for (String x : array1) {
			System.out.println(x);
		}

		// System.out.println(array2[1]);
		String temp = array1[1];
		String array2[] = temp.split("where");
		// String array4[] = array3.split("where");
		// for (int i = 0; i < array3[0]; i++) {
		System.out.print(array2[0]);
		// }

	}
}
