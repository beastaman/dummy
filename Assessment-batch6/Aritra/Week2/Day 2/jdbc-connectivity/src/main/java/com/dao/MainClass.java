package com.dao;

import java.util.List;

import com.to.Student;

public class MainClass {

	public static void main(String[] args) {
		
		try {
			StudentDAO studentDAO = new StudentDAO();
			List<Student> ls = studentDAO.getAllStudent();
			
			ls.forEach(System.out::println);
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
