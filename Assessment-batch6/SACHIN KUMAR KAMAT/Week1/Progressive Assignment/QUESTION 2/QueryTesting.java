package com.sachinweek1assignment;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.List;
import org.junit.jupiter.api.Test;


public class QueryTesting {


		@Test
		void test_for_getting_the_name_of_table() {
			String sql = "SELECT * FROM CUSTOMERS where ID = 10";

			String[] actual = SqlQuery.getTables(sql);

			assertEquals(" CUSTOMERS ", actual[0]);
		}

		@Test
		void test_for_getting_the_conditions() {
			String sql = "SELECT * FROM CUSTOMERS where ID = 10";

			String[] actual = SqlQuery.getConditions(sql);

			assertEquals(" ID = 10", actual[0]);
		}

		@Test
		void test_for_getting_the_subquery() {
			String sql = "SELECT * FROM CUSTOMERS WHERE ID IN (SELECT ID FROM CUSTOMERS WHERE SALARY > 4500)";

			List<String> actual = SqlQuery.getSubQuery(sql);

			assertEquals("SELECT ID FROM CUSTOMERS WHERE SALARY > 4500)", actual.get(actual.size() - 1));
		}

	}