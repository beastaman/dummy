package com.sapient.week1.SQLQuery;

import java.util.List;
import java.util.Map;

public class SqlQueryMain {

	public static void main(String[] args) {
		
		SqlQuery obj = SqlQuery.getInstance();
		
		String query = "select table1.firstName, table1.secondName, table2.age, table2.salary from table1 T1, table2 AS T2 "
				+ "where table1.id == table2.id AND table1.salary < 20000";
		
		
		String tables[] = obj.getTables(query);
		System.out.println("Tables are : ");
		for(String table:tables) {
			System.out.println(table);
		}
		
		System.out.println();
		
		String conditions[] = obj.getConditions(query);
		System.out.println("Conditions are : ");
		for(String condition:conditions) {
			System.out.println(condition);
		}
		
		System.out.println();
		
		
		Map<String, List<String>> map = obj.getColumns(query);
		
		for(Map.Entry element:map.entrySet()) {
			System.out.println("Table is : " + element.getKey());
			
			System.out.print("Columns are : ");
			List<String> columns = (List)element.getValue();
			for(String col : columns) {
				System.out.print(col + " , ");
			}
			
			System.out.println();
		}
		
		System.out.println();
		
		query = "Select S_ID from STUDENT where S_ID NOT IN\r\n"
				+ "(Select S_ID from STUDENT_COURSE where C_ID IN\r\n"
				+ "(SELECT C_ID from COURSE where C_NAME=’DSA’ or C_NAME=’DBMS’))";
		
		List<String> subQueries = obj.getSubqueries(query);
		for(String str : subQueries) {
			System.out.println("subquery : " + str + "\n");
		}
		
	}

}







