package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.constant.Constants;

public class BookingDao {
	public String check(String time) throws Exception {

		Connection connection = Connectivity.getConnection();
		// constant or resources
		PreparedStatement preparedStatement = connection.prepareStatement(Constants.GET_BOOKING_WITH_TIME_T1);
		preparedStatement.setString(1, time);
		ResultSet resultSet = preparedStatement.executeQuery();
		if (!resultSet.next())
			return "t1";
		preparedStatement = connection.prepareStatement(Constants.GET_BOOKING_WITH_TIME_T2);
		preparedStatement.setString(1, time);
		resultSet = preparedStatement.executeQuery();
		if (!resultSet.next()) {
			return "t2";
		}
		preparedStatement = connection.prepareStatement(Constants.GET_BOOKING_WITH_TIME_T3);
		preparedStatement.setString(1, time);
		resultSet = preparedStatement.executeQuery();
		if (!resultSet.next()) {
			return "t3";
		}
		return null;
	}
	
	public void insertBooking(String branchid,String tableid,String userid,String time) throws Exception {
		Connection connection = Connectivity.getConnection();
		// constant or resources
//		System.out.println(student);
		
		String query="insert into booking (branchid, tableid, userid,time) values (?,?,?,?)";
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		preparedStatement.setString(1, branchid);
		preparedStatement.setString(2, tableid);
		preparedStatement.setString(3, userid);
		preparedStatement.setString(4, time);
		preparedStatement.executeUpdate();
		
	}
	public Integer getOrderid(String branchid,String tableid,String userid,String time) throws Exception {
		Connection connection = Connectivity.getConnection();
		// constant or resources
//		System.out.println(student);
		String query="select* from booking where branchid=? && tableid=? && userid=? && time=?";
		PreparedStatement preparedStatement = connection.prepareStatement(query);

		preparedStatement.setString(1, branchid);
		preparedStatement.setString(2, tableid);
		preparedStatement.setString(3, userid);
		preparedStatement.setString(4, time);
		ResultSet resultSet = preparedStatement.executeQuery();
		System.out.println("hellolo");
		if(resultSet.next()) {
			Integer orderid=Integer.parseInt(resultSet.getString(1));
			return orderid;
		}
		return 0;
		
	}
}
