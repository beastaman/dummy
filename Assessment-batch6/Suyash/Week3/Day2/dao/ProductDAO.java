package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.to.Product;

public class ProductDAO {
	public boolean insertProduct(Product product) throws Exception{
		Connection connection=connectivity.getConnection();
		String query ="insert into product values (?,?,?,?)";
		
		PreparedStatement preparedStatement=connection.prepareStatement(query);
		
		preparedStatement.setString(1, product.getName());
		preparedStatement.setString(2, product.getBrand());
		preparedStatement.setString(3, product.getMadein());
		preparedStatement.setString(4, product.getPrice());
		
		preparedStatement.executeUpdate();
		
		return true;
	}
}
