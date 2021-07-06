package com.dao;

import java.sql.*;
import java.util.*;

import com.to.*;

public class StudentDAO {

//	select id, fname, (m1 + m2 + m3) 'total marks' , cname from student NATURAL JOIN marks NATURAL Join connect NATURAL JOIN city;
	
	public List<Custum> joinStudent () throws Exception {
		List<Custum> custums = new ArrayList<>();
		
		Connection connection = Connectivity.getConnection();

		String query = "select id, fname, (m1 + m2 + m3) 'total marks' , cname from student NATURAL JOIN marks NATURAL Join connect NATURAL JOIN city";
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		
		ResultSet resultSet = preparedStatement.executeQuery();
		
		while(resultSet.next()) {
			custums.add(new Custum(resultSet.getString(1),resultSet.getString(2),resultSet.getString(3),resultSet.getString(4)));
		}
		
		return custums;
	}
	
	public String deleteStudent(String id) throws Exception {
		Connection connection = Connectivity.getConnection();

		String query = "delete from student where id = ?";
		PreparedStatement preparedStatement = connection.prepareStatement(query);

		preparedStatement.setString(1, id);

		preparedStatement.executeUpdate();

		return "Deleted sucessfully";

	}
	
	public String updateStudent(Student student) throws Exception {
		Connection connection = Connectivity.getConnection();

		String query = "UPDATE student set fname = ? , lname = ? where id = ?";
		PreparedStatement preparedStatement = connection.prepareStatement(query);

		preparedStatement.setString(1, student.getFname());
		preparedStatement.setString(2, student.getLname());
		preparedStatement.setString(3, student.getId());

		preparedStatement.executeUpdate();

		return "Updated Successfully";

	}

	public boolean saveStudent(Student student) throws Exception {
		Connection connection = Connectivity.getConnection();

		String query = "insert into student values (?,?,?,?,?,?)";

		PreparedStatement preparedStatement = connection.prepareStatement(query);

		preparedStatement.setString(1, student.getId());
		preparedStatement.setString(2, student.getFname());
		preparedStatement.setString(3, student.getLname());
		preparedStatement.setString(4, student.getDob());
		preparedStatement.setString(5, student.getPhoneNo());
		preparedStatement.setString(6, student.getArea());

		preparedStatement.executeUpdate();

		return true;

	}

	public Student getAnyStudent(String id) throws Exception {

		Student student = null;

		Connection connection = Connectivity.getConnection();

		String query = "SELECT * from student where id = ?";

		PreparedStatement preparedStatement = connection.prepareStatement(query);

		preparedStatement.setString(1, id);

		ResultSet resultSet = preparedStatement.executeQuery();

		if (resultSet.next()) {
			student = new Student(resultSet.getString(1), resultSet.getString(2), resultSet.getString(3),
					resultSet.getString(4), resultSet.getString(5), resultSet.getString(6));
		}

		else {
			throw new Exception("User doesnot exists");
		}

		return student;
	}

	public List<Student> getAllStudent() throws Exception {

		List<Student> students = new ArrayList<>();

		Connection connection = Connectivity.getConnection();

		// statement -> multiple query | PS -> for single query (faster)

		String query = "SELECT * from student";

		PreparedStatement preparedStatement = connection.prepareStatement(query);

		ResultSet resultSet = preparedStatement.executeQuery();

		// resultSet pointer will be at BOF--> only when we go to the next , it will go
		// to the first record

		while (resultSet.next()) {
			students.add(new Student(resultSet.getString(1), resultSet.getString(2), resultSet.getString(3),
					resultSet.getString(4), resultSet.getString(5), resultSet.getString(6)));
		}

		return students;
	}

}
