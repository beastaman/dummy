package com.sapient.week1.SQLQuery;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.Stack;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SqlQuery {
	
	private static SqlQuery obj = null;
	
	private SqlQuery() {};
	
	public static SqlQuery getInstance() {
		if(obj == null) {
			obj = new SqlQuery();
		}
		
		return obj;
	}
	
	public String[] getTables(String query) {
		String tables[];
		
		if(query.split("WHERE").length == 1) {
			tables = query.toUpperCase().split("FROM")[1].split(", ");
		} else {
		 tables = query.toUpperCase().split("FROM")[1].split("WHERE")[0].split(", ");
		}
		
		for(int i=0; i<tables.length; i++) {
			tables[i] = tables[i].strip().split(" |AS")[0];
		}
		
		return tables;
	}
	
	public String[] getConditions(String query) {
		String conditions[] = query.toUpperCase().split("WHERE");
		if(conditions.length == 1) {
			return new String[0];
		}
		
		conditions = conditions[1].split("AND|OR");
		
		for(int i=0; i<conditions.length; i++) {
			conditions[i] = conditions[i].strip();
		}
		
		return conditions;
	}
	
	public Map<String, List<String>> getColumns(String query) {
		Map<String, List<String>> map = new HashMap<>();
		
		String tables[] = SqlQuery.getInstance().getTables(query);
		String columns[] = query.toUpperCase().split("FROM")[0].split("SELECT")[1].split(",");
		for(int i=0; i<columns.length; i++) {
			columns[i] = columns[i].strip();
		}
		
		if(tables.length == 1) {
			map.put(tables[0], Arrays.asList(columns));
			return map;
		}
		
		for(String column : columns) {
			String table_and_col[] = column.split("\\.");
			String table = table_and_col[0];
			String col = table_and_col[1];
			
			if(!map.containsKey(table)) {
				map.put(table, new ArrayList<String>());
			}
			
			map.get(table).add(col);
		}
		
		
		return map;
	}
	
	public List<String> getSubqueries(String query) {
		List<String> subQueries = new ArrayList<>();
		
		Stack<Integer> stack = new Stack<>();
		Map<Integer, Integer> map = new TreeMap<>();
		for(int i=0; i<query.length(); i++) {
			if(query.charAt(i) == '(') {
				stack.push(i);
			} else if(query.charAt(i) == ')') {
				if(stack.empty()) {
					return new ArrayList<>();
				} else {
					map.put(stack.pop(), i);
				}
			}
		}
		
		for(Map.Entry entry : map.entrySet()) {
			int left = (int) entry.getKey(), right = (int) entry.getValue();
			subQueries.add(query.substring(left+1, right));
		}
		
		return subQueries;
	}
	
}











