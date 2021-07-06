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
		if (!resultSet.next()) {
			return "t1";
		}
		System.out.println("hello");
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
}
