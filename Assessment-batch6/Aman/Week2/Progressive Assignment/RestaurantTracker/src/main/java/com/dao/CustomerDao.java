package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.to.*;

public class CustomerDao {
	public Customer getCustomer(User user) throws Exception {
		Connection connection = Connectivity.getConnection();
		Customer customer = new Customer();
		String query = "select * from customer where email =? and password =?";
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		preparedStatement.setString(1, user.getUserId());
		preparedStatement.setString(2, user.getPassword());
		ResultSet resultSet = preparedStatement.executeQuery();
		if(resultSet.next()) {
			customer.setFname(resultSet.getString(1));
			customer.setLname(resultSet.getString(2));
			customer.setContact(resultSet.getString(3));
			customer.setCustid(resultSet.getString(4));
			customer.setEmail(resultSet.getString(5));
			customer.setPassword(resultSet.getString(6));
			//System.out.println(customer.toString());
			return customer;
		}
		else {
			throw new Exception("Username and password don't match");
			
		}
	} 
}
