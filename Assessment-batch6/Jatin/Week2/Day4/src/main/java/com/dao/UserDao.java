package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.to.User;

public class UserDao {

	public void getStudent(User user) throws Exception {
		Connection connection = null;
		try {
			connection = Connectivity.getConnection();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String query = "Select * from user where userid=? and password=?";
		PreparedStatement ps;
		try {
			ps = connection.prepareStatement(query);
			ps.setString(1, user.getUserid());
			ps.setString(2, user.getPassword());

			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				user.setStatus(rs.getString(3));
				return;
			}
			else
				throw new Exception("User Not Found");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
