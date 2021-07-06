package com.sapient.dao;

import com.sapient.dto.UserOrderDTO;
import com.sapient.service.DbService;
import com.sapient.utils.Constants;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class OrderingDao {
    private static Connection con;
    static {
        try {
            con = DbService.getDb();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void insert(UserOrderDTO userOrderDTO) throws Exception{
        PreparedStatement ps = con.prepareStatement(Constants.INSERT_CUSTOMER_ORDER_MAPPING);
        ps.setString(1, userOrderDTO.getUid());
        ps.setString(2, userOrderDTO.getFid());
        ps.setString(3, String.valueOf(userOrderDTO.getQty()));
        ps.executeUpdate();
    }
    public static List<UserOrderDTO> findByUserId(String uid) throws Exception{
        List<UserOrderDTO> userMapping  = new ArrayList<>();
        PreparedStatement ps = con.prepareStatement(Constants.FIND_ORDER_USER_MAPPING_BY_USER_ID);
        ps.setString(1, uid);
        ResultSet rs = ps.executeQuery();
        while (rs.next()){
            userMapping.add(
                    UserOrderDTO.builder()
                    .uid(rs.getString(1))
                            .fid(rs.getString(2))
                            .qty(rs.getString(3))
                            .build()
            );
        }
        return userMapping;
    }
}
