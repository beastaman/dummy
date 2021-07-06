package com.dao;
import java.sql.*;
public class Connnectivity {
	public static Connection connection = null;
	public static Connection getConnection() throws Exception {
		if(connection == null) {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sbatch6", "root", "mansiaman");
		}
		return connection;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
