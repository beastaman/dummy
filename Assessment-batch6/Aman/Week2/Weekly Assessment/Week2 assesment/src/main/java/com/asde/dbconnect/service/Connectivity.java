package com.asde.dbconnect.service;
import java.sql.*;
public class Connectivity {
    public static Connection connection = null;
    public static Connection getConnection() throws Exception {
		if(connection == null) {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/vaccination", "root", "admin");
		}
		return connection;
	}
}
