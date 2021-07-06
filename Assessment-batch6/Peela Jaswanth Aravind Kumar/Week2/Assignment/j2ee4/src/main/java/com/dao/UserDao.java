package com.dao;

import java.sql.*;
import java.util.List;

import com.constant.Constants;
import com.to.Student;
import com.to.User;

public class UserDao {

	public UserDao() {
		
	}
	
	public  void addUser(User user) throws Exception {
		Connection connection = Connectivity.getConnection();
		// constant or resources
//		System.out.println(student);
		PreparedStatement preparedStatement = connection.prepareStatement(Constants.ADD_USER);

		preparedStatement.setString(1, user.getUserId());
		preparedStatement.setString(2, user.getPassword());
		preparedStatement.setString(3, user.getStatus());
				
		preparedStatement.executeUpdate();	
	}
	
	public int checkUser(String userId) throws Exception{
		
		Connection connection = Connectivity.getConnection();
		String query = "select * from user where userId = ?";
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		
		preparedStatement.setString(1, userId);
		
		ResultSet rs = preparedStatement.executeQuery();
		
		if(rs.next()) {
			return 1;
		}
		return 0;
		
	}
	
	
	public void getUser(User user) throws Exception {
		
		Connection connection = Connectivity.getConnection();

		String query = "select * from user where userId = ? and password = ?";
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		
		preparedStatement.setString(1, user.getUserId());
		preparedStatement.setString(2, user.getPassword());
		
		ResultSet resultSet = preparedStatement.executeQuery();
		
		if(resultSet.next()) {
			user.setStatus(resultSet.getString(3));
			return ;
		}
		
		else {
			throw new Exception("Username and passowrd deosnot match");
		}
		
	}
	
}