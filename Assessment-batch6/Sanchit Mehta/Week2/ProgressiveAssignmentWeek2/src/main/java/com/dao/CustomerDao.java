package com.dao;

import java.sql.*;
import java.util.*;

import com.constant.Constants;
import com.to.*;

public class CustomerDao {

	
	public List<Customer> getAllCustomers() throws Exception {

		Connection connection = Connectivity.getConnection();
		// constant or resources

		PreparedStatement preparedStatement = connection.prepareStatement(Constants.GET_ALL_CUSTOMER_QUERY);

		ResultSet resultSet = preparedStatement.executeQuery();

		List<Customer> customers = new ArrayList<>();

		while (resultSet.next()) {
			customers.add(new Customer(resultSet.getString(1), resultSet.getString(2), resultSet.getString(3),
					resultSet.getString(4), resultSet.getString(5), resultSet.getString(6), resultSet.getString(7)));
		}
		
		return customers;
	}
	
	
	public void insertCustomer(Customer customer) throws Exception {
		Connection connection = Connectivity.getConnection();
		// constant or resources
//		System.out.println(customer);
		PreparedStatement preparedStatement = connection.prepareStatement(Constants.SAVE_CUSTOMER);

		preparedStatement.setString(1, customer.getCid());
		preparedStatement.setString(2, customer.getFirstname());
		preparedStatement.setString(3, customer.getLastname());
		preparedStatement.setString(6, customer.getPhoneNo());
		preparedStatement.setString(5, customer.getCity());
		preparedStatement.setString(4, customer.getDob());

		
		preparedStatement.executeUpdate();
		
		
		
	}
	

}














