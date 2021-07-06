package com.practice;

import java.util.ArrayList;
import java.util.List;

public class SentenceToWords {
	public static void main(String[] args) {
		String query="Select fname, lname, age from table1 where age=20";
		String array[]=query.split(" ");
		for(String x:array)
		{
			System.out.println(x);
		}
		String array1[]=query.split("from");
		for(String x:array1)
		{
			System.out.println(x);
		}
		String columns[]=array1[0].split(" ");
		System.out.println("Column names:");
		for(int i=1;i<columns.length;i++)
			System.out.println(columns[i]);
		String array3[]=array1[1].split(" ");
		System.out.println("Table name:");
		System.out.println(array3[1]);
		System.out.println("Conditions");
		String array4[]=query.split("where");
		System.out.println(array4[1]);
		List<Integer> list= new ArrayList<Integer>();
		System.out.println(list);
	}
}
