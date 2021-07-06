package com.dao;

import java.util.List;

import com.to.StudentAndCities;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			// boolean b = studentdao.saveStudent(new Student("s109", "User1", "lname1",
			// "1990/10/10", "delhi"));

			StudentDAO studentdao = new StudentDAO();
			// Student student1 = studentdao.getAnyStudent("s101");
			
			// System.out.println("-----------------------------");

			List<StudentAndCities> studentAndCities = studentdao.getStudentsAndTheirCity();

			studentAndCities.forEach(System.out::println);

//			List<Student> students = studentdao.getAllStudent();

//			students.forEach(System.out::println);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
