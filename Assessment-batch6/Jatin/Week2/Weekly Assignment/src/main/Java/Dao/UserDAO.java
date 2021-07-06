package com.Dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.DBConnectivity.Connectivity;
import com.Exception.invalidUserNameOrPassword;
import com.constants.Constants;
import com.entity.User;

public class UserDAO {

	public User getUserByEmailAndPwd(String email, String Pwd) throws invalidUserNameOrPassword, Exception {

		String sql = Constants.GetUserFromEmailAndPassword;

		User user = null;
		try {
			PreparedStatement ps = Connectivity.getConnection().prepareStatement(sql);
			ps.setString(1, email);
			ps.setString(2, Pwd);
			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				user = new User(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4));
			} else
				throw new invalidUserNameOrPassword();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return user;
	}
}