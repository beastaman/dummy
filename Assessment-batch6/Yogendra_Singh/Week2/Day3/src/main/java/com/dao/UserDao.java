package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.to.User;

public class UserDao {


	public User getUser(User user) throws Exception{
		Connection connection= Connectivity.getConnection();
		String query = "select * from users where userid = ? and userpassword=?";
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		preparedStatement.setString(1,user.getUserid());
		preparedStatement.setString(2,user.getUserpassword() );
		ResultSet resultSet  = preparedStatement.executeQuery();
		//resultset pointer will be on bof  -> it will go on first record on next()
		if(resultSet.next()) {
			user.setStatus(resultSet.getString(3));
		}
		else
		{
			throw new Exception("Username and password does not match !!");
		}
		return user;
		
	}

}
