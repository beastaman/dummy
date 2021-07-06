package com.sapient.service;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbService {
    public static Connection con = null;
    public static Connection getDb() throws Exception {
        if(con == null){
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/restraunt","root", "Nikhil@123");
        }
        return con;
    }
}
