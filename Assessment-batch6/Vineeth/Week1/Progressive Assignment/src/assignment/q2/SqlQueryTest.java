package assignment.q2;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class SqlQueryTest {
	
	String query = "SELECT E.id, E.name, E.age, S.salary\r\n"
				 + "FROM Employee AS E, EmpSalary S\r\n"
				 + "WHERE E.id=S.id AND salary>=(SELECT AVG(Salary) FROM EmpSalary)\r\n";

	@Test
	void test1() {
		List<String> actual = Arrays.asList(SqlQuery.getTables(query));
		List<String> expected = Arrays.asList("EMPLOYEE AS E", "EMPSALARY S");
		assertEquals(expected, actual);
	}

	@Test
	void test2() {
		List<String> actual = Arrays.asList(SqlQuery.getConditions(query));
		List<String> expected = Arrays.asList("E.ID=S.ID", "SALARY>=(SELECT AVG(SALARY) FROM EMPSALARY)");
		assertEquals(expected, actual);
	}

	@Test
	void test3() {
		String actual = SqlQuery.getColumns(query).toString();
		String expected = "{EMPLOYEE=[ID, NAME, AGE], EMPSALARY=[SALARY]}";
		assertEquals(expected, actual);
	}

	@Test
	void test4() {
		List<String> actual = SqlQuery.getSubquery(query);
		List<String> expected = Arrays.asList("SELECT AVG(SALARY) FROM EMPSALARY");
		assertEquals(expected, actual);
	}
	
}
