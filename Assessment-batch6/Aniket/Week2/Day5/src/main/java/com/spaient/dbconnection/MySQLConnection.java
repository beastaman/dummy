package com.spaient.dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnection {
    private static Connection connection = null;

    private MySQLConnection() {
    }

    public static Connection getConnection() throws SQLException {
        if (connection == null) {
            connection = getMySQLConnectionFactory();
        }
        return connection;
    }

    private static Connection getMySQLConnectionFactory() {

        String url = "jdbc:mysql://localhost:3306/assignment2";
        String userName = "root";
        String password = "hP@f2$@g";

        // Look for driver
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        // Get connection
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, userName, password);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return connection;
    }
}