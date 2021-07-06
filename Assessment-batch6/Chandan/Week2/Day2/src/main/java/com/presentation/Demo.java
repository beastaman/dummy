package com.presentation;

import java.util.List;

import com.dao.StudentDao;
import com.to.Student;

public class Demo {
	
	public static void main(String[] args) {
		
		try {
			
			StudentDao studentDao = new StudentDao();
			
			Student student1 = new Student(104, "Chandan", "Maji", "1999/04/05", "Newtown");
			
//			System.out.println(studentDao.saveStudent(student1));
			
			System.out.println(studentDao.updateStudent(student1));
			
			System.out.println(studentDao.deleteStudent(104));
			
			
			List<Student> students = studentDao.getAllStudent();
			
			students.forEach(System.out::println);
			
			System.out.println();
			
			Student student = studentDao.getAnyStudent(101);
			System.out.println(student);
			
			
			System.out.println();
			
			List<String> studentTest1Marks = studentDao.getStudentTest1Marks();
			studentTest1Marks.forEach(System.out::println);
			
			
			
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
}
