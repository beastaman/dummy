package com.assignment.problem2;

import java.util.*;

public class Demo {

	public static void main(String[] args) {

		String query = "select table1.name, table2.area from table1, table2 where table1.id = table2.id AND area in (select area from table2)";

		SqlQuery sqlQuery = SqlQuerySingleton.getSqlQuery();

		String [] tables = sqlQuery.getTables(query);
		String [] conditions = sqlQuery.get_Conditions(query);
		String[] columns = SqlQuerySingleton.getSqlQuery().getColumns(query);
		List<String> list = SqlQuerySingleton.getSqlQuery().getSubQuery(query);
		System.out.println("Tables: ");
		System.out.println(Arrays.toString(tables));
		System.out.println("Conditions: ");
		System.out.println(Arrays.toString(conditions));
		System.out.println("Columns: ");
		System.out.println(Arrays.toString(columns));
		System.out.println("Subqueries: ");
		System.out.println(list);
		
		
	}

}
