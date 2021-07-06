package com.sapient.dao;

import com.sapient.service.DbService;

import java.sql.Connection;

public class PlaceOrderDao {
    private static Connection con;
    static {
        try {
            con = DbService.getDb();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
