package com.sapient.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.sapient.constants.Constants;
import com.sapient.dto.User;

public class UserDao {

	public User getUser(User user) throws Exception {
		
		Connection connection = Connectivity.getConnection();
		
		PreparedStatement preparedStatement = connection.prepareStatement(Constants.GET_USER_FROM_CREDENTIALS_QUERY);
		preparedStatement.setString(1, user.getEmail());
		preparedStatement.setString(2, user.getPassword());
		ResultSet resultSet = preparedStatement.executeQuery();
		
		if(resultSet.next())
			user = getUser(resultSet);
		else throw new Exception("Invalid Username/Password");
		
		return user;
	}

	public User saveUser(User user) throws Exception {
		
		Connection connection = Connectivity.getConnection();
		
		PreparedStatement preparedStatement = connection.prepareStatement(Constants.SAVE_USER_QUERY, Statement.RETURN_GENERATED_KEYS);
		preparedStatement.setString(1, user.getEmail());
		preparedStatement.setString(2, user.getPassword());
		preparedStatement.setString(3, user.getFname());
		preparedStatement.setString(4, user.getLname());
		preparedStatement.setString(5, user.getPhone());
		int n = preparedStatement.executeUpdate();
		
		user = null;
		if(n > 0) {
			ResultSet resultSet = preparedStatement.getGeneratedKeys();
			if(resultSet.next())
				user = getUserById(resultSet.getInt(1));
		}
		
		return user;
	}

	public User getUserById(int id) throws Exception {
		
		Connection connection = Connectivity.getConnection();
		
		PreparedStatement preparedStatement = connection.prepareStatement(Constants.GET_USER_BY_ID_QUERY);
		preparedStatement.setInt(1, id);
		ResultSet resultSet = preparedStatement.executeQuery();
		
		User user = null;
		if(resultSet.next())
			user = getUser(resultSet);
		
		return user;
	}

	public User getUser(ResultSet resultSet) throws Exception {
		
		User user = new User();
		user.setId(resultSet.getInt(1));
		user.setEmail(resultSet.getString(2));
		user.setPassword(null);
		user.setFname(resultSet.getString(4));
		user.setLname(resultSet.getString(5));
		user.setPhone(resultSet.getString(6));
		
		return user;
	}
}
