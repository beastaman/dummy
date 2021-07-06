package com.sapient.dao.mysql;

import java.sql.Date;
import java.util.List;

import com.sapient.to.Student;
import com.sapient.to.StudentMarks;

public class Demo {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		try {
			StudentDao studentDao = new StudentDao();
			
			System.out.println("All Students");
			List<Student> students = studentDao.getAllStudents();
			students.forEach(System.out::println);
			System.out.println();
			
			String id = "s105";
			System.out.println("Student with Id : " + id);
			Student student = studentDao.getStudentById(id);
			System.out.println(student);
			System.out.println();

			id = "s108";
			student = studentDao.getStudentById(id);
			System.out.println("Deleting Student : " + student);
			studentDao.deleteStudent(id);
			System.out.println();
			
			student = new Student("s108", "Hardik", "Pandya", new Date(90, 7, 20), "Andheri West");
			System.out.println("Inserting New Student : " + student);
			studentDao.saveStudent(student);
			student = studentDao.getStudentById("s108");
			System.out.println(student);
			System.out.println();
			
			student.setArea("Delhi");
			System.out.println("Updating Student : " + student);
			studentDao.updateStudent(student);
			student = studentDao.getStudentById("s108");
			System.out.println(student);
			System.out.println();

			System.out.println("All Students");
			students = studentDao.getAllStudents();
			students.forEach(System.out::println);
			System.out.println();
			
			System.out.println("Student Marks");
			List<StudentMarks> studentMarks = studentDao.getStudentMarks();
			studentMarks.forEach(System.out::println);
			System.out.println();
		}
		catch(Exception e) {
			System.err.println(e.getMessage());
		}
	}

}
