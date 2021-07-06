package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.constant.Constants;
import com.to.Product;
import com.to.Student;

public class productDao {

	public void insertProduct(Product product) throws Exception {
		Connection connection = Connectivity.getConnection();
		// constant or resources
//		System.out.println(student);
		PreparedStatement preparedStatement = connection.prepareStatement("insert into product values (?,?,?,?)");

		preparedStatement.setString(1, product.getName());
		preparedStatement.setString(2, product.getBrand());
		preparedStatement.setString(3, product.getMadein());
		preparedStatement.setString(4, product.getPrice());
		
		
		preparedStatement.executeUpdate();
		
	}

	public void deleteProduct(String name) throws Exception {
		// TODO Auto-generated method stub
		Connection connection = Connectivity.getConnection();
		PreparedStatement preparedStatement = connection.prepareStatement("delete from product where name = ?");
		
		preparedStatement.setString(1, name);
		preparedStatement.executeUpdate();
	}
}
