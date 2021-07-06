package assignment.sapient.week1.q2;

import java.util.List;
import java.util.Map;

import assignment.sapient.week1.q2.logic.SqlQueryFactory;

public class Ques2 {

	public static void main(String[] args) {
		
		String query = "SELECT T1.ABC, T1.DEF, T2.XYZ, T3.PQR "
				+ "FROM TABLE1 T1, TABLE2 T2, TABLE3 T3 "
				+ "WHERE T1.ID = T2.ID AND T2.SAL>T3.SAL OR "
				+ "FNAME IN (SELECT * FROM DETAILS) AND PIN IN (SELECT * FROM ADDRESS)";
		
		
		
		// get Table Names
		System.out.println("Table Names-------------------");
		String[] tableNames = SqlQueryFactory.getSqlQueryObject().getTable(query);
		for (String table : tableNames) {
			System.out.println(table);
		}
		
		System.out.println();
		
		// get Conditions
		System.out.println("Conditions------------------");
		String[] conditions = SqlQueryFactory.getSqlQueryObject().getConditions(query);
		for (String string : conditions) {
			System.out.println(string);
		}
		
		
		System.out.println();
		
		// get Columns
		System.out.println("Columns------------------------");
		Map<String, List> columns = SqlQueryFactory.getSqlQueryObject().getColumns(query);
		for (String table : columns.keySet()) {
			System.out.println(table + "-->" + columns.get(table));
		}
		
		
		System.out.println();
		
		// get SubQuery
		System.out.println("Sub Queries------------------------");
		List<String> subQueries = SqlQueryFactory.getSqlQueryObject().getSubquery(query);
		subQueries.forEach(System.out::println);
		
		
	}

}
