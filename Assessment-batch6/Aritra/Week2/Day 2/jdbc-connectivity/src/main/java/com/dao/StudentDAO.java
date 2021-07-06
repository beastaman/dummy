package com.dao;

import java.sql.*;
import java.util.*;

import com.to.Student;

public class StudentDAO {
	
public Student getAnyStudent(String id) throws Exception{
		
		Student student;
		Connection connection = Connectivity.getConnection();	
		
		String q = "select * from student where id = ?";
		PreparedStatement ps = connection.prepareStatement(q);
		ResultSet rs = ps.executeQuery();
		
		if(rs.next()) {
			student = new Student(rs.getString(1),rs.getString(2),rs.getString(3),
					rs.getString(4),rs.getString(5));
		}
		else
			throw new Exception("User does not exist");
		
		return student;
	}
	
	public List<Student> getAllStudent() throws Exception{
		
		List<Student> students = new ArrayList<>();
		Connection connection = Connectivity.getConnection();	
		
		String q = "select * from student";
		
		PreparedStatement ps = connection.prepareStatement(q);
		ResultSet rs = ps.executeQuery();
		//resultSet pointer will be at bof --> only when we go to next it will go to next round
		while(rs.next()) {
			students.add(new Student(rs.getString(1),rs.getString(2),rs.getString(3),
					rs.getString(4),rs.getString(5)));
		}
		
		return students;
	}
	
}
