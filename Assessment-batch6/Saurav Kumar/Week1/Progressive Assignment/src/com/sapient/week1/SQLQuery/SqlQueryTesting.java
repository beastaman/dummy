package com.sapient.week1.SQLQuery;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class SqlQueryTesting {

	private static SqlQuery sqlQuery;
	
	@BeforeAll
	static void init() {
		sqlQuery = SqlQuery.getInstance();
	}
	
	// Testing if it follows Singleton design pattern
	
	@Test
	void SingletonTest() {
		assertSame(sqlQuery, SqlQuery.getInstance());
	}

	
	// Testing getTables method
	
	@Test
	void getTablesTest1() {
		String query = "SELECT * FROM TABLE";
		String actual[] = sqlQuery.getTables(query);
		String expected[] = {"TABLE"};
		assertArrayEquals(actual, expected);
	}
	
	@Test
	void getTablesTest2() {
		String query = "SELECT T1.NAME, T2.SALARY, T3.AGE FROM TABLE1 T1, TABLE2 AS T2, TABLE3 T3\r\n"
				+ "WHERE T1.SALARY < 20000";
		String actual[] = sqlQuery.getTables(query);
		String expected[] = {"TABLE1", "TABLE2", "TABLE3"};
		assertArrayEquals(actual, expected);
	}
	
	
	// Testing getConditions method
	
	@Test
	void getConditionsTest1() {
		String query = "SELECT * FROM TABLE";
		String actual[] = sqlQuery.getConditions(query);
		String expected[] = {};
		assertArrayEquals(actual, expected);
	}
	
	@Test
	void getConditionsTest2() {
		String query = "SELECT * FROM TABLE WHERE AGE > 30";
		String actual[] = sqlQuery.getConditions(query);
		String expected[] = {"AGE > 30"};
		assertArrayEquals(actual, expected);
	}
	
	@Test
	void getConditionsTest3() {
		String query = "SELECT T1.NAME, T2.SALARY, T3.AGE FROM TABLE1 T1, TABLE2 AS T2, TABLE3 T3\r\n"
				+ "WHERE T2.SALARY < 20000 AND T2.AGE > 30";
		String actual[] = sqlQuery.getConditions(query);
		String expected[] = {"T2.SALARY < 20000", "T2.AGE > 30"};
		assertArrayEquals(actual, expected);
	}
	
	
	// Testing getColumns method
	
	@Test
	void getColumnsTest1() {
		String query = "SELECT * FROM TABLE";
		Map<String, List<String>> actual = new HashMap<>();
		Map<String, List<String>> expected = sqlQuery.getColumns(query);
		List<String> list = new ArrayList<>();
		list.add("*");
		actual.put("TABLE", list);
		assertTrue(actual.equals(expected));
	}
	
	@Test
	void getColumnsTest2() {
		String query = "SELECT NAME, AGE, SALARY FROM TABLE";
		Map<String, List<String>> actual = new HashMap<>();
		Map<String, List<String>> expected = sqlQuery.getColumns(query);
		List<String> list = new ArrayList<>();
		list.add("NAME");
		list.add("AGE");
		list.add("SALARY");
		
		actual.put("TABLE", list);
		assertTrue(actual.equals(expected));
	}
	
	@Test
	void getColumnsTest3() {
		String query = "SELECT T1.NAME, T1.ID, T2.SALARY, T2.ADDRESS, T3.AGE FROM TABLE1 T1, TABLE2 AS T2, TABLE3 T3\r\n"
				+ "WHERE T2.SALARY < 20000 AND T2.AGE > 30";
		Map<String, List<String>> actual = new HashMap<>();
		Map<String, List<String>> expected = sqlQuery.getColumns(query);
		List<String> list = new ArrayList<>();
		list.add("NAME");
		list.add("ID");
		actual.put("T1", list);
		
		list = new ArrayList<>();
		list.add("SALARY");
		list.add("ADDRESS");
		actual.put("T2", list);
		
		list = new ArrayList<>();
		list.add("AGE");
		actual.put("T3", list);
		
		assertTrue(actual.equals(expected));
	}
	
	
	// Testing getSubqueries method
	
	@Test
	void getSubqueriesTest1() {
		String query = "SELECT * FROM TABLE";
		
		List<String> actual = sqlQuery.getSubqueries(query);
		List<String> expected = new ArrayList<>();
		
		assertTrue(actual.equals(expected));
	}
	
	@Test
	void getSubqueriesTest2() {
		String query = "SELECT * FROM CUSTOMERS WHERE ID IN (SELECT ID FROM CUSTOMERS WHERE SALARY > 4500)";
		
		List<String> actual = sqlQuery.getSubqueries(query);
		List<String> expected = new ArrayList<>();
		expected.add("SELECT ID FROM CUSTOMERS WHERE SALARY > 4500");
		
		assertTrue(actual.equals(expected));
	}
	
	@Test
	void getSubqueriesTest3() {
		String query = "Select S_ID from STUDENT where S_ID NOT IN "
				+ "(Select S_ID from STUDENT_COURSE where C_ID IN "
				+ "(SELECT C_ID from COURSE where C_NAME=’DSA’ or C_NAME=’DBMS’))";
		
		List<String> actual = sqlQuery.getSubqueries(query);
		List<String> expected = new ArrayList<>();
		expected.add("Select S_ID from STUDENT_COURSE where C_ID IN "
				+ "(SELECT C_ID from COURSE where C_NAME=’DSA’ or C_NAME=’DBMS’)");
		expected.add("SELECT C_ID from COURSE where C_NAME=’DSA’ or C_NAME=’DBMS’");
		
		assertTrue(actual.equals(expected));
	}
}
