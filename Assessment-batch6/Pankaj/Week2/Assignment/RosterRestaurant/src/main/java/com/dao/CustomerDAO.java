package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.to.Customer;

public class CustomerDAO {
	public Customer getCustomer(Customer customer) throws Exception {
		// TODO Auto-generated method stub
		Connection connection = Connectivity.getConnection();
		String query = "select * from customer where customer_id = ? and password = ?";
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		preparedStatement.setString(1, customer.getCustomer_id());
		preparedStatement.setString(2, customer.getPassword());

		ResultSet resultSet = preparedStatement.executeQuery();
		Customer cst = null;
		if (resultSet.next() == true) {
			cst = new Customer(resultSet.getString(1), resultSet.getString(2), resultSet.getString(3),
					resultSet.getString(4), resultSet.getString(5));
		} // if
		else {
			throw new Exception("customer id and password does not match");
		} // else
		return cst;
	}
}
