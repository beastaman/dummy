package com.sapient.dao;

import java.sql.*;
import java.util.*;

import com.sapient.entity.*;
import com.sapient.utility.*;

public class TableDao {

	public List<Table> getAllTables() throws Exception {

		List<Table> tables = new ArrayList<>();

		Connection connection = Connectivity.getConnection();
		String query = Constant.GET_ALL_TABLES;
		PreparedStatement preparedStatement = connection.prepareStatement(query);

		ResultSet resultSet = preparedStatement.executeQuery();

		while (resultSet.next()) {
			tables.add(new Table(resultSet.getString(1), resultSet.getInt(2), resultSet.getString(3),
					resultSet.getString(4)));
		}

		return tables;

	}

	public Table getPriceById(String id) throws Exception {

		Connection connection = Connectivity.getConnection();
		String query = Constant.GET_TABLE_PRICE_BY_ID;
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
