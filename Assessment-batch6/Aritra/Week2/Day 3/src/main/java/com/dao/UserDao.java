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

		String q = "select * from user where userid = ? and userpassword = ?";
		PreparedStatement ps = connection.prepareStatement(q);
		ps.setString(1, user.getUserid());
		ps.setString(2, user.getPassword());
		
		ResultSet rs = ps.executeQuery();
		
		if(rs.next()) {
			user.setStatus(rs.getString(3));
			
		}
		else{
			throw new Exception("username and password does not match");
		}
		
	}
	
}
