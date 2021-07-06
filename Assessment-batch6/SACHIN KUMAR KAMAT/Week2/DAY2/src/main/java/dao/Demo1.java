package dao;

import java.util.*;

import Entity.Student;

public class Demo1 {

	public static void main(String[] args) throws Exception{
		
			StudentDAO dao = new StudentDAO();
			//System.out.println("main");
			//System.out.println(dao.insertStudent(new Student("s105", "VVS", "Laxman", "1976/01/01","Chaar minar")));	
			
			List<Student> list = dao.getStudents();
			
			for(Student stud : list) {
				System.out.println(stud);
			}
	}
}
