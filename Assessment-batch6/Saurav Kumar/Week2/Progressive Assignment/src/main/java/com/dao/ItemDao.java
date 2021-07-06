package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.constant.Constant;
import com.to.Item;

public class ItemDao {

	public List<Item> getAllItems() throws Exception{
		List<Item> list = new ArrayList<Item>();
		
		Connection connection = Connectivity.getConnection();
		
	
		PreparedStatement preparedStudent = connection.prepareStatement(Constant.GET_ALL_ITEMS_QUERY);
		ResultSet resultSet = preparedStudent.executeQuery();
		
		// point will be at BOF, if we give next() then only it will move to the next record
		while(resultSet.next()) {
			list.add(new Item(resultSet.getString(2), resultSet.getInt(3)));
		}
		
		return list;
	}
	
}
