package com.sapient.dao;

import java.sql.*;

import com.sapient.to.UserTable;
import com.sapient.utility.*;

public class ConfirmTableDao {

	public void insert(UserTable userTable) throws Exception {

		Connection connection = Connectivity.getConnection();
		String query = Constant.INSERT_USER_TABLE;
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		preparedStatement.setString(1, userTable.getUid());
		preparedStatement.setString(2, userTable.getTid());

		preparedStatement.executeUpdate();

	}

}
