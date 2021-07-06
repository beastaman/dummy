package com.sapient.dao;

import java.sql.*;
import java.util.*;

import com.sapient.entity.*;
import com.sapient.utility.*;

public class ItemDao {

	public Item getItemById(String id) throws Exception {
		
		Connection connection = Connectivity.getConnection();
		String query = Constant.GET_ITEM_BY_ID;
		
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
		String query = Constant.GET_ALL_FOOD_ITEMS;
		
		PreparedStatement preparedStatement = connection.prepareStatement(query);

		ResultSet resultSet = preparedStatement.executeQuery();

		while (resultSet.next()) {
			items.add(new Item(resultSet.getString(1), resultSet.getString(2), resultSet.getString(3)));
		}
		
		return items;

	}
	
}
