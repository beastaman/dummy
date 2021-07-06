package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.to.User;

public class UserDao {
	public void getUser(User user) throws Exception {
		Connection connection = Connectivity.getConnection();
		
		String query = "select * from user where userid = ? and password = ?";
		PreparedStatement preparedStudent = connection.prepareStatement(query);
		preparedStudent.setString(1, user.getUserid());
		preparedStudent.setString(2, user.getPassword());
		
		ResultSet resultSet = preparedStudent.executeQuery();
		
		if(resultSet.next()) {
			user.setFname(resultSet.getString(2));
			user.setLname(resultSet.getString(3));
			user.setPhone(resultSet.getString(4));
			return;
		} else {
			throw new Exception("userId and Password doesn't match");
		}
	}
	
	public boolean insertData(User user) throws Exception {
		Connection connection = Connectivity.getConnection();
		
		String query = "INSERT INTO user VALUES (?, ?, ?, ?, ?)";
		PreparedStatement preparedStudent = connection.prepareStatement(query);
		preparedStudent.setString(1, user.getUserid());
		preparedStudent.setString(2, user.getFname());
		preparedStudent.setString(3, user.getLname());
		preparedStudent.setString(4, user.getPhone());
		preparedStudent.setString(5, user.getPassword());
		
		preparedStudent.executeUpdate();
		
		return true;
	}
}
