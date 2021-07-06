package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.constant.Constants;
import com.to.Table;

public class TableDao {
public List<Table> getTable() throws Exception {
	
		
		Connection connection = Connectivity.getConnection();

		PreparedStatement preparedStatement = connection.prepareStatement(Constants.GET_ALL_TABLE);
		
		ResultSet resultSet = preparedStatement.executeQuery();

		List<Table> tables = new ArrayList<>();
		//System.out.println("helooo from branchDao");

		while (resultSet.next()) {
			tables.add(new Table(resultSet.getString(1), resultSet.getString(2),resultSet.getString(3),resultSet.getString(4),resultSet.getString(5)));
		}
		
		return tables;
		
	}
public List<Table> getReservation() throws Exception{
	Connection connection = Connectivity.getConnection();

	PreparedStatement preparedStatement = connection.prepareStatement(Constants.RESERVE_TABLE);
	ResultSet resultSet = preparedStatement.executeQuery();

	List<Table> tables = new ArrayList<>();

	while (resultSet.next()) {
		tables.add(new Table(resultSet.getString(1), resultSet.getString(2),resultSet.getString(3),resultSet.getString(4),resultSet.getString(5)));
	}
	
	return tables;
	
}

}
