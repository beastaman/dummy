package com.sapient.dao;

import com.sapient.entity.FoodItem;
import com.sapient.service.DbService;
import com.sapient.utils.Constants;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class FoodItemDao {
    private static Connection con;
    static {
        try {
            con = DbService.getDb();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static List<FoodItem> findAll() throws Exception{
        List<FoodItem> foodItems = new ArrayList<>();
        PreparedStatement ps = con.prepareStatement(Constants.FIND_ALL_FOODITEM);
        ResultSet rs = ps.executeQuery();
        while (rs.next()){
            foodItems.add(FoodItem.builder()
                    .foodId(rs.getString(1))
                    .foodName(rs.getString(2))
                    .foodPrice(rs.getString(3))
                    .build());
        }
        return foodItems;
    }

    public static FoodItem findById(String id) throws Exception {
        PreparedStatement ps =con.prepareStatement(Constants.FIND_FOODITEM_BY_ID);
        ps.setString(1, id);
        ResultSet rs = ps.executeQuery();
        return rs.next() ?
                FoodItem.builder()
                        .foodId(rs.getString(1))
                        .foodName(rs.getString(2))
                        .foodPrice(rs.getString(3))
                        .build() :null;
    }
}
