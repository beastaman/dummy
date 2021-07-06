package com.sapient.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.sapient.to.Product;

public class ProductDAO {
	public boolean insertProduct(Product product) throws Exception
	{
		Connection connection= Connectivity.getConnection();
		
		String query = "INSERT into products values (?,?,?,?,?)";
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		preparedStatement.setString(1, product.getId());
		preparedStatement.setString(2, product.getName());
		preparedStatement.setString(3, product.getBrand() );
		preparedStatement.setString(4, product.getMadein() );
		preparedStatement.setInt(5, product.getPrice() );
		return preparedStatement.executeUpdate() > 0 ;
	}

	public boolean deleteProduct(String id) throws Exception {

		Connection connection= Connectivity.getConnection();
		String query = " DELETE from products where id=?";
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		preparedStatement.setString(1, id);		
		return preparedStatement.executeUpdate() > 0 ;
	}
}
