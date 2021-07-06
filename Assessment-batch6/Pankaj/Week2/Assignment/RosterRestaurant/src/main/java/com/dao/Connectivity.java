package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connectivity {
	public static Connection connection = null;

	public Connectivity() {
		// TODO Auto-generated constructor stub
	}

	public static Connection getConnection() throws Exception {
		if (connection == null) {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/roster", "root", "Pankaj@123");
		}
		return connection;
	}
}
