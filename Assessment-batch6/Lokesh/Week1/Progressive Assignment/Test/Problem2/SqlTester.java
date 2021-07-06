package com.week1.Problem2;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class SqlTester {

	@Test
	public void test_getTables() {

		String query = "Select * from student, school where student.name = 'vikas' AND student.marks = 80";

		SqlQuery sqlQuery = new SqlQuery();
		String[] actual = sqlQuery.getTables(query);
		String[] expected = { "student", "school" };

		assertArrayEquals(expected, actual);
	}
	
	@Test
	public void test_getColumns() {

		String query = "select student.id, student.name, school.code  from student, school";
		SqlQuery sqlQuery = new SqlQuery();
		Map<String, List<String>> actual = sqlQuery.getColumns(query);

		Map<String, List<String>> expected = new HashMap<>();
		expected.put("student", Arrays.asList("id", "name"));
		expected.put("school", Arrays.asList("code"));

		assertEquals(expected, actual);

	}

	
	@Test
	public void test_getSubQuery() {

		String query = "select id from school where name in (select code from school) and name in (select age from student)";
		
		SqlQuery sqlQuery = new SqlQuery();
		List<String> actual = sqlQuery.getSubQuery(query);
		List<String> expected = Arrays.asList("select code from school", "select age from student");

		assertEquals(expected, actual);

	}
	
	@Test
	public void test_getConditions() {
		String query = "Select * from student, department, details  where student.id = department.sid and student.name = details.name";
		SqlQuery sqlQuery = new SqlQuery();
		String[] actual = sqlQuery.get_Conditions(query);
		String[] expected = { " student.id = department.sid ", " student.name = details.name" };
		
//		for(int i = 0;i<actual.length;i++) 
//		{
//			System.out.println(actual[i]);
//		}
//		
		assertArrayEquals(expected, actual);
	}

}
