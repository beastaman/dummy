package com.dao;

import java.sql.*;
import java.util.*;
import com.to.*;
import com.constant.Constants;

public class BranchDao {
	
	
 	
	public List<Table> getAllOrders(String branchId) throws Exception{
		Connection connection = Connectivity.getConnection();
		
		PreparedStatement ps = connection.prepareStatement(Constants.GET_ORDERSOF_BRANCHID);
		ps.setString(1, branchId);
		ResultSet rs = ps.executeQuery();
		
		List<Table> orders = new ArrayList<>();
		while(rs.next()) {
			orders.add(new Table(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6)));
		}
		return orders;
	}
	public int check(Table t) throws Exception{
		String st = t.getStartTime();
		String et = t.getEndTime();
		String ti = t.getTableId();
		String bi = t.getBranchId();

		Connection connection = Connectivity.getConnection();
		PreparedStatement ps = connection.prepareStatement("select * from tb where branchId = " + bi + " and tableId = " + ti + " and ((startTime > " + st + "and startTime<" + et +")" + "or (endTime>" + st + " and endTime <" + et + "))");
		
		ResultSet rs = ps.executeQuery();
		
		if(rs.next()) {
			return 0;
		}
		return 1;
		
		
	}
	public void insertOrder(Table t) throws Exception{
		Connection connection = Connectivity.getConnection();
		PreparedStatement ps = connection.prepareStatement(Constants.ADD_ORDERTO_BRANCHID);
		
		ps.setString(1, t.getUserId());
		ps.setString(2, t.getBranchId());
		ps.setString(3,t.getTableId());
		ps.setString(4, t.getStartTime());
		ps.setString(5, t.getEndTime());
		
		ps.executeUpdate();
		
	}
}
