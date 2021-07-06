package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.to.Student;

public class StudentDAO {

	public boolean saveStudent(Student student) throws Exception{
		
		Connection connection = Connectivity.getConnection();
		
		String query = "Insert into student values (?,?,?,?,?,?)";
		
		PreparedStatement ps=connection.prepareStatement(query);
		ps.setString(1, student.getId());
		ps.setString(2, student.getFname());
		ps.setString(3, student.getLname());
		ps.setString(4, student.getDob());
		ps.setString(5, student.getPhoneNo());
		ps.setString(6, student.getArea());
		
		ps.executeUpdate();
		
		return true;
	}
	
	public boolean removeStudent(String condition) throws Exception{
		
				Connection connection = Connectivity.getConnection();
				
				String query = "Delete from student where ? ";
				
				PreparedStatement ps=connection.prepareStatement(query);
				ps.setString(1,condition);
				ps.executeUpdate(query);
				
				return true;
			}
	
	public boolean joinStudent(String condition) throws Exception{
		
				Connection connection = Connectivity.getConnection();
				
				String query = "Select * from Student NATURAL JOIN Marks ";
				
				PreparedStatement ps=connection.prepareStatement(query);
				
				ps.executeQuery(query);
				
				return true;
			}
	public boolean updateStudent(String condition) throws Exception{
		
		Connection connection = Connectivity.getConnection();
		
		String query = "UPDATE Student SET AREA=\"DELHI\" where id=s101";
		
		PreparedStatement ps=connection.prepareStatement(query);
		
		ps.executeQuery(query);
		
		return true;
	}
	
	public Student getAnyStudent(String id) throws Exception{
		
		
		Connection connection = Connectivity.getConnection();
		
		String query = "SELECT * from student where id = ?";
		
		PreparedStatement ps=connection.prepareStatement(query);
		
		ps.setString(1, id);
		
		ResultSet resultSet = ps.executeQuery();
		
		if(resultSet.next()) {
			return new Student(resultSet.getString(1),resultSet.getString(2),resultSet.getString(3),resultSet.getString(4),resultSet.getString(5),resultSet.getString(6));
		}
		else
		{
			throw new Exception("User Does not Exist");
		}
	}
	
	public List<Student> getAllStudent() throws Exception{
		
		List<Student> students = new ArrayList<Student>();
		
		Connection connection = Connectivity.getConnection();
		
		String query = "SELECT * from student";
		
		PreparedStatement ps=connection.prepareStatement(query);
		
		ResultSet resultSet = ps.executeQuery();
		
		//resultset pointer will be on the bof. only when we go to the next it will go to the first record
		while(resultSet.next())
		{
			students.add(new Student(resultSet.getString(1),resultSet.getString(2),resultSet.getString(3),resultSet.getString(4),resultSet.getString(5),resultSet.getString(6)));
		}
		
		return students;
	}
}
