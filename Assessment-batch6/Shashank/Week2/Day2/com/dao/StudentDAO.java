package com.dao;

import java.util.*;
import java.sql.*;
import java.sql.PreparedStatement;

import com.to.Student;
public class StudentDAO {
	// update delete join
	
public boolean DeleteStudent (String id ) throws Exception{
		
		Connection connection =Connectivity.getConnection();
		
		 String query = "Delete from Student   where id =? ";
		 PreparedStatement preparedStatement = connection.prepareStatement(query);
		 // pointer will be now at BOF -- play when we go to next , it will go to the first record
		 preparedStatement.setString(1 , id);
		 
		 preparedStatement.execute();
		 
			 
		 
		 
		 return true;
		
	}
	public boolean UpdateStudent (String id , String fname) throws Exception{
		
		Connection connection =Connectivity.getConnection();
		
		 String query = "Update Student  SET fname = ? where id =?";
		 PreparedStatement preparedStatement = connection.prepareStatement(query);
		 // pointer will be now at BOF -- play when we go to next , it will go to the first record
		 preparedStatement.setString(1 , id);
		 preparedStatement.setString(2, fname);
		 preparedStatement.execute();
		 
			 
		 
		 
		 return true;
		
	}
	// join
	public Student joinStudent(String id )throws Exception {
		Student student;
		Connection connection =Connectivity.getConnection();
		
		 String query = "Select * from Student Inner join marks On student.id = marks.id";
		 PreparedStatement preparedStatement = connection.prepareStatement(query);
		 // pointer will be now at BOF -- play when we go to next , it will go to the first record
		 
		 ResultSet resultSet = preparedStatement.executeQuery();
		 
		 if(resultSet.next()) {
			 student = (new Student(resultSet.getString(1) , resultSet.getString(2) , resultSet.getString(3) , resultSet.getString(4)  , resultSet.getString(5)  , resultSet.getString(6) ));
		 }
		 else {
			 throw new Exception("User Doesn't Exist");
			 
		 }
		 return student;
		
	}
	public boolean saveStudent (Student student) throws Exception{
		Connection connection =Connectivity.getConnection();
		
		 String query = "Insert into student values (?,?,?,?,?,?)";
		 PreparedStatement preparedStatement = connection.prepareStatement(query);
		 preparedStatement.setString(1,student.getId());
		 preparedStatement.setString(2,student.getFname());
		 preparedStatement.setString(3,student.getLname());
		 preparedStatement.setString(4,student.getDob());
		 preparedStatement.setString(5,student.getPhoneNo());
		 preparedStatement.setString(6,student.getArea());
		 
		 preparedStatement.executeUpdate();
		 return true;
		
	}
	public Student getAnyStudent(String id )throws Exception {
		Student student;
		Connection connection =Connectivity.getConnection();
		
		 String query = "Select * from Student where id =?";
		 PreparedStatement preparedStatement = connection.prepareStatement(query);
		 // pointer will be now at BOF -- play when we go to next , it will go to the first record
		 preparedStatement.setString(1 , id);
		 ResultSet resultSet = preparedStatement.executeQuery();
		 
		 if(resultSet.next()) {
			 student = (new Student(resultSet.getString(1) , resultSet.getString(2) , resultSet.getString(3) , resultSet.getString(4)  , resultSet.getString(5)  , resultSet.getString(6) ));
		 }
		 else {
			 throw new Exception("User Doesn't Exist");
			 
		 }
		 return student;
		
	}
	
	
	 public List<Student> getAllStudent() throws Exception{
		 List<Student> students = new ArrayList<>();
		 
		 Connection connection =Connectivity.getConnection();
		 
		 String query = "Select * from Student";
		 PreparedStatement preparedStatement = connection.prepareStatement(query);
		 ResultSet resultSet = preparedStatement.executeQuery();
		 // resultSet pointer will be now at BOF -- play when we go to next , it will go to the first record
		 
		 while(resultSet.next()) {
			 students.add(new Student(resultSet.getString(1) , resultSet.getString(2) , resultSet.getString(3) , resultSet.getString(4)  , resultSet.getString(5)  , resultSet.getString(6) ));
		 }
		 
		 return students;
	 }

}
