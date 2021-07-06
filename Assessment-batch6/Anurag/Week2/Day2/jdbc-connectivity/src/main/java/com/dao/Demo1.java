package com.dao;

import java.util.*;

import com.to.*;

public class Demo1 {

	public static void main(String[] args) {

		try {
			System.out.println("hello");

			StudentDAO studentDAO = new StudentDAO();
			
			//update
			
			List<Custum> custums = studentDAO.joinStudent();
			
			custums.forEach(System.out::println);
			
		//	Student student2 = new Student("s101", "anurag", "solanki", "1999/01/01", "987521672", "delhi");
//
//		System.out.println(studentDAO.updateStudent(student2));
//			
//			System.out.println(studentDAO.getAnyStudent("s101"));
			
			
//
//			Student student = new Student("s112", "anurag", "solanki", "1999/01/01", "987521672", "delhi");
//			
//			System.out.println(studentDAO.saveStudent(student));
//			
//			
//			//Join delete Update
//			
//			//delete
//			String id = "s111";
//			System.out.println(studentDAO.deleteStudent(id));
//			
//			//update
//			Student student1 = new Student("s112", "wasim", "jafar", "1999/01/01", "987521672", "delhi");
//			
//			
//			
//
//			List<Student> students = studentDAO.getAllStudent();
//
//			students.forEach(System.out::println);
//
//			System.out.println("-----------------");
//
//			Student student2 = studentDAO.getAnyStudent("s101");
//
//			System.out.println(student2);
//
//			Student student3 = studentDAO.getAnyStudent("s111");
//
//			System.out.println(student3);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
