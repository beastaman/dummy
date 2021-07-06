package assignment.sapient.week1.q2.logic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SqlQuery {

	public String[] getTable(String arg) {

		String arr[] = arg.toUpperCase().split("SELECT|FROM|WHERE", 4);

		String tableNames[] = arr[2].split(",");
		for (int i = 0; i < tableNames.length; i++) {
			tableNames[i] = tableNames[i].strip();
		}

		return tableNames;
	}

	public String[] getConditions(String arg) {

		String arr[] = arg.toUpperCase().split("SELECT|FROM|WHERE", 4);

		if (arr.length != 4) {
			return new String[0];
		}

		String conditions[] = arr[3].split("(AND|OR)");

		for (int i = 0; i < conditions.length; i++) {
			conditions[i] = conditions[i].strip();
		}

		return conditions;

	}

	public Map<String, List> getColumns(String arg) {

		Map<String, List> columns = new HashMap<>();

		String arr[] = arg.toUpperCase().split("SELECT|FROM|WHERE", 4);

		// column names with aliases intact to names
		String columnNames[] = arr[1].split(",");

		String[] tableNames = SqlQueryFactory.getSqlQueryObject().getTable(arg);

		// creating map of aliases to tablenames
		Map<String, String> aliasTableMap = new HashMap<>();
		for (String string : tableNames) {
			String[] temp = string.split(" ");
			aliasTableMap.put(temp[temp.length - 1], temp[0]);
			columns.put(temp[0], new ArrayList<>());
		}

		// extracting columnnames to tables
		for (int i = 0; i < columnNames.length; i++) {
			String temp = columnNames[i].strip();
			if (temp.contains(".")) {
				String[] aliasColumn = temp.split("\\.");
				columns.get(aliasTableMap.get(aliasColumn[0])).add(aliasColumn[1]);
			} else {
				for (String table : columns.keySet()) {
					columns.get(table).add(temp);
				}
			}
		}

		return columns;

	}

	public List<String> getSubquery(String arg) {

		List<String> subQueries = new ArrayList<>();

		String arr[] = arg.toUpperCase().split("SELECT|FROM|WHERE", 4);
		
		if (arr.length != 4) {
			return subQueries;
		}

		Pattern pattern = Pattern.compile("\\(.*?SELECT.*?FROM.*?\\)");
		Matcher matcher = pattern.matcher(arr[3]);
		while (matcher.find()) {
			subQueries.add(arr[3].substring(matcher.start(), matcher.end()));
		}

		return subQueries;

	}

}
