package com.dao;
import java.util.*;

import com.to.Marks;
import com.to.Student;
import com.to.StudentAndMarks;
public class Demo1 {

	public static void main(String[] args)
	{
		try
		{
			
			StudentDAO studentDAO= new StudentDAO();
			
			Student s1= new Student("s101", "Christina", "Aguilera", "1973/02/20", "Boston");
			List<Student> student= studentDAO.getAllStudent();
			student.forEach(System.out::println);
			studentDAO.UpdateStudentRecord(s1, "s101");
			System.out.println("-----");
			student=studentDAO.getAllStudent();
			student.forEach(System.out::println);
			
			Marks m1= new Marks("s101", 1, 12, 23, 41);
			
			List<StudentAndMarks> test= studentDAO.joinStudentAndMarks();
			test.forEach(System.out::println);
			/*Student student1= new Student("s111", "shreya", "Raj", "1999/11/25", "Delhi");
			studentDAO.saveStudent(student1);
			 student= studentDAO.getAllStudent();
			student.forEach(System.out::println);
			studentDAO.DeleteStudentRecord("s111");
			student= studentDAO.getAllStudent();
			student.forEach(System.out::println); */
			
			
			//join, delete, update
			
			
			/*System.out.println("-----");
			Student student2= studentDAO.getAnyStudent("s102");
			System.out.println(student2); */
		} catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
