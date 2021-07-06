package com.question2;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class SqlTest {

	String sql = "select column1, column2 from table1, table2 where column1 > 10 and column2 == 3 or column2 != 2";
	String sql2 = "select column1 from table1 where column1 in (select column2 from table2) and colum2 in (select column1 from table1)";
	String sql3 = "select table1.column1, table1.column2, table2.column3, table2.column4  from table1, table2";

	@BeforeAll
	static void setUpBeforeClass() throws Exception {

		Sql sqlQuery = new Sql();
	}

	@Test
	void testColumn() {
		Map<String, List> actual = Sql.getColumns(sql3);
		List<String> expected = new ArrayList<String>(List.of("column1", "column2"));
		assertTrue(actual.get("table1").get(0).equals(expected.get(0)));
	}

	@Test
	void testTables() {
		String[] actual = Sql.getTables(sql);
		String[] expected = { "table1", "table2" };
		assertTrue(actual[0].equals(expected[0]));
	}

	@Test
	void testSubQuery() {
		List<String> actual = Sql.getSubQuery(sql2);
		List<String> expected = new ArrayList();
		expected.add("select column2 from table2");
		expected.add("select column1 from table1");
		assertTrue(actual.get(0).equals(expected.get(0)));

	}

	@Test
	void testCondition() {
		String[] actual = Sql.get_Conditions(sql);
		String[] expected = { " column1 > 10 ", " column2 == 3 ", " column2 != 2 " };
		assertTrue(actual[0].equals(expected[0]));
	}

}
