package com.sapient.dao;

import java.sql.*;

import com.sapient.entity.User;
import com.sapient.utility.*;

public class UserDao {

	public UserDao() {

	}

	public void getUser(User user) throws Exception {

		Connection connection = Connectivity.getConnection();
		PreparedStatement preparedStatement = connection.prepareStatement(Constant.GET_USER_DETAILS);

		preparedStatement.setString(1, user.getEmail());
		preparedStatement.setString(2, user.getPassword());

		ResultSet resultSet = preparedStatement.executeQuery();

		if (resultSet.next()) {
			user.setUserId(resultSet.getString(1));
			user.setfName(resultSet.getString(2));
			user.setlName(resultSet.getString(3));
		}

		else {
			throw new Exception("Username and passowrd deosnot match");
		}

	}

}
