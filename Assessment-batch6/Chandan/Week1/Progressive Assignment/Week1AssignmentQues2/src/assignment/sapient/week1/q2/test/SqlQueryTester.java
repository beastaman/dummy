package assignment.sapient.week1.q2.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import assignment.sapient.week1.q2.logic.SqlQuery;
import assignment.sapient.week1.q2.logic.SqlQueryFactory;

class SqlQueryTester {
	
	static SqlQuery sqlQuery;
	
	@BeforeAll
	static void initialize() {
		sqlQuery = SqlQueryFactory.getSqlQueryObject();
	}
	
	@Test
	void testSqlQueryFactorySingleton() {
		SqlQuery sqlQuery1 = SqlQueryFactory.getSqlQueryObject();
		
		assertSame(sqlQuery, sqlQuery1);
	}
	
	
	
	// getTable() testing
	
	@Test
	void testTableName1() {
		
		String query = "SELECT * FROM TABLE1";
		String tablenames[] = {"TABLE1"};
		
		assertArrayEquals(tablenames, sqlQuery.getTable(query));
		
	}
	
	@Test
	void testTableName2() {
		
		String query = "SELECT * FROM TABLE1, TABLE2 WHERE AGE>20";
		String tablenames[] = {"TABLE1", "TABLE2"};
		
		assertArrayEquals(tablenames, sqlQuery.getTable(query));
		
	}
	
	@Test
	void testTableName3() {
		
		String query = "SELECT T1.ABC, T2.XYZ, T3.PQR FROM TABLE1 T1, TABLE2 T2, TABLE3 T3";
		String tablenames[] = {"TABLE1 T1", "TABLE2 T2", "TABLE3 T3"};
		
		assertArrayEquals(tablenames, sqlQuery.getTable(query));
		
	}
	
	@Test
	void testTableName4() {
		
		String query = "SELECT T1.ABC, T2.XYZ, T3.PQR FROM TABLE1 T1, TABLE2 T2, TABLE3 T3 WHERE T1.ID = T2.ID AND T2.SAL>T3.SAl";
		String tablenames[] = {"TABLE1 T1", "TABLE2 T2", "TABLE3 T3"};
		
		assertArrayEquals(tablenames, sqlQuery.getTable(query));
		
	}
	
	
	
	// getConditions() testing
	
	@Test
	void testConditions1() {
		
		String query = "SELECT * FROM TABLE1";
		String conditions[] = {};
		
		assertArrayEquals(conditions, sqlQuery.getConditions(query));
		
	}
	
	
	@Test
	void testConditions2() {
		
		String query = "SELECT * FROM TABLE1, TABLE2 WHERE AGE>20";
		String conditions[] = {"AGE>20"};
		
		assertArrayEquals(conditions, sqlQuery.getConditions(query));
		
	}
	
	@Test
	void testConditions3() {
		
		String query = "SELECT T1.ABC, T2.XYZ, T3.PQR FROM TABLE1 T1, TABLE2 T2, TABLE3 T3 WHERE T1.ID = T2.ID AND T2.SAL>T3.SAL";
		String conditions[] = {"T1.ID = T2.ID", "T2.SAL>T3.SAL"};
		
		assertArrayEquals(conditions, sqlQuery.getConditions(query));
		
	}
	
	@Test
	void testConditions4() {
		
		String query = "SELECT * FROM TABLE1, TABLE2 WHERE AGE>20 OR FNAME IN (SELECT * FROM DETAILS)";
		String conditions[] = {"AGE>20", "FNAME IN (SELECT * FROM DETAILS)"};
		
		assertArrayEquals(conditions, sqlQuery.getConditions(query));
		
	}
	
	
	
	// getColumns
	
	@Test
	void testColumns1() {
		
		String query = "SELECT * FROM TABLE1";
		Map<String, List> columns = new HashMap<>();
		
		List<String> columnNames = new ArrayList<>();
		columnNames.add("*");
		
		columns.put("TABLE1",columnNames);
		
		assertTrue(columns.equals(sqlQuery.getColumns(query)));
		
	}
	
	@Test
	void testColumns2() {
		
		String query = "SELECT * FROM TABLE1, TABLE2 WHERE AGE>20";
		Map<String, List> columns = new HashMap<>();
		
		List<String> columnNames = new ArrayList<>();
		columnNames.add("*");
		
		columns.put("TABLE1",columnNames);
		columns.put("TABLE2",columnNames);
		
		assertTrue(columns.equals(sqlQuery.getColumns(query)));
		
	}
	
	@Test
	void testColumns3() {
		
		String query = "SELECT T1.ABC, T1.DEF, T2.XYZ, T3.PQR FROM TABLE1 T1, TABLE2 T2, TABLE3 T3";
		Map<String, List> columns = new HashMap<>();
		
		List<String> columnNames1 = new ArrayList<>();
		columnNames1.add("ABC");
		columnNames1.add("DEF");
		List<String> columnNames2 = new ArrayList<>();
		columnNames2.add("XYZ");
		List<String> columnNames3 = new ArrayList<>();
		columnNames3.add("PQR");
		
		columns.put("TABLE1",columnNames1);
		columns.put("TABLE2",columnNames2);
		columns.put("TABLE3",columnNames3);
		
		assertTrue(columns.equals(sqlQuery.getColumns(query)));
		
	}
	
	
	
	
	// getSubQuery testing
	
	@Test
	void testSubQuery1() {
		
		String query = "SELECT * FROM TABLE1, TABLE2 WHERE AGE>20";
		
		List<String> subQueries = new ArrayList<>();
		
		assertTrue(subQueries.equals(sqlQuery.getSubquery(query)));
		
	}
	
	@Test
	void testSubQuery2() {
		
		String query = "SELECT * FROM TABLE1, TABLE2 WHERE AGE>20 AND FNAME IN (SELECT * FROM DETAILS)";
		
		List<String> subQueries = new ArrayList<>();
		subQueries.add("(SELECT * FROM DETAILS)");
		
		assertTrue(subQueries.equals(sqlQuery.getSubquery(query)));
		
	}
	
	@Test
	void testSubQuery3() {
		
		String query = "SELECT * FROM TABLE1, TABLE2 WHERE AGE>20 AND "
				+ "FNAME IN (SELECT * FROM DETAILS) OR "
				+ "ID NOT IN (SELECT IF FROM CLIENTS)";
		
		List<String> subQueries = new ArrayList<>();
		subQueries.add("(SELECT * FROM DETAILS)");
		subQueries.add("(SELECT IF FROM CLIENTS)");
		
		assertTrue(subQueries.equals(sqlQuery.getSubquery(query)));
		
	}
	
	

}
