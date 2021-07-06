package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.to.Student;

public class StudentDao {
	
	
	public List<String> getStudentTest1Marks() throws Exception{
		
		List<String> studentMarks = new ArrayList<>();
		
		Connection connection = Connectivity.getConnection();
		
		String query = "select s.id, CONCAT(s.fname, \" \", s.lname) name, m.testno,  "
				+ "(m.m1+m.m2+m.m3) total from student s LEFT OUTER JOIN "
				+ "marks m on s.id=m.id and m.testno=1;";
		
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		
		ResultSet resultSet = preparedStatement.executeQuery();
		
		studentMarks.add("id\tname\t\ttestno\ttotal");
		
		while(resultSet.next()) {
			studentMarks.add(resultSet.getInt(1) + "\t" + resultSet.getString(2) 
			+ "\t" + resultSet.getString(3) + "\t" + resultSet.getString(4));
		}
		
		return studentMarks;
	}
	
	
	public boolean deleteStudent(int id) throws ClassNotFoundException, SQLException {
		Connection connection = Connectivity.getConnection();
		
		String query = "DELETE from student Where id=?";
		
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		preparedStatement.setInt(1, id);
		
		preparedStatement.executeUpdate();
		
		return true;
	}
	
	public boolean updateStudent(Student student) throws ClassNotFoundException, SQLException {
		
		Connection connection = Connectivity.getConnection();
		
		String query = "UPDATE student SET fname=?, lname=?, "
				+ "dob=?, area=? Where id=?";
		
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		preparedStatement.setString(1, student.getFname());
		preparedStatement.setString(2, student.getLname());
		preparedStatement.setString(3, student.getDob());
		preparedStatement.setString(4, student.getArea());
		preparedStatement.setInt(5, student.getId());
		
		preparedStatement.executeUpdate();
		
		return true;
		
		
	}
	
	
	public boolean saveStudent(Student student) throws Exception {
		
		Connection connection = Connectivity.getConnection();
		
		String query = "INSERT INTO student values (?,?,?,?,?)";
		
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		preparedStatement.setInt(1, student.getId());
		preparedStatement.setString(2, student.getFname());
		preparedStatement.setString(3, student.getLname());
		preparedStatement.setString(4, student.getDob());
		preparedStatement.setString(5, student.getArea());
		
		preparedStatement.executeUpdate();
		
		return true;
	}
	
	
	public Student getAnyStudent (int id) throws Exception {
		
		Student student;
		
		Connection connection = Connectivity.getConnection();
		
		String query = "SELECT * FROM student WHERE id=?";
		
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		preparedStatement.setInt(1, id);
		
		ResultSet resultSet = preparedStatement.executeQuery();
		
		if(resultSet.next()) {
			student = new Student(resultSet.getInt(1), resultSet.getString(2), 
					resultSet.getString(3),resultSet.getString(4),
					resultSet.getString(5));
		}
		else {
			throw new Exception("User does not exists");
		}
		
		
		return student;
		
	}
	
	
	public List<Student> getAllStudent() throws ClassNotFoundException, SQLException {
		
		List<Student> students = new ArrayList<>();
		
		Connection connection = Connectivity.getConnection();
		
		
		String query = "SELECT * FROM student";
		
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		ResultSet resultSet = preparedStatement.executeQuery();
		
		// result set pointer will be on the BOF(beginning of file)
		//Only when we do .next() it will go to the first record
		while(resultSet.next()) {
			//ORM (Object relation Mapping)
			students.add(new Student(resultSet.getInt(1), resultSet.getString(2), 
					resultSet.getString(3),resultSet.getString(4),
					resultSet.getString(5)));
		}
		
		return students;
		
	}
	
}
