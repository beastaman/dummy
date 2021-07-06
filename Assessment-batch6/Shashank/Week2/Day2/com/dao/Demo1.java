package com.dao;

import java.util.*;

import com.to.Student;
public class Demo1 {
	
	public static void main(String[] args) {
		try {
			StudentDAO studentDAO = new StudentDAO();
			Student student =new Student("s111" , "shashank" , "bhardwaj" , "2000/01/01", "99999213" , "NAJAF");
			/*
			List<Student> student = studentDAO.getAllStudent();
			
			student.forEach(System.out::println);
			System.out.println("--------");
			Student student2 =  studentDAO.getAnyStudent("s101");
			System.out.println(student2);
			*/
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
