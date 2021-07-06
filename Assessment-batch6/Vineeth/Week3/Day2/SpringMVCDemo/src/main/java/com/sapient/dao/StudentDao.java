package com.sapient.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.sapient.constants.Constants;
import com.sapient.to.Student;

public class StudentDao {

	public List<Student> getAllStudents() throws Exception {
		
		Connection connection = Connectivity.getConnection();
		
		PreparedStatement ps = connection.prepareStatement(Constants.GET_ALL_STUDENT_QUERY);
		ResultSet rs = ps.executeQuery();
		
		List<Student> students = new ArrayList<>();
		while(rs.next()) {
			students.add(new Student(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)));
		}
		
		return students;
	}
	
	public Student getStudentById(String id) throws Exception {
				
		Connection connection = Connectivity.getConnection();
		
		PreparedStatement ps = connection.prepareStatement(Constants.GET_STUDENT_BY_ID_QUERY);
		ps.setString(1, id);
		ResultSet rs = ps.executeQuery();
		
		Student student = null;
		if(rs.next()) {
			student = new Student(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
		}
		else throw new Exception("Student does not exist!");
		
		return student;
	}
	
	public boolean saveStudent(Student student) throws Exception {
		
		Connection connection = Connectivity.getConnection();
		
		PreparedStatement ps = connection.prepareStatement(Constants.INSERT_STUDENT_QUERY);
		ps.setString(1, student.getId());
		ps.setString(2, student.getFname());
		ps.setString(3, student.getLname());
		ps.setString(4, student.getDob());
		ps.setString(5, student.getArea());
		
		int rs = ps.executeUpdate();

		return rs > 0;
	}
	
	public boolean updateStudent(Student student) throws Exception {
		
		Connection connection = Connectivity.getConnection();
		
		PreparedStatement ps = connection.prepareStatement(Constants.UPDATE_STUDENT_QUERY);
		ps.setString(1, student.getFname());
		ps.setString(2, student.getLname());
		ps.setString(3, student.getDob());
		ps.setString(4, student.getArea());
		ps.setString(5, student.getId());
		
		int rs = ps.executeUpdate();

		return rs > 0;
	}
	
	public boolean deleteStudent(String id) throws Exception {
		
		Connection connection = Connectivity.getConnection();
		
		PreparedStatement ps = connection.prepareStatement(Constants.DELETE_STUDENT_QUERY);
		ps.setString(1, id);
		
		int rs = ps.executeUpdate();

		return rs > 0;
	}

}
