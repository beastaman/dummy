package com.sapient.dao;

import com.sapient.dto.UserTableDTO;
import com.sapient.service.DbService;
import com.sapient.utils.Constants;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class BookingDao {
    private static Connection con;
    static {
        try {
            con = DbService.getDb();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void insert(UserTableDTO userTableDTO) throws Exception{
        PreparedStatement ps = con.prepareStatement(Constants.INSERT_CUSTOMER_TABLE_MAPPING);
        ps.setString(1, userTableDTO.getUid());
        ps.setString(2, userTableDTO.getTid());
        ps.executeUpdate();
    }

    public static UserTableDTO findById(String uid) throws Exception{
        PreparedStatement ps = con.prepareStatement(Constants.FIND_ORDER_TABLE_MAPPING_BY_USER_ID);
        ps.setString(1, uid);
        ResultSet rs = ps.executeQuery();
        if(rs.next()){
            return UserTableDTO.builder()
                    .uid(rs.getString(1))
                    .tid(rs.getString(2))
                    .build();
        }
        return UserTableDTO.builder().build();
    }
}
