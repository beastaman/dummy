package com.sapient.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.sapient.connector.Connectivity;
import com.sapient.entity.User;
import com.sapient.utils.Constant;

public class UserDAO {

	public void getUserDetails(User user) throws Exception {
		Connection connection = Connectivity.getConnection();
		PreparedStatement ps = connection.prepareStatement(Constant.USER_INFO);
		ps.setString(1, user.getEmail());
		ps.setString(2, user.getPassword());
		ResultSet resultSet = ps.executeQuery();

		if (resultSet.next()) {
			user.setUserId(resultSet.getString(1));
			user.setfName(resultSet.getString(2));
			user.setlName(resultSet.getString(3));
		} else {
			throw new Exception("Username and Password do not match!");
		}
	}

	public void insertStudent(User user) throws Exception {
		Connection connection = Connectivity.getConnection();
		PreparedStatement ps = connection.prepareStatement(Constant.INSERT_USER);
		ps.setString(1, user.getUserId());
		ps.setString(2, user.getfName());
		ps.setString(3, user.getlName());
		ps.setString(4, user.getEmail());
		ps.setString(5, user.getPassword());

		ps.executeUpdate();

	}
}
