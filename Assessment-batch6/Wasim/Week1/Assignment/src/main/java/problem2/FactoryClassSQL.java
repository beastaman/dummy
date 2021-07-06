package main.java.problem2;

public class FactoryClassSQL {

	public static SqlQuery sqlQuery = null;
	
	public static SqlQuery getFactory() {
		
		if(sqlQuery == null) {
			sqlQuery = new SqlQuery();
		}
		
		return sqlQuery;
	}
}
