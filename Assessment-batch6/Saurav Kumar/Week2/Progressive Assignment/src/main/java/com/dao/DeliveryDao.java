package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Random;

import com.to.Delivery;
import com.to.User;

public class DeliveryDao {
	public boolean insertData(Delivery delivery) throws Exception {
		Connection connection = Connectivity.getConnection();
		
		String query = "INSERT INTO delivery VALUES (?, ?, ?, now())";
		PreparedStatement preparedStudent = connection.prepareStatement(query);
		
		preparedStudent.setString(1, delivery.getOrderid());
		preparedStudent.setString(2, delivery.getUserid());
		preparedStudent.setString(3, delivery.getBid());
		
		preparedStudent.executeUpdate();
		
		return true;
	}
}
