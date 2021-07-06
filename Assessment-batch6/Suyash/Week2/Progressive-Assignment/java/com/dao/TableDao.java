package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import com.to.Table;

public class TableDao {
	public List<Table> getAllTable() throws Exception {

		Connection connection = Connectivity.getConnection();
		// constant or resources
		String query="select * from tables";
		PreparedStatement preparedStatement = connection.prepareStatement(query);

		ResultSet resultSet = preparedStatement.executeQuery();

		List<Table> tables = new ArrayList<>();

		while (resultSet.next()) {
			tables.add(new Table(resultSet.getString(1), resultSet.getString(2)));
		}
		
		return tables;
	}
}
