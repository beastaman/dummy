package com.dao;

import java.sql.*;
import java.util.List;

import com.constant.Constants;
import com.to.User;

public class UserDao {

	public UserDao() {
		
	}
	
	public void getUser(User user) throws Exception {
		
		System.out.println(user.getUserId());
		System.out.println(user.getPassword());
		Connection connection = Connectivity.getConnection();

		String query = "select * from user where userid = ? and userpassword = ?";
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		
		preparedStatement.setString(1, user.getUserId());
		preparedStatement.setString(2, user.getPassword());
		
		
		ResultSet resultSet = preparedStatement.executeQuery();
		
		if(resultSet.next()) {
			user.setStatus(resultSet.getString(3));
			System.out.println(user.getStatus());
			return ;
		}
		
		else {
			throw new Exception("Username and password don't match");
		}
		
	}
	
}
