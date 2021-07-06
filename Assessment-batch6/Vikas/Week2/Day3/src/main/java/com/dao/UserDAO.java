package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.to.User;

public class UserDAO {

	public UserDAO() {
		
	}
	
	public void getUser(User user) throws Exception {
		
		Connection connection = Connectivity.getConnection();
		
		String qry = "select * from user where userid = ? and userpassword = ?";
		
		PreparedStatement ps = connection.prepareStatement(qry);
		
		ps.setString(1, user.getUserid());
		ps.setString(2, user.getUserpassword());
		
		ResultSet rs = ps.executeQuery();
		
		if(rs.next()) {
			user.setStatus(rs.getString(3));
			return;
		}
		else {
			throw new Exception("username & password does not match");
		}
		
	}
}
