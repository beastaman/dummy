package com.dao;

import com.to.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserDAO {
    public UserDAO() {
    }

    public void getUser(User user) throws Exception {
        Connection connection = Connectivity.getConnection();
        String query = "select * from user where userid = ? and userpassword = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);

        preparedStatement.setString(1, user.getUserId());
        preparedStatement.setString(1, user.getPassword());

        ResultSet resultSet = preparedStatement.executeQuery();

        if (resultSet.next()) {
            user.setStatus(resultSet.getString(3));
        } else {
            throw new Exception("Username and password doesn't match");
        }
    }
}
