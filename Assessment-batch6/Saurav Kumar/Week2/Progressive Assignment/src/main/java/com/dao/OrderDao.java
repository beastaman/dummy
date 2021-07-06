package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.to.Order;
import com.to.User;

public class OrderDao {
	public boolean insertData(Order order) throws Exception {
		Connection connection = Connectivity.getConnection();
		
		String query = "INSERT INTO foodorder VALUES (?, ?, ?)";
		PreparedStatement preparedStudent = connection.prepareStatement(query);
		preparedStudent.setString(1, order.getOrderid());
		preparedStudent.setString(2, order.getStatus());
		preparedStudent.setInt(3, order.getPrice());
		
		preparedStudent.executeUpdate();
		
		return true;
	}
}
