package p2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UserDefinedExceptionTest {

	@Test
	void test1() {
		String actual = UserDefinedExceptionDemo.check(10);
		String expected = "Even Number accepted";
		assertEquals(expected, actual);
	}

	@Test
	void test2() {
		String actual = UserDefinedExceptionDemo.check(151);
		String expected = "Odd Number not accepted";
		assertEquals(expected, actual);
	}

	@Test
	void test7() {
		int actual = 10 + 20;
		int expected = 30 + 0;
		assertEquals(expected, actual);
	}

	@Test
	void test3() {
		Employee emp = new Employee(1632, "Emp", 30);
		int actual = emp.getId();
		int expected = 1632;
		assertEquals(expected, actual);
	}
	
	@Test
	void test4() {
		Employee emp = new Employee(1632, "Emp", 30);
		String actual = emp.getName();
		String expected = "Emp";
		assertEquals(expected, actual);
	}

	@Test
	void test5() {
		Employee emp = new Employee(1632, "Emp", 30);
		int actual = emp.getAge();
		int expected = 30;
		assertEquals(expected, actual);
	}

	@Test
	void test6() {
		Employee emp = new Employee(1632, "Emp", 30);
		String actual = emp.toString();
		String expected = "Employee [id=1632, name=Emp, age=30]";
		assertEquals(expected, actual);
	}
}
