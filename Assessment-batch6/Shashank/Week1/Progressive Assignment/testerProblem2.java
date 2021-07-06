package Assignment;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.*;
class testerProblem2 {

	@Test
	public void test_getTables() {

		String query = "select id , name , age  from employee, salary where id = 1";

		SQL sqlQuery = new SQL();
		String[] actual = sqlQuery.getTables(query);
		String[] expected = { "employee", "salary" };

		assertArrayEquals(expected, actual);
	}
	@Test
	public void test_getConditions() {

		String query = "select * from Employee where id=5 and Salary=100000";

		SQL sqlQuery = new SQL();
		String[] actual = sqlQuery.get_Conditions(query);
		String[] expected = { "id=5", "Salary=100000" };

		assertArrayEquals(expected, actual);
	}
	
	
	@Test
	public void test_getColumns() {

		String query = "select student.id, student.name, school.code  from student, school";
		SQL sqlQuery = new SQL();
		Map<String, List<String>> actual = sqlQuery.getColumns(query);

		Map<String, List<String>> expected = new HashMap<>();
		expected.put("student", Arrays.asList("id", "name"));
		expected.put("school", Arrays.asList("code"));

		assertEquals(expected, actual);

	}

	
	@Test
	public void test_getSubQuery() {

		String query = "select id from employee where name in (select address from details) and name in (select age from employee)";
		
		SQL sqlQuery = new SQL();
		List<String> actual = sqlQuery.getSubQuery(query);
		List<String> expected = Arrays.asList("select address from details", "select age from employee");

		assertEquals(expected, actual);

	}
	
	@Test
	public void test_getConditions2() {
		String query = "Select * from student, department, details  where student.id = department.sid and student.name = details.name";
		SQL sqlQuery = new SQL();
		String[] actual = sqlQuery.get_Conditions(query);
		String[] expected = { " student.id = department.sid ", " student.name = details.name" };
		
	}

}
