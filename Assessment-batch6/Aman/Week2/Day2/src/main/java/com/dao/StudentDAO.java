package com.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;
import com.to.Student;
public class StudentDAO {
	public boolean insertStudent(Student student) throws Exception {

		Connection connection = Connnectivity.getConnection();

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
		Connection connection = Connnectivity.getConnection();

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
		Connection connection = Connnectivity.getConnection();

		String query = "Select * from student";

		PreparedStatement preparedStatement = connection.prepareStatement(query);

		ResultSet resultSet = preparedStatement.executeQuery();

		while (resultSet.next()) {
			students.add(new Student(resultSet.getString(1), resultSet.getString(2), resultSet.getString(3),
					resultSet.getString(4), resultSet.getString(5), resultSet.getString(6)));
		}

		return students;

	}
	public boolean updateStudent(Student student) throws Exception {

		Connection connection = Connnectivity.getConnection();
		String query = "Update student set fname=?,lname=?,dob=?,area=?,mobileno=? where id =?";
		//String query = "Insert into student values(?,?,?,?,?,?)";

		PreparedStatement preparedStatement = connection.prepareStatement(query);
		
		preparedStatement.setString(1, student.getFname());
		preparedStatement.setString(2, student.getLname());
		preparedStatement.setString(3, student.getDob());
		preparedStatement.setString(4, student.getArea());
		preparedStatement.setString(5, student.getMobileno());
		preparedStatement.setString(6, student.getId());

		preparedStatement.executeUpdate();
		return true;
	}
	public boolean deleteStudent(Student student) throws Exception {

		Connection connection = Connnectivity.getConnection();
		String query = "Delete from student where id =?";
		//String query = "Insert into student values(?,?,?,?,?,?)";

		PreparedStatement preparedStatement = connection.prepareStatement(query);
		
		/*preparedStatement.setString(1, student.getFname());
		preparedStatement.setString(2, student.getLname());
		preparedStatement.setString(3, student.getDob());
		preparedStatement.setString(4, student.getArea());
		preparedStatement.setString(5, student.getMobileno());*/
		preparedStatement.setString(1, student.getId());

		preparedStatement.executeUpdate();
		return true;
	}
	//private String area;
	public boolean innerJoin() throws Exception {

		Connection connection = Connnectivity.getConnection();
		/*String query = "Delete from student where id =?";
		//String query = "Insert into student values(?,?,?,?,?,?)";

		PreparedStatement preparedStatement = connection.prepareStatement(query);
		
		/*preparedStatement.setString(1, student.getFname());
		preparedStatement.setString(2, student.getLname());
		preparedStatement.setString(3, student.getDob());
		preparedStatement.setString(4, student.getArea());
		preparedStatement.setString(5, student.getMobileno());*/
		//preparedStatement.setString(1, student.getId());*/
		String query = "SELECT column_name(s)\r\n"
				+ "FROM table1\r\n"
				+ "LEFT JOIN table2\r\n"
				+ "ON table1.column_name = table2.column_name";
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		ResultSet resultSet = preparedStatement.executeQuery();
		
		return true;
	}
}
