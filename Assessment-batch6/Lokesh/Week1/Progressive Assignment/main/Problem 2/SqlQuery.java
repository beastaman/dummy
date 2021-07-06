package com.week1.Problem2;

import java.util.*;

public class SqlQuery {

	public String[] getTables(String arg) {
		
		
		String[] array1 = arg.split("from");
		String[] array2 = array1[1].split("where");
		String array3 = array2[0].trim().replaceAll(",","");
		String[] tables = array3.split(" ");
		return tables;
	}

	public String[] get_Conditions(String arg) {
		String[] array1  = arg.split("where");
		String[] array2 = array1[1].split("and");
		return array2;
	}

	public Map<String, List<String>> getColumns(String arg) {
		
		Map<String, List<String>> m = new HashMap<>();

		String[] str = ((arg.split("select")[1]).split("from")[0]).split("[,]");

		for (int i = 0; i < str.length; ++i) {

			String[] array2 = (str[i].split(" ")[1]).split("[.]");
			if (m.containsKey(array2[0])) {
				m.get(array2[0]).add(array2[1]);
			}
			else {
				m.put(array2[0], new ArrayList<String>(List.of(array2[1])));
			}
		}
		return m;
	}

	public List<String> getSubQuery(String arg) {
		List<String> list = new ArrayList<>();
		arg = arg.toLowerCase();
		String[] str = arg.split("[(]");
		for (int i = 1; i < str.length; ++i) {
			String temp = str[i].split("[)]")[0];
			list.add(temp);
		}
		return list;
	}

	
}
