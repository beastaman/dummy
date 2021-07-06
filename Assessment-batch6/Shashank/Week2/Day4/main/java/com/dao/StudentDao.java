package com.dao;

import java.util.ArrayList;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;

import com.to.*;
import com.Constant.*;

public class StudentDao {
	
	public List<Student> getAllStudent() throws Exception{
		
		
		List<Student> students = new ArrayList<>();
		
		Connection connection =Connectivity.getConnection();
		
		 PreparedStatement preparedStatement = connection.prepareStatement(Constant.Get_All_Student);
		 //String query = connection.preparedStatement();//"Select * from student";// constant.Get_All_Student
				 
		
		 ResultSet resultSet = preparedStatement.executeQuery();
		 
		
		 while(resultSet.next()) {
				students.add(new Student(resultSet.getString(1) , resultSet.getString(2) ,resultSet.getString(3) ,resultSet.getString(4) ,resultSet.getString(5)));
				
			}
			
				
		
		return students;
		
	}
	public void insertStudent(Student student) throws Exception{
		Connection connection =Connectivity.getConnection();
		System.out.println("inside insert student");
		 //String query = "Select * from student";// constant.saveStudent
		 PreparedStatement preparedStatement = connection.prepareStatement(Constant.saveStudent);
		
		 System.out.println("constant query prepared");
		 preparedStatement.setString(1, student.getId());
		 preparedStatement.setString(2, student.getFname());
		 preparedStatement.setString(3, student.getLname());
		 preparedStatement.setString(4, student.getDob());
		 preparedStatement.setString(5, student.getArea());
		preparedStatement.executeUpdate();
		 //preparedStatement.setString(1, student.get;
		
		
	}

}
