package com.sapient.connector;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connectivity {

	public static Connection connection = null;

	public static Connection getConnection() throws Exception {
		if (connection == null) {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/rostermanagement", "root",
					"MySQL1114@gd");
		}

		return connection;
	}

}
