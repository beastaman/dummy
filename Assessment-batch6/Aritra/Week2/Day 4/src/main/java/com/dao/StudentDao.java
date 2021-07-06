package com.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;

import com.constants.Constants;
import com.to.Students;
import com.to.Students;
public class StudentDao {

	public List<Students> getAllStudents() throws Exception {
		Connection connection = Connectivity.getConnection();

		PreparedStatement ps = connection.prepareStatement(Constants.GET_ALL_STUDENT_QUERY);
		ResultSet rs = ps.executeQuery();
		List<Students> ls = new ArrayList<>();
		
		while (rs.next()) {
			ls.add(
					new Students(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)));
		}
		return ls;
		
	}

	public void insertStudent(Students student) throws Exception {
		Connection connection = Connectivity.getConnection();
		// constant or resources
//		System.out.println(student);
		PreparedStatement preparedStatement = connection.prepareStatement(Constants.SAVE_STUDENT);

		preparedStatement.setString(1, student.getId());
		preparedStatement.setString(2, student.getFname());
		preparedStatement.setString(3, student.getLname());
		preparedStatement.setString(4, student.getDob());
		preparedStatement.setString(5, student.getArea());
		
		preparedStatement.executeUpdate();
		
		
		
	}
}
