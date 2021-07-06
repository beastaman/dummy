package test.java.problem2;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

import org.junit.jupiter.api.Test;

import main.java.problem2.SqlQuery;

class SqlQueryTesting {

	SqlQuery sqlQuery;

	public SqlQueryTesting() {
		this.sqlQuery = new SqlQuery();
	}

	@Test
	public void test_getTables() {

		String query = "Select * from table1, table2, table3 where table1.uid = tabl2.uid AND table1.uid = tabl3.uid";

		String[] actual = sqlQuery.getTables(query);
		String[] expected = { "table1", "table2", "table3" };

		assertArrayEquals(expected, actual);
	}

	@Test
	public void test_getConditions() {
		String query = "Select * from table1, table2, table3 where table1.uid = tabl2.uid AND table1.uid = tabl3.uid";

		String[] actual = sqlQuery.get_Conditions(query);
		String[] expected = { "table1.uid = tabl2.uid ", " table1.uid = tabl3.uid" };

		assertArrayEquals(expected, actual);
	}

	@Test
	public void test_getColumns() {

		String query = "select table1.uid, table1.name, table2.age  from table1, table2";

		Map<String, List<String>> actual = sqlQuery.getColumns(query);

		Map<String, List<String>> expected = new HashMap<>();
		expected.put("table1", Arrays.asList("uid", "name"));
		expected.put("table2", Arrays.asList("age"));

		assertEquals(expected, actual);

	}

	@Test
	public void test_getSubQuery() {

		String query = "select uid from table1 where name in (select id from table2) and name in (select name from table1)";

		List<String> actual = sqlQuery.getSubQuery(query);

		List<String> expected = Arrays.asList("select id from table2", "select name from table1");

		assertEquals(expected, actual);

	}

}
