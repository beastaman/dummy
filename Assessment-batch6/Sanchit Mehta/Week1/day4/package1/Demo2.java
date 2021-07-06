package com.package1;

import java.util.ArrayList;

public class Demo2 {

	public static void main(String[] args) {
		//accept sentence as input 
		//output each word separately
		String query ="select fname, lname, age from table1, table2, table3 where age<=20";
		String array[]=query.split(" ");
		ArrayList<String> cols=new ArrayList<String>();
		ArrayList<String> tables=new ArrayList<String>();
		ArrayList<String> condition=new ArrayList<String>();
		
//		for(String x:array) {
//			if(x=="select"||"from" || "")
//		}
		
		System.out.println("attributes:- \n"+query.split("select ")[1].split(" from")[0]+"\n\ntable name(s):- \n"+(query.split("from ")[1]).split(" where")[0]+" \n\nwhere condition:- \n"+query.split(" where ")[1]);


	}

}
