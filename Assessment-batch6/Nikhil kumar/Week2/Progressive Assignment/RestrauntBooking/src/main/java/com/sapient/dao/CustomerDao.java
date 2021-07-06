package com.sapient.dao;

import com.sapient.dto.LoginRequest;
import com.sapient.service.DbService;
import com.sapient.utils.Constants;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class CustomerDao {
    private static Connection con;
    static {
        try {
            con = DbService.getDb();
        } catch (Exception e) {
            System.out.println("Db Service Error!!");
        }
    }
    public static boolean findUserByIdAndPassword(LoginRequest request) throws Exception{
        System.out.println(request.getUsername()+" --- "+request.getPassword());
        PreparedStatement ps =  con.prepareStatement(Constants.FIND_CUSTOMER);
        ps.setString(1, request.getUsername());
        ps.setString(2, request.getPassword());
        ResultSet rs = ps.executeQuery();
        return rs.next();
    }

    public static String findUserIdByEmail(String email) throws Exception{
        PreparedStatement ps =  con.prepareStatement(Constants.FIND_USERID_BY_USEREMAIL);
        ps.setString(1, email);
        ResultSet rs = ps.executeQuery();
        return rs.next() ? rs.getString(1) : "";
    }
}
