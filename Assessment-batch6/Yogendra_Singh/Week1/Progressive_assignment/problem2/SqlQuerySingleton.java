package com.assignment.problem2;

public class SqlQuerySingleton {
	private static SqlQuery sqlQuery = null;
	public static SqlQuery getSqlQuery() {
		if(sqlQuery == null)  
			sqlQuery = new SqlQuery();
		return sqlQuery;
	}
}
