package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.to.User;

public class UserDao {
	public UserDao() {
		
	}
	
	public void getUser(User user) throws Exception {
		Connection connection = Connectivity.getConnection();
		
		String query = "select * from user where userid = ? and userpassword = ?";
		PreparedStatement preparedStudent = connection.prepareStatement(query);
		preparedStudent.setString(1, user.getUserID());
		preparedStudent.setString(2, user.getPassword());
		
		ResultSet resultSet = preparedStudent.executeQuery();
		
		if(resultSet.next()) {
			user.setStatus(resultSet.getString(3));
			return;
		} else {
			throw new Exception("userId and Password doesn't match");
		}
	}
}
