package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.to.Student;
import com.to.StudentJoinMark;

public class StudentDAO {

	public boolean deleteStudent(String id) throws Exception {

		Connection connection = Connectivity.getConnection();

		String query = "Delete from student where id = ?";

		PreparedStatement preparedStatement = connection.prepareStatement(query);
		preparedStatement.setString(1, id);

		preparedStatement.executeUpdate();
		return true;

	}

	public boolean updateStudent(Student student) throws Exception {

		Connection connection = Connectivity.getConnection();

		String query = "Update student set id = ?, Fname = ?, Lname = ?, Dob = ?,area = ?, mobileno = ? where id = ? ";

		PreparedStatement preparedStatement = connection.prepareStatement(query);
		preparedStatement.setString(1, student.getId());
		preparedStatement.setString(2, student.getFname());
		preparedStatement.setString(3, student.getLname());
		preparedStatement.setString(4, student.getDob());
		preparedStatement.setString(5, student.getArea());
		preparedStatement.setString(6, student.getMobileno());
		preparedStatement.setString(7, student.getId());

		preparedStatement.executeUpdate();
		return true;

	}

	public boolean insertStudent(Student student) throws Exception {

		Connection connection = Connectivity.getConnection();

		String query = "Insert into student values(?,?,?,?,?,?)";

		PreparedStatement preparedStatement = connection.prepareStatement(query);
		preparedStatement.setString(1, student.getId());
		preparedStatement.setString(2, student.getFname());
		preparedStatement.setString(3, student.getLname());
		preparedStatement.setString(4, student.getDob());
		preparedStatement.setString(5, student.getArea());
		preparedStatement.setString(6, student.getMobileno());

		preparedStatement.executeUpdate();
		return true;
	}

	public Student getAnyStudent(String id) throws Exception {

		Student student;
		Connection connection = Connectivity.getConnection();

		String query = "Select * from student where id = ?";

		PreparedStatement preparedStatement = connection.prepareStatement(query);
		preparedStatement.setString(1, id);

		ResultSet resultSet = preparedStatement.executeQuery();

		if (resultSet.next()) {
			student = new Student(resultSet.getString(1), resultSet.getString(2), resultSet.getString(3),
					resultSet.getString(4), resultSet.getString(5), resultSet.getString(6));
		} else {

			throw new Exception("User doesn't exist ");
		}

		return student;

	}

	public List<Student> getAllStudent() throws Exception {

		List<Student> students = new ArrayList<>();
		Connection connection = Connectivity.getConnection();

		String query = "Select * from student";

		PreparedStatement preparedStatement = connection.prepareStatement(query);

		ResultSet resultSet = preparedStatement.executeQuery();

		while (resultSet.next()) {
			students.add(new Student(resultSet.getString(1), resultSet.getString(2), resultSet.getString(3),
					resultSet.getString(4), resultSet.getString(5), resultSet.getString(6)));
		}

		return students;

	}

	public List<StudentJoinMark> getAllStudentMarks() throws Exception {

		List<StudentJoinMark> students = new ArrayList<>();
		Connection connection = Connectivity.getConnection();

		String query = "Select * from student Natural join marks";

		PreparedStatement preparedStatement = connection.prepareStatement(query);

		ResultSet resultSet = preparedStatement.executeQuery();

		while (resultSet.next()) {
			students.add(new StudentJoinMark(resultSet.getString(1), resultSet.getString(2), resultSet.getString(3),
					resultSet.getString(4), resultSet.getString(5), resultSet.getString(6), resultSet.getInt(7),
					resultSet.getInt(8), resultSet.getInt(9), resultSet.getInt(10)));
		}

		return students;

	}

}
