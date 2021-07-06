package com.sapient.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.sapient.constants.Constants;
import com.sapient.to.User;

public class UserDao {

	public void getUser(User user) throws Exception {
		
		Connection connection = Connectivity.getConnection();
		
		PreparedStatement ps = connection.prepareStatement(Constants.GET_USER_FROM_CREDENTIALS_QUERY);
		ps.setString(1, user.getId());
		ps.setString(2, user.getPassword());
		ResultSet rs = ps.executeQuery();
		
		if (rs.next()) {
			user.setId(rs.getString(1));
			user.setPassword(rs.getString(2));
			user.setStatus(rs.getString(3));
		}
		else throw new Exception("Invalid Username/Password");
	}

}
