package com.spaient.dao;

import com.spaient.dbconnection.MySQLConnection;
import com.spaient.entity.Customer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerDAO {

    public Customer getCustomerByEmail(String email) throws SQLException, ClassNotFoundException {
        Connection connection = MySQLConnection.getConnection();

        PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM customer WHERE email = ?");
        preparedStatement.setString(1, email);

        ResultSet resultSet = preparedStatement.executeQuery();

        // unique constraint is implemented by the database;
        resultSet.next();
        return new Customer(
                resultSet.getString(1),
                resultSet.getString(2),
                resultSet.getString(3),
                resultSet.getString(4),
                Integer.parseInt(resultSet.getString(5)),
                resultSet.getString(6));
    }

    public List<Customer> getAllCustomers() throws SQLException, ClassNotFoundException {
        Connection connection = MySQLConnection.getConnection();

        PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM customer");

        ResultSet resultSet = preparedStatement.executeQuery();

        List<Customer> customerList = new ArrayList<>();

        while (resultSet.next()) {
            customerList.add(new Customer(
                    resultSet.getString(1),
                    resultSet.getString(2),
                    resultSet.getString(3),
                    resultSet.getString(4),
                    resultSet.getInt(5),
                    resultSet.getString(6)));
        }
        return customerList;
    }
}
