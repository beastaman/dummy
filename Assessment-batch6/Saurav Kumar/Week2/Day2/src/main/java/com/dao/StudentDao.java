package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;

import com.mysql.cj.xdevapi.PreparableStatement;
import com.to.Student;

public class StudentDao {
	
	public List<InnerJoinPOJO> innerJoinQuery() throws Exception {
		List<InnerJoinPOJO> list = new ArrayList<InnerJoinPOJO>();
		
		Connection connection = Connectivity.getConnection();
		
		String query = "SELECT a.id, a.fname, b.testno, (b.m1 + b.m2 + b.m3) 'total' \r\n"
				+ "from student a INNER JOIN marks b ON (a.id = b.id AND b.testno = 1);";
		PreparedStatement preparedStudent = connection.prepareStatement(query);
		ResultSet resultSet = preparedStudent.executeQuery();
		
		// point will be at BOF, if we give next() then only it will move to the next record
		while(resultSet.next()) {
			list.add(new InnerJoinPOJO(resultSet.getString(1), resultSet.getString(2), 
					resultSet.getString(3), resultSet.getString(4)));
		}
		
		return list;
	}
	
	public void updateRecord(String id) throws Exception {
		Connection connection = Connectivity.getConnection();
		
		String query = "UPDATE student SET fname = 'Harry' WHERE "
				+ "id = ?";
		PreparedStatement preparedStudent = connection.prepareStatement(query);
		preparedStudent.setString(1, id);
		
		preparedStudent.executeUpdate();
	}
	
	public void deleteData(String id) throws Exception {
		Connection connection = Connectivity.getConnection();
		
		String query = "DELETE FROM student WHERE id = ?";
		PreparedStatement preparedStudent = connection.prepareStatement(query);
		preparedStudent.setString(1, id);
		
		preparedStudent.executeUpdate();
	}
	
	public boolean InsertData(Student student) throws Exception {
		Connection connection = Connectivity.getConnection();
		
		String query = "INSERT INTO student VALUES (?, ?, ?, ?, ?)";
		PreparedStatement preparedStudent = connection.prepareStatement(query);
		preparedStudent.setString(1, student.getId());
		preparedStudent.setString(2, student.getFname());
		preparedStudent.setString(3, student.getLname());
		preparedStudent.setString(4, student.getDob());
		preparedStudent.setString(5, student.getArea());
		
		preparedStudent.executeUpdate();
		
		return true;
	}
	
	public Student getAnyStudent(String id) throws Exception {
		Student student;
		Connection connection = Connectivity.getConnection();
		
		String query = "SELECT * FROM student where id = ?";
		PreparedStatement preparedStudent = connection.prepareStatement(query);
	
		preparedStudent.setString(1, id);
		
		ResultSet resultSet = preparedStudent.executeQuery();
		
		if(resultSet.next()) {
			student = new Student(resultSet.getString(1), resultSet.getString(2), 
					resultSet.getString(3), resultSet.getString(4),
					resultSet.getString(5));
		}
		else {
			throw new Exception("user does not exist");
		}
		
		return student;
	}
	
	public List<Student> getAllStudent() throws Exception{
		List<Student> list = new ArrayList<Student>();
		
		Connection connection = Connectivity.getConnection();
		
		String query = "SELECT * FROM student";
		PreparedStatement preparedStudent = connection.prepareStatement(query);
		ResultSet resultSet = preparedStudent.executeQuery();
		
		// point will be at BOF, if we give next() then only it will move to the next record
		while(resultSet.next()) {
			list.add(new Student(resultSet.getString(1), resultSet.getString(2), 
					resultSet.getString(3), resultSet.getString(4),
					resultSet.getString(5)));
		}
		
		return list;
	}
	
}
