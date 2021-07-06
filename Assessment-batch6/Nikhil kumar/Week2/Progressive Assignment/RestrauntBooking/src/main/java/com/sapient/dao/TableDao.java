package com.sapient.dao;

import com.sapient.entity.Table;
import com.sapient.service.DbService;
import com.sapient.utils.Constants;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class TableDao {
    private static Connection con;
    static {
        try {
            con = DbService.getDb();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Table findTableById(String id) throws Exception{
        PreparedStatement ps = con.prepareStatement(Constants.FIND_TABLE_BY_ID);
        ps.setString(1, id);
        ResultSet rs = ps.executeQuery();
        return rs.next() ? Table.builder()
                .tableId(rs.getString(1))
                .price(Integer.parseInt(rs.getString(2)))
                .status(rs.getString(3))
                .branchId(rs.getString(4))
                .build() : null;
    }

    public static List<Table> findAllByBranchId(String id) throws Exception{
        System.out.println("Bid: "+id);
        List<Table> tables = new ArrayList<>();
        PreparedStatement ps =con.prepareStatement(Constants.FIND_ALL_TABLES_IN_BRANCH);
        ps.setString(1, id);
        ResultSet rs = ps.executeQuery();
        while (rs.next()){
            tables.add(Table.builder()
                    .tableId(rs.getString(1))
                    .price(Integer.parseInt(rs.getString(2)))
                    .status(rs.getString(3))
                    .branchId(rs.getString(4))
                    .build());
        }
        tables.forEach(System.out::println);
        return tables;
    }
}
