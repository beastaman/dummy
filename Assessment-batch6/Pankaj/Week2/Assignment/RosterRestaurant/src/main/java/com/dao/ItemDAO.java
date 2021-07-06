package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.to.Item;

public class ItemDAO {
	public List<Item> getAllItems() throws Exception {
		// TODO Auto-generated method stub
		Connection connection = Connectivity.getConnection();
		String query = "select * from item";
		PreparedStatement preparedStatement = connection.prepareStatement(query);

		ResultSet resultSet = preparedStatement.executeQuery();
		List<Item> items = new ArrayList<>();
		if (resultSet.next() == true) {
			items.add(new Item(resultSet.getString(1), resultSet.getString(2), resultSet.getString(3),
					resultSet.getString(4)));
		} // if
		return items;
	}
}
