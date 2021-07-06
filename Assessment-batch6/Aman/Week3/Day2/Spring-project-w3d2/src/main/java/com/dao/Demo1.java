package com.dao;
import java.util.*;

import com.to.Student;

import java.sql.*;
public class Demo1 {
	public static void main(String[] args) {
		try {

			//Student student = new Student("s108", "Barry", "Allen", "1995/02/26", "Defn", "114651111");
			/*Student student = new Student("s108", "Barri", "Stark", "1995/02/26", "Defn", "114651111");
			StudentDAO studentDAO = new StudentDAO();
			System.out.println(studentDAO.updateStudent(student));
			Student student2 = studentDAO.getAnyStudent("s108");
			System.out.println(student2);*/
			/*System.out.println(studentDAO.insertStudent(student));
			List<Student> students = studentDAO.getAllStudent();
			System.out.println(students);*/
			/*System.out.println(studentDAO.deleteStudent(student));
			student2 = studentDAO.getAnyStudent("s108");
			System.out.println(student2);*/
			

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
