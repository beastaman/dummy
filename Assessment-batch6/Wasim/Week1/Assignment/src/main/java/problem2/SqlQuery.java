package main.java.problem2;

import java.util.*;

public class SqlQuery {

	public String[] getTables(String arg) {

		arg = arg.toLowerCase();

		String[] string1 = arg.split("from");
		String[] string2 = string1[1].split("where");

		String table = string2[0].trim().replaceAll("\\p{Punct}", "");
		String[] tables = table.split(" ");

		return tables;
	}

	public String[] get_Conditions(String arg) {

		arg = arg.toLowerCase();

		String[] string1 = arg.split("where");
		String[] conditions = string1[1].trim().split("and|or");

		return conditions;
	}

	public Map<String, List<String>> getColumns(String arg) {
		
		arg = arg.toLowerCase();
		Map<String, List<String>> map = new HashMap<>();

		String[] string = ((arg.split("select")[1]).split("from")[0]).split("[,]");

		for (int i = 0; i < string.length; ++i) {

			String[] string2 = (string[i].split(" ")[1]).split("[.]");
			if (map.containsKey(string2[0])) {
				map.get(string2[0]).add(string2[1]);
			}
			else {
				map.put(string2[0], new ArrayList<String>(List.of(string2[1])));
			}
		}
		return map;
	}

	public List<String> getSubQuery(String arg) {
		List<String> list = new ArrayList<>();
		arg = arg.toLowerCase();
		String[] string = arg.split("[(]");
		for (int i = 1; i < string.length; ++i) {
			String temp = string[i].split("[)]")[0];
			list.add(temp);
		}
		return list;
	}

	
}
