package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.constants.Constant;
import com.to.Student;
import com.to.User;

public class StudentDao {
	
	public List<Student> getAllStudent () throws ClassNotFoundException, SQLException{
		
		List<Student> students = new ArrayList<>();
		
		Connection connection = Connectivity.getConnection();

		PreparedStatement preparedStatement = connection.prepareStatement(Constant.GET_ALL_STUDENT_QUERY);

		ResultSet resultSet = preparedStatement.executeQuery();

		while (resultSet.next()) {

			students.add(new Student(resultSet.getString(1), resultSet.getString(2),
					resultSet.getString(3), resultSet.getString(4), resultSet.getString(5)));

		}
		
		return students;
		
	}
	
}
