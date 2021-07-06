package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.to.Product;
import com.to.Student;

public class ProductDao {
	public boolean InsertData(Product product) throws Exception {
		Connection connection = Connectivity.getConnection();
		
		String query = "INSERT INTO productbase VALUES (?, ?, ?, ?)";
		PreparedStatement preparedStudent = connection.prepareStatement(query);
		preparedStudent.setString(1, product.getName());
		preparedStudent.setString(2, product.getBrand());
		preparedStudent.setString(3, product.getMadein());
		preparedStudent.setString(4, product.getPrice());
		
		preparedStudent.executeUpdate();
		
		return true;
	}
	
	public void deleteData(String name) throws Exception {
		Connection connection = Connectivity.getConnection();
		
		String query = "DELETE FROM productbase WHERE name = ?";
		PreparedStatement preparedStudent = connection.prepareStatement(query);
		preparedStudent.setString(1, name);
		
		preparedStudent.executeUpdate();
	}
}
