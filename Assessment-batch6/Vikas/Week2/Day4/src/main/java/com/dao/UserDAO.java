package com.dao;

import java.sql.*;

import com.to.User;

public class UserDAO {

	public UserDAO() {
		
	}
	
	public void getUser(User user) throws Exception {
		
		System.out.println("im in user dao");
		System.out.println(user.getUserId());
		System.out.println(user.getPassword());
		System.out.println("&&");
		Connection connection = Connectivity.getConnection();
		
		System.out.println("$$");

		String query = "select * from user where userid = ? and userpassword = ?";
		
		
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		
		preparedStatement.setString(1, user.getUserId());
		preparedStatement.setString(2, user.getPassword());
		
		ResultSet resultSet = preparedStatement.executeQuery();
		
		if(resultSet.next()) {
			user.setStatus(resultSet.getString(3));
			System.out.println(resultSet.getString(3));
			return ;
		}
		
		else {
			System.out.println("im in userdao catch");
			throw new Exception("Username and passowrd deosnot match");
		}
		
	}
	
}