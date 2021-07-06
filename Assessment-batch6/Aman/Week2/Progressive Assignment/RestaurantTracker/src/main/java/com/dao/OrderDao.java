package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.to.Order;

public class OrderDao {
	public static Integer oid=1;
	public void insertTableOrder(Order order) throws Exception{
		oid++;
		oid++;
		String osd="O"+oid;
		Connection connection = Connectivity.getConnection();
		System.out.println(order);
		String query="insert into orders values (?,?,?,?)";
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		preparedStatement.setString(1, order.getCustid());
		preparedStatement.setString(2, order.getBranchid());
		preparedStatement.setString(3, order.getTableid());
		preparedStatement.setString(4,osd );
		preparedStatement.executeUpdate();
		String query1="update tables set tablestatus='occupied' where tableid=?";
		preparedStatement = connection.prepareStatement(query1);
		preparedStatement.setString(1, order.getTableid());
		preparedStatement.executeUpdate();
	}
	public void insertParcelOrder(Order order) throws Exception{
		oid++;
		oid++;
		String osd="O"+oid;
		Connection connection = Connectivity.getConnection();
		System.out.println(order);
		String query="insert into orders values (?,?,?,?)";
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		preparedStatement.setString(1, order.getCustid());
		preparedStatement.setString(2, order.getBranchid());
		preparedStatement.setString(3, order.getTableid());
		preparedStatement.setString(4,osd );
		preparedStatement.executeUpdate();
	}
}
