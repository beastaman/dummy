package com.sapient.dao;

import com.sapient.to.Product;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class ProductDAO {
    public boolean insertProduct(Product product) throws Exception {
        Connection connection = Connectivity.getConnection();

        String query = "INSERT INTO products VALUES (?,?,?,?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, product.getId());
        preparedStatement.setString(2, product.getName());
        preparedStatement.setString(3, product.getBrand());
        preparedStatement.setString(4, product.getMadein());
        preparedStatement.setInt(5, product.getPrice());
        return preparedStatement.executeUpdate() > 0;
    }

    public boolean deleteProduct(Product product) throws Exception {

        Connection connection = Connectivity.getConnection();
        String query = " DELETE FROM products WHERE id=?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, product.getId());
        return preparedStatement.executeUpdate() > 0;
    }
}
