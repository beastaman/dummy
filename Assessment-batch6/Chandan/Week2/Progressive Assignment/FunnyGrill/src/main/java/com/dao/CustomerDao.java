package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.constants.Constants;
import com.to.CustomerTO;

public class CustomerDao {
	
	public CustomerTO getCustomer(CustomerTO customer) throws Exception {
		
		
		Connection connection = Connectivity.getConnection();
		
		PreparedStatement preparedStatement = connection.prepareStatement(Constants.GET_CUSTOMER);
		preparedStatement.setString(1, customer.getEmail());
		preparedStatement.setString(2, customer.getPassword());
		
		ResultSet resultSet = preparedStatement.executeQuery();
		
		if(resultSet.next()) {
			
			return new CustomerTO(
						resultSet.getInt("id"),
						resultSet.getString("email"),
						resultSet.getString("password"),
						resultSet.getString("fname"),
						resultSet.getString("lname"),
						resultSet.getString("ph_no"),
						resultSet.getInt("status")
					);
			
		}
		else {
			
			throw new Exception("Invalid Email or Password");
			
		}
		
	}
	
	
	public boolean saveCustomer(CustomerTO customer) throws ClassNotFoundException, SQLException {
		
		Connection connection = Connectivity.getConnection();
		
		PreparedStatement preparedStatement = connection.prepareStatement(Constants.SAVE_CUSTOMER);
		preparedStatement.setString(1, customer.getEmail());
		preparedStatement.setString(2, customer.getPassword());
		preparedStatement.setString(3, customer.getFname());
		preparedStatement.setString(4, customer.getLname());
		preparedStatement.setString(5, customer.getPhNo());
		preparedStatement.setInt(6, customer.getStatus());
		
		preparedStatement.executeUpdate();
		
		return true;
		
	}
	
}
