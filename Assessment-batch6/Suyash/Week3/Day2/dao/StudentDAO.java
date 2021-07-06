package com.dao;
import java.sql.*;
import java.util.*;

import com.to.Student;

public class StudentDAO {
	
	public boolean deleteStudent() throws Exception{
		Connection connection=connectivity.getConnection();
		String query="DELETE FROM student WHERE id= ?";
		
		PreparedStatement preparedStatement=connection.prepareStatement(query);
		preparedStatement.setString(1, "s103");
		
		preparedStatement.executeUpdate();
		
		return true;
	}
	
	
	public boolean updateStudent() throws Exception{
		Connection connection=connectivity.getConnection();
		String query ="UPDATE student SET id = ?, fname = ?,lname= ?,dob=?,area=? where id=?";
		
		PreparedStatement preparedStatement=connection.prepareStatement(query);
		
		preparedStatement.setString(1,"s11" );
		preparedStatement.setString(2, "suyash");
		preparedStatement.setString(3, "baghel");
		preparedStatement.setString(4, "1999/02/03");
		preparedStatement.setString(5, "Jhansi");
		preparedStatement.setString(6, "s22");
		
		preparedStatement.executeUpdate();
		
		return true;
	}
	
	public boolean saveStudent(Student student) throws Exception{
		Connection connection=connectivity.getConnection();
		String query ="insert into student values (?,?,?,?,?)";
		
		PreparedStatement preparedStatement=connection.prepareStatement(query);
		
		preparedStatement.setString(1, student.getId());
		preparedStatement.setString(2, student.getFname());
		preparedStatement.setString(3, student.getLname());
		preparedStatement.setString(4, student.getDob());
		preparedStatement.setString(5, student.getArea());
		
		preparedStatement.executeUpdate();
		
		return true;
	}
	
	public Student getAnyStudent(String id) throws Exception{
		Student student=null;
		Connection connection=connectivity.getConnection();
		String query="SELECT *from student where id= ?";
		PreparedStatement preparedStatement=connection.prepareStatement(query);
		preparedStatement.setString(1, id);
		ResultSet resultSet=preparedStatement.executeQuery();
		//resultset pointer will be at BOF(beginning of file) so we keep doing next --->
		if(resultSet.next()) {
			student=new Student(resultSet.getString(1),resultSet.getString(2),resultSet.getString(3),resultSet.getString(4),resultSet.getString(5));
		}
		else {
			throw new Exception("User does not exist");
		}
		return student;
	}
	
	
	public List<Student> getAllStudent() throws Exception{
		List<Student> students=new ArrayList<>();
		Connection connection=connectivity.getConnection();
		String query="SELECT *from student";
		PreparedStatement preparedStatement=connection.prepareStatement(query);
		ResultSet resultSet=preparedStatement.executeQuery();
		//resultset pointer will be at BOF(beginning of file) so we keep doing next --->
		while(resultSet.next()) {
			students.add(new Student(resultSet.getString(1),resultSet.getString(2),resultSet.getString(3),resultSet.getString(4),resultSet.getString(5)));
			
		}
		return students;
	}
}
