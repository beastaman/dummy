package com.asde.dbconnect.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connectivity {
    public static Connection connection = null;
	
	private Connectivity() {
		
	}
	
	public static Connection getConnection() throws Exception {
		if(connection == null) {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/vaccination", "root", "admin");
		}
		
		return connection;
	}
}
