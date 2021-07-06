package com.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.to.User;
public class UserDAO {

	public void getUser(User user) throws Exception
	{
		
		Connection connection= Connectivity.getConnection();
		String query= "select * from user where userId=? and userpassword= ?";
		PreparedStatement ps=connection.prepareStatement(query);
		ps.setString(1,  user.getUserId());
		ps.setString(2,  user.getPassword());
		
		ResultSet rs= ps.executeQuery();
		if(rs.next())
		{
			user.setStatus(rs.getString(3));
			return;
		}
		else
		{
			throw new Exception("Username and password does not match");
		}
	}

	
}
