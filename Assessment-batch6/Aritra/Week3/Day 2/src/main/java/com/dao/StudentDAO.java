package com.dao;

import java.sql.*;
import java.util.*;

import com.entity.Custom;
import com.entity.Student;

public class StudentDAO {

	public Student getAnyStudent(String id) throws Exception {

		Student student;
		Connection connection = Connectivity.getConnection();

		String q = "select * from student where id = ?";
		PreparedStatement ps = connection.prepareStatement(q);
		ps.setString(1, id);
		ResultSet rs = ps.executeQuery();

		if (rs.next()) {
			student = new Student(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
		} else
			throw new Exception("User does not exist");

		return student;
	}

	public List<Custom> getJoinStudent() throws Exception {
		List<Custom> custom = new ArrayList<>();
		Connection connection = Connectivity.getConnection();

		String q = "select a.id, a.fname, b.testno, (b.m1+b.m2+b.m3) 'total' from student a inner join marks b\r\n"
				+ "			on (a.id=b.id);";

		PreparedStatement ps = connection.prepareStatement(q);
		ResultSet rs = ps.executeQuery();

		while (rs.next()) {
			custom.add(
					new Custom(rs.getString(1), rs.getString(2), rs.getString(4), rs.getInt(3)));
		}
		
		return custom;
	}
	
	public void deleteStudent(String string) throws Exception{
		List<Student> students = new ArrayList<>();
		Connection connection = Connectivity.getConnection();

		String q = "delete from student where id = ?";

		PreparedStatement ps = connection.prepareStatement(q);
		ps.setString(1, string);
		ps.executeUpdate();
		
	}
	
	
	public List<Student> getAllStudent() throws Exception {

		List<Student> students = new ArrayList<>();
		Connection connection = Connectivity.getConnection();

		String q = "select * from student";

		PreparedStatement ps = connection.prepareStatement(q);
		ResultSet rs = ps.executeQuery();
		// resultSet pointer will be at bof --> only when we go to next it will go to
		// next round
		while (rs.next()) {
			students.add(
					new Student(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)));
		}

		return students;
	}

}
