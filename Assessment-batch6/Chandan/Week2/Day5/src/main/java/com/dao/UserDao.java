package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.constants.Constant;
import com.to.User;

public class UserDao {

	public UserDao() {
		super();
	}
	
	
	

	public void getUser(User user) throws Exception {

		Connection connection = Connectivity.getConnection();

		String query = "Select * from user where userId=? and userPassword = ?";

		PreparedStatement preparedStatement = connection.prepareStatement(query);
		preparedStatement.setString(1, user.getUserId());
		preparedStatement.setString(2, user.getPassword());

		ResultSet resultSet = preparedStatement.executeQuery();

		if (resultSet.next()) {

			user.setStatus(resultSet.getString(3));
			return;

		} else {
			throw new Exception("user id and password does not match");
		}

	}

}
