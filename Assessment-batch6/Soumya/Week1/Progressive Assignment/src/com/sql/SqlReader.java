package com.sql;

import java.util.Arrays;

public class SqlReader {

	public static void main(String[] args) {
		String sql = "select column1, column2 from table1, table2 where column1 > 10 and column2 == 3 or column2 != 2";
		String sql2 = "select column1 from table1 where column1 in (select column2 from table2) and colum2 in (select column1 from table1)";
		String sql3 = "select table1.column1, table1.column2, table2.column3, table2.column4  from table1, table2";
		SqlQuery sqlQuery = new SqlQuery();

		System.out.println(Arrays.toString(sqlQuery.getTables(sql)));
		System.out.println(Arrays.toString(sqlQuery.get_Conditions(sql)));
		System.out.println(sqlQuery.getSubQuery(sql2));
		System.out.println(sqlQuery.getColumns(sql3));

	}

}
