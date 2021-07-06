package com.sql;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SqlQuery {

	public static String[] getTables(String arg) {
		String sql = arg.toLowerCase();
		String[] results = ((sql.split("from")[1]).split("where")[0]).split(",");
		for (int i = 0; i < results.length; ++i) {
			results[i] = results[i].replace(" ", "");
		}
		return results;
	}

	public static String[] get_Conditions(String arg) {
		String sql = arg.toLowerCase();
		String[] results = (sql.split("where")[1]).split("and|or");
		return results;
	}

	public static Map<String, List> getColumns(String arg) {
		Map<String, List> results = new HashMap();
		String sql = arg.toLowerCase();
		String[] selector = ((sql.split("select")[1]).split("from")[0]).split("[,]");

		for (int i = 0; i < selector.length; ++i) {
			String[] temp = (selector[i].split(" ")[1]).split("[.]");
			if (results.containsKey(temp[0]) == true) {
				results.get(temp[0]).add(temp[1]);
			} else {
				results.put(temp[0], new ArrayList<String>(List.of(temp[1])));
			}
		}
		return results;
	}

	public static List<String> getSubQuery(String arg) {
		List<String> results = new ArrayList();
		String sql = arg.toLowerCase();
		String[] selector = sql.split("[(]");
		for (int i = 1; i < selector.length; ++i) {
			String temp = selector[i].split("[)]")[0];
			results.add(temp);
		}
		return results;
	}

}
