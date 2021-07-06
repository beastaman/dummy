package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.to.Reservation;
import com.to.User;

public class ReservationDao {

	public boolean insertData(Reservation reservation) throws Exception {
		Connection connection = Connectivity.getConnection();
		
		String query = "insert into reservation values (?, ?, ?, now())";
		PreparedStatement preparedStudent = connection.prepareStatement(query);
		preparedStudent.setString(1, reservation.getUserid());
		preparedStudent.setString(2, reservation.getBid());
		preparedStudent.setInt(3, reservation.getTables());
		
		preparedStudent.executeUpdate();
		
		return true;
	}
	
}
