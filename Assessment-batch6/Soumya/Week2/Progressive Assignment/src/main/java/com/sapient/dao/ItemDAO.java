package com.sapient.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.sapient.connector.Connectivity;
import com.sapient.entity.Item;

public class ItemDAO {

	public Item getItemById(String id) throws Exception {

		Connection connection = Connectivity.getConnection();
		String query = "select * from rfooditems where fid = ?";

		PreparedStatement preparedStatement = connection.prepareStatement(query);
		preparedStatement.setString(1, id);
		ResultSet resultSet = preparedStatement.executeQuery();

		if (resultSet.next()) {
			return new Item(resultSet.getString(1), resultSet.getString(2), resultSet.getString(3));
		}

		return null;
	}

	public List<Item> getAllItem() throws Exception {

		List<Item> items = new ArrayList<>();

		Connection connection = Connectivity.getConnection();
		String query = "select * from rfooditems";

		System.out.println("Item dao");
		PreparedStatement preparedStatement = connection.prepareStatement(query);

		ResultSet resultSet = preparedStatement.executeQuery();

		while (resultSet.next()) {
			items.add(new Item(resultSet.getString(1), resultSet.getString(2), resultSet.getString(3)));
		}

		items.forEach(System.out::println);
		return items;

	}

}
