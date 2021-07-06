package com.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;
import com.to.*;
public class TableDao {
	public List<Table> getAvailableTable() throws Exception{
		Connection connection = Connectivity.getConnection();
		String query = "select * from tables where tablestatus='free'";
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		ResultSet resultSet = preparedStatement.executeQuery();
		List<Table> tables = new ArrayList<>();
		while (resultSet.next()) {
			tables.add(new Table(resultSet.getString(1), resultSet.getString(2), resultSet.getString(3)));
		}
		return tables;
	}
}
