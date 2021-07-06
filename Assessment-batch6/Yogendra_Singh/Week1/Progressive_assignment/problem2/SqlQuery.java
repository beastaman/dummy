package com.assignment.problem2;

import java.util.*;

public class SqlQuery {

	public String[] getTables(String arg) {
		String[] string1 = arg.split("from");
		String[] string2 = string1[1].split("where");

		String table = string2[0].trim().replaceAll("\\p{Punct}", "");
		String[] tables = table.split(" ");

		return tables;
	}

	public String[] get_Conditions(String arg) {
		String[] string1 = arg.split("where");
		String[] conditions = string1[1].trim().split("and|or");

		return conditions;
	}

	public String[] getColumns(String arg) {	
		String arr[] = arg.split(" from ");
		String arr1[]=arr[0].split("select ");
		String cols[]=arr1[1].split(",");
		return cols;
	}

	public List<String> getSubQuery(String arg) {
		List<String> list = new ArrayList<>();
		String[] string = arg.split("[(]");
		for (int i = 1; i < string.length; ++i) {
			String temp = string[i].split("[)]")[0];
			list.add(temp);
		}
		return list;
	}

	
}
