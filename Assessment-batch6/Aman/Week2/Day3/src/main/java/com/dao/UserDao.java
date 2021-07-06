package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.to.User;

public class UserDao {
	public UserDao() {
		
	}
	public void getUser(User user) throws Exception {
		Connection connection = Connnectivity.getConnection();

		String query = "select * from user where userid =? and userpassword =?";

		PreparedStatement preparedStatement = connection.prepareStatement(query);
		preparedStatement.setString(1, user.getUserId());
		preparedStatement.setString(2, user.getPassword());
		ResultSet resultSet = preparedStatement.executeQuery();
		if(resultSet.next()) {
			user.setStatus(resultSet.getString(3));
			return;
		}
		else {
			throw new Exception("Username and password don't match");
			
		}
	}
}
