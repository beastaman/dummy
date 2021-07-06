package com.sapient.day4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LineToWord {
	
//	private static String[] getTables(String arg) 
//	{
//		
//		
//		return {};
//	}

	public static void main(String[] args) {
		
		String query = ("Select t.fname, t1.lname from table1, table2 t1 where age=20 and "
				+ "fname In (Select fname from table3 where salary>50)"
				+ " And asdas in (Select * from table5)").toUpperCase();
		
		
		
		
		String arr[] = query.split("SELECT|FROM|WHERE",4);
		for (String string : arr) {
			System.out.println(string);
		}
		
//		String tableNames[] = arr[2].split(",");
//		for (String string : tableNames) {
//			System.out.println(string.strip());
//		}
		
		String tableNames[] = arr[2].split(",");
		for (int i=0; i<tableNames.length; i++) {
			tableNames[i] = tableNames[i].strip();
		}
		
		for (String string : tableNames) {
			String[] temp = string.split(" ");
			System.out.println(temp[temp.length-1] + "-->" + temp[0]);
		}
		
		
		
		
		String columnNames[] = arr[1].split(",");
		for (String string : columnNames) {
			System.out.println(string.strip());
		}
		
		
		
		
		
		String conditions[] = arr[3].split("(AND|OR)");
		for (String string : conditions) {
			System.out.println(string.strip());
		}
		
		
//		String text    =
//		        "This is the text which is to be searched " +
//		        "for occurrences of the word 'is'.";
//
//		String regex = "is";
//
//		Pattern pattern = Pattern.compile(regex);
//		Matcher matcher = pattern.matcher(text);
//
//		int count = 0;
//		while(matcher.find()) {
//		    count++;
//		    System.out.println("found: " + count + " : "
//		            + matcher.start() + " - " + matcher.end());
//		}
		
		
		
		Pattern pattern = Pattern.compile("\\(.*?SELECT.*?FROM.*?\\)");
		Matcher matcher = pattern.matcher(arr[3]);
		int count = 0;
		while(matcher.find()) {
			count++;
		    System.out.println("found: " + count + " : "
		            + matcher.start() + " - " + matcher.end());
		    System.out.println(arr[3].substring(matcher.start(), matcher.end()));
		}
//		
		
//		String arr1[] = arr[0].split("SELECT");
//		for (String string : arr1) {
//			System.out.println(string);
//		}
		
		
//		String queryarr[] = query.split(" ");
//		
//		for(String x: queryarr) {
//			System.out.println(x);
//		}
		
//		System.out.println("Column Names --->");
//		String arr1[] = query.split("FROM")[0].split(" ");
//		for(int i=1; i<arr1.length; i++) {
//			System.out.println(arr1[i]);
//		}
//		
//		
//		
//		String arr2[] = query.split("FROM")[1].trim().split(" ");
//		System.out.println("Table Name = " + arr2[0]);
//		
//		
//		String arr3[] = query.split("WHERE");
//		System.out.println(arr3[1].trim());
	}

}
