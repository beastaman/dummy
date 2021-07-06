package com.sapient.dao;

import java.util.*;

import com.sapient.to.Student;

public class Demo {
	//join , delete, update
	public static void main(String[] args) {
		
		try {

			StudentDAO studentDAO = new StudentDAO();
			List<Student> students = studentDAO.getAllStudent();
			students.forEach(System.out::println);
			
			System.out.println("-------------- ");
			Student student= studentDAO.getAnyStudent("s101");
			System.out.println(student);
			
			System.out.println("-------------- ");
			studentDAO.deleteStudent("s108");
			
			List<Student> students1 = studentDAO.getAllStudent();
			students1.forEach(System.out::println);
			
			System.out.println("-------------- ");
			Student student1 = new Student("s108","Kuldeep","Rathore","1990/12/23","Bangalore");
			studentDAO.insertStudentData(student1);
			
			System.out.println("-------------- ");
			studentDAO.updateStudentArea("s108","Amritsar");
			
			System.out.println("-------------- ");
			studentDAO.joinTwoTables();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
