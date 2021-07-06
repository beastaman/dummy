package com.sapient.service;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbService {
    //    com.mysql.cj.jdbc.Driver
    //"jdbc:mysql://localhost:3306/alphschool", "root", "admin"
    public static Connection con = null;
    public static Connection getConnection() throws Exception {
        if(con == null){
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sbatch6","root", "Nikhil@123");
        }
        return con;
    }
}
