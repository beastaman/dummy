package com.sapient.dao;

import java.sql.*;

import com.sapient.to.UserItem;
import com.sapient.utility.*;

public class ConfirmOnlineDao {

	public void insert(UserItem userItem) throws Exception {

		Connection connection = Connectivity.getConnection();
		String query = Constant.INSERT_INTO_USER_ITEMS;
		
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		
		preparedStatement.setString(1, userItem.getUid());
		preparedStatement.setString(2, userItem.getFid());
		preparedStatement.setString(3, userItem.getQty());
		
		preparedStatement.executeUpdate();

	}
	
}
