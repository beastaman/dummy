package assignment.sapient.week1.q2.logic;

public class SqlQueryFactory {
	
	private static SqlQuery sqlQuery = null;
	
	private SqlQueryFactory() {}
	
	
	public static SqlQuery getSqlQueryObject() {
		if(sqlQuery==null) {
			sqlQuery = new SqlQuery();
		}
		
		return sqlQuery;
	}
	
}
