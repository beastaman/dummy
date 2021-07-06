package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.to.User;
public class UserDao {
	public UserDao() {}
	
	public void getUser(User user) throws Exception {
		Connection connection =Connectivity.getConnection();
		
		 String query = "Select * from user where userid =? and userpassword=?";
		 PreparedStatement preparedStatement = connection.prepareStatement(query);
		 // pointer will be now at BOF -- play when we go to next , it will go to the first record
		 System.out.println(user.getUserid() + " , " + user.getUserpassword());
		 preparedStatement.setString(1 , user.getUserid());
		 preparedStatement.setString(2 , user.getUserpassword());
		 ResultSet resultSet = preparedStatement.executeQuery();
		//if(preparedStatement.executeQuery().next())
		 if(resultSet.next()) {
				user.setStatus(resultSet.getString(3));
				return ;
			}
			
			else {
				throw new Exception("Username and passowrd deosnot match :: " + user.getUserid() + " , " + user.getUserpassword());
			}		 
	}

}
