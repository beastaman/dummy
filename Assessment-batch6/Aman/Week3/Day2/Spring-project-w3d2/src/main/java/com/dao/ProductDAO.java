package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;
import com.to.*;

public class ProductDAO {
	public boolean insertProduct(Product product) throws Exception {

		Connection connection = Connnectivity.getConnection();

		String query = "Insert into product values(?,?,?,?)";

		PreparedStatement preparedStatement = connection.prepareStatement(query);
		preparedStatement.setString(1, product.getName());
		preparedStatement.setString(2, product.getBrand());
		preparedStatement.setString(3, product.getMadein());
		preparedStatement.setString(4, product.getPrice());
		preparedStatement.executeUpdate();
		return true;
	}
	public boolean deleteProduct(Product product) throws Exception {

		Connection connection= Connnectivity.getConnection();
		String query = " DELETE from products where name=?";
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		preparedStatement.setString(1, product.getName() );		
		return preparedStatement.executeUpdate() > 0 ;
	}
}
