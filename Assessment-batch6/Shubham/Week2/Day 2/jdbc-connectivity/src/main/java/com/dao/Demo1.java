package com.dao;


import java.util.List;

import com.to.Student;

public class Demo1 {
	public static void main(String[] args) {
		
		try {
	
			StudentDAO studentDAO = new StudentDAO();
			//insert
			Student student3=new Student("s111", "shubham", "agrawal", "1999/01/01", "9876543210", "mumbai");
			
			System.out.println(studentDAO.saveStudent(student3));
			
			
			//query to print table
			List<Student> student=studentDAO.getAllStudent();
			
			student.forEach(System.out::println);
			
			System.out.println();
			
			//query to get student from id
			Student student2=studentDAO.getAnyStudent("s101");
			
			System.out.println(student2);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
}
