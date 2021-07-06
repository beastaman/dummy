package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.constants.Constants;
import com.to.FoodItemTO;

public class FoodDao {
	
	public FoodItemTO getFoodItemTO(int foodId) throws Exception {
		
		Connection connection = Connectivity.getConnection();
		
		PreparedStatement preparedStatement = connection.prepareStatement(Constants.GET_FOOD_ITEM);
		preparedStatement.setInt(1, foodId);
		
		ResultSet resultSet = preparedStatement.executeQuery();
		
		if(resultSet.next()) {
			return	new FoodItemTO(
								resultSet.getInt("id"),
								resultSet.getString("name"),
								resultSet.getDouble("price")
							);
		}
		else {
			
			throw new Exception("Food Not Found");
			
		}
		
	}
	
}
