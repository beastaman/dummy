package com.sapient.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.sapient.connector.Connectivity;
import com.sapient.entity.Table;

public class TableDAO {

	public List<Table> getAllTables() throws Exception {

		List<Table> tables = new ArrayList<>();

		Connection connection = Connectivity.getConnection();
		String query = "select * from rtable";
		PreparedStatement preparedStatement = connection.prepareStatement(query);

		ResultSet resultSet = preparedStatement.executeQuery();

		while (resultSet.next()) {
			tables.add(new Table(resultSet.getString(1), resultSet.getInt(2), resultSet.getString(3),
					resultSet.getString(4)));
		}

		return tables;

	}

	public Table getTableById(String id) throws Exception {

		Connection connection = Connectivity.getConnection();
		String query = "select * from rtable where tid = ?";
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		preparedStatement.setString(1, id);

		ResultSet resultSet = preparedStatement.executeQuery();

		if (resultSet.next()) {
			return new Table(resultSet.getString(1), resultSet.getInt(2), resultSet.getString(3),
					resultSet.getString(4));
		}

		return null;

	}

}
