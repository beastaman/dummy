package dao;

import java.util.*;
import to.Student;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			StudentDAO studentDAO = new StudentDAO();
			
			List<Student> st = StudentDAO.getAllStudents();
			
			st.forEach(System.out::println);
			
			String conditions[] = {"id == \"101\""};
			
			System.out.println(StudentDAO.deleteStudent(conditions));
			
			//Student student=new Student("104","Jassu","Peela","1999/08/12","AP","6666666666");
			//System.out.println(studentDAO.addStudent(student));
			//studentDAO.getTotalMarks().forEach(System.out::println);;
			System.out.println(studentDAO.getAnyStudent("104"));
			
			
		}
		catch(Exception e){
			System.out.println(e);
		}
	}

}
