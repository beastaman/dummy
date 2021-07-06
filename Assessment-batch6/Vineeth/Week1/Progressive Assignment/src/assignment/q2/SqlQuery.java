package assignment.q2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SqlQuery {

//	SELECT Query Assumption
	
//	SELECT T1.COLUMN1, TABLE1.COLUMN2, T2.COLUMN1, ...
//	FROM TABLE1 AS T1, TABLE2 T2, ...
//	WHERE CONDITION1 AND CONDITION2 AND ...  # CONDITION may contain sub-query

	public static String[] getTables(String query) {
		
		query = query.toUpperCase().replaceAll("\\s+", " ");
		int s = query.indexOf(" FROM ") + 5;
		int e = query.indexOf(" WHERE ");
		if(e < 0) e = query.length();

		return query.substring(s, e).strip().split(",\\s*");
	}

	public static String[] getConditions(String query) {

		query = query.toUpperCase().replaceAll("\\s+", " ");
		
		if(query.indexOf(" WHERE ") < 0)
			return new String[0];
		
		int s = query.indexOf(" WHERE ") + 6;
		int e = query.indexOf(" ORDER BY ");
		if(e < 0) e = query.length();

		return query.substring(s, e).strip().split(" AND ");
	}
	
	public static Map<String, List<String>> getColumns(String query) {

		query = query.toUpperCase().replaceAll("\\s+", " ");
		String[] tables = getTables(query);
		Map<String, String> tablesMap = new HashMap<>();
		for(int i=0;i<tables.length;i++) {
			String[] kv;
			if(tables[i].contains(" AS ")) kv = tables[i].split("\\s*AS\\s*");
			else if(tables[i].contains(" ")) kv = tables[i].split("\\s+");
			else kv = new String[] { tables[i], tables[i] };
			tablesMap.put(kv[1], kv[0]);
			tablesMap.put(kv[0], kv[0]);
			if(i == 0) tablesMap.put("", kv[0]); // for all columns with unspecified table name
		}
		
		int s = query.indexOf("SELECT") + 6;
		int e = query.indexOf(" FROM ");
		String[] columns = query.substring(s, e).strip().split(",\s*");
		Map<String, List<String>> tableColumns = new HashMap<>();
		tablesMap.values().forEach((t) -> tableColumns.put(t, new ArrayList<>()));
		for(int i=0;i<columns.length;i++) {
			String[] tc;
			if(columns[i].contains(".")) tc = columns[i].split("\\.");
			else tc = new String[] { "", columns[i] };
			tableColumns.get(tablesMap.get(tc[0])).add(tc[1]);
		}

		return tableColumns;
	}
	
	public static List<String> getSubquery(String query) {

		query = query.toUpperCase().replaceAll("\\s+", " ");
		String[] conditions = getConditions(query);
		int s, e;
		List<String> subquery = new ArrayList<>();
		for(int i=0;i<conditions.length;i++) {
			conditions[i] = conditions[i].replaceAll("\\(\\s*", "(").replaceAll("\\s*\\)", ")");
			if(!conditions[i].contains("(SELECT")) continue; // No sub-query
			s = conditions[i].indexOf("(SELECT") + 1;
			e = s;
			for(int j=s, c=1;j<conditions[i].length();j++) {
				switch(conditions[i].charAt(j)) {
					case '(':	c++;
								break;
					case ')':	c--;
								if (c == 0) e = j;
								break;
					default:	break;
				}
			}
			subquery.add(conditions[i].substring(s, e));
		}
		
		return subquery;
	}
	
}
