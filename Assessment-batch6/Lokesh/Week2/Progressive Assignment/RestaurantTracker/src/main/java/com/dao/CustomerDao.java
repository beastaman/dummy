package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.constant.Constants;
import com.to.Customer;

public class CustomerDao {
public CustomerDao() {
		
	}
	
	public void getCustomer(Customer customer) throws Exception {
		
		Connection connection = Connectivity.getConnection();

		String query = "select * from Customer where email = ? and password = ?";
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		
		preparedStatement.setString(1, customer.getEmail());
		preparedStatement.setString(2, customer.getPassword());
		
		ResultSet resultSet = preparedStatement.executeQuery();
		
		if(resultSet.next()) {
			return ;
		}
		
		else {
			throw new Exception("Username and password doesnot match");
		}
		
	}
	public void insertCustomer(Customer customer) throws Exception {
		Connection connection = Connectivity.getConnection();
		PreparedStatement preparedStatement = connection.prepareStatement(Constants.INSERT_CUSTOMER);

		preparedStatement.setString(1, customer.getCustomerName());
		preparedStatement.setString(2, customer.getCustomerNumber());
		preparedStatement.setString(3, customer.getCustomerAddress());
		preparedStatement.setString(4, customer.getEmail());
		preparedStatement.setString(5, customer.getPassword());
		
		
		preparedStatement.executeUpdate();
	}

}
