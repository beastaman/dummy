package com.dao;

import java.sql.*;

public class connectivity {

	public static Connection connection=null;
		
	public static Connection getConnection() throws Exception{
		if (connection==null) {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/sbatch6","root","F5grgeRz");
		}
		return connection;
	
	}
}
