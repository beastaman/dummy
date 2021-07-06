package com.sapient.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.sapient.entity.Product;

public class ProductDAO {
	public void insertProduct(Product product) throws Exception {
		Connection connection = Connectivity.getConnection();
		String query = "insert into product (name, brand, madein, price) values (?,?,?,?)";
		PreparedStatement ps = connection.prepareStatement(query);
		ps.setString(1, product.getName());
		ps.setString(2, product.getBrand());
		ps.setString(3, product.getMadein());
		ps.setString(4, product.getPrice());

		ps.executeUpdate();
	}

	public void deleteProduct(Product product) throws Exception {
		// TODO Auto-generated method stub
		Connection connection = Connectivity.getConnection();
		String query = "delete from product where name=?";
		PreparedStatement ps = connection.prepareStatement(query);
		ps.setString(1, product.getName());
		ps.executeUpdate();
	}
}
