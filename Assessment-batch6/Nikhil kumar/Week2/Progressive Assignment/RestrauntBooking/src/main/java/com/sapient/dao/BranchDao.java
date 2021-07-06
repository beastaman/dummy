package com.sapient.dao;
import com.sapient.entity.Branch;
import com.sapient.service.DbService;
import com.sapient.utils.Constants;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class BranchDao {
    private static Connection con;
    static {
        try {
            con = DbService.getDb();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static List<Branch> findAll() throws Exception{
        PreparedStatement ps = con.prepareStatement(Constants.FIND_ALL_BRANCHES);
        ResultSet rs = ps.executeQuery();
        List<Branch> allBrannches = new ArrayList<>();
        while (rs.next()){
            allBrannches.add(Branch.builder()
                    .branchId(rs.getString(1))
                    .branchName(rs.getString(2))
                    .address(rs.getString(3))
                    .phoneNo(rs.getString(4))
                    .build());
        }
        return allBrannches;
    }
}
