package com.sapient.dao;

import com.sapient.entity.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserDao {


    public User getUser(User user) throws Exception{
        Connection connection = Connectivity.getConnection();
        PreparedStatement ps = connection.prepareStatement("select * from user where userid=? and password=?");
        ps.setString(1, user.getUserId());
        ps.setString(2, user.getPassword());
        ResultSet rs = ps.executeQuery();
        if(rs.next()){
           return User.builder()
                   .userId(rs.getString(1))
                   .password(rs.getString(2))
                   .status(rs.getString(3))
                   .build() ;
        }else{
            throw new Exception("User not found!!");
        }
    }
}
