package com.sapient.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.sql.Date;
import java.util.List;
import java.util.Map;

import com.sapient.constants.Constants;
import com.sapient.dto.Branch;
import com.sapient.dto.Reservation;
import com.sapient.dto.ReservationDetails;
import com.sapient.dto.Table;

public class BranchDao {

	public List<Branch> getAllBranch() throws Exception {
		
		Connection connection = Connectivity.getConnection();
		
		PreparedStatement preparedStatement = connection.prepareStatement(Constants.GET_ALL_BRANCH_QUERY);
		ResultSet resultSet = preparedStatement.executeQuery();
		
		List<Branch> branchList = new ArrayList<>();
		while(resultSet.next()) {
			branchList.add(getBranch(resultSet));
		}
		
		return branchList;
	}

	public Branch getBranchById(int id) throws Exception {

		Connection connection = Connectivity.getConnection();
		
		PreparedStatement preparedStatement = connection.prepareStatement(Constants.GET_BRANCH_BY_ID_QUERY);
		preparedStatement.setInt(1, id);
		ResultSet resultSet = preparedStatement.executeQuery();
		
		Branch branch = null;
		if(resultSet.next())
			branch = getBranch(resultSet);
		
		return branch;
	}

	public Table getTableById(int id) throws Exception {

		Connection connection = Connectivity.getConnection();
		
		PreparedStatement preparedStatement = connection.prepareStatement(Constants.GET_TABLE_BY_ID_QUERY);
		preparedStatement.setInt(1, id);
		ResultSet resultSet = preparedStatement.executeQuery();
		
		Table table = null;
		if(resultSet.next())
			table = getTable(resultSet);
		
		return table;
	}
	
	public List<Table> getReservations(int branchId, Date date) throws Exception {

		Connection connection = Connectivity.getConnection();
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		
		PreparedStatement preparedStatement = connection.prepareStatement(Constants.GET_RESERVATIONS_BY_BRANCH_AND_DATE_QUERY);
		preparedStatement.setInt(1, branchId);
		preparedStatement.setString(2, calendar.get(Calendar.YEAR) + "-" + (calendar.get(Calendar.MONTH)+1) + "-" + calendar.get(Calendar.DATE));
		calendar.add(Calendar.DATE, 1);
		preparedStatement.setString(3, calendar.get(Calendar.YEAR) + "-" + (calendar.get(Calendar.MONTH)+1) + "-" + calendar.get(Calendar.DATE));
		ResultSet resultSet = preparedStatement.executeQuery();
		
		Map<Integer, Table> tables = new HashMap<>();
		while(resultSet.next()) {
			Table table = getTableReservation(resultSet);
			if(!tables.containsKey(table.getTableNo()))
				tables.put(table.getTableNo(), table);
			else
				tables.get(table.getTableNo()).getReservations().addAll(table.getReservations());
		}
		
		List<Table> tableList = new ArrayList<>(tables.values());
		tableList.forEach((table) -> Collections.sort(table.getReservations(), (a, b) -> (a.getStartTime().compareTo(b.getStartTime()))));
		
		return tableList;
	}
	
	public Reservation saveReservation(Reservation reservation) throws Exception {

		Connection connection = Connectivity.getConnection();
		
		PreparedStatement preparedStatement = connection.prepareStatement(Constants.CHECK_VALID_RESERVATION_QUERY);
		preparedStatement.setInt(1, reservation.getTableId());
		preparedStatement.setTimestamp(2, reservation.getStartTime());
		preparedStatement.setInt(3, reservation.getDuration());
		preparedStatement.setTimestamp(4, reservation.getStartTime());
		preparedStatement.setTimestamp(5, reservation.getStartTime());
		preparedStatement.setInt(6, reservation.getDuration());
		preparedStatement.setTimestamp(7, reservation.getStartTime());
		ResultSet resultSet = preparedStatement.executeQuery();
		
		if(resultSet.next())
			return null;
		
		preparedStatement = connection.prepareStatement(Constants.SAVE_RESERVATION_QUERY, Statement.RETURN_GENERATED_KEYS);
		preparedStatement.setInt(1, reservation.getTableId());
		preparedStatement.setInt(2, reservation.getUserId());
		preparedStatement.setTimestamp(3, reservation.getStartTime());
		preparedStatement.setInt(4, reservation.getDuration());
		int n = preparedStatement.executeUpdate();

		reservation = null;
		if(n > 0) {
			resultSet = preparedStatement.getGeneratedKeys();
			if(resultSet.next())
				reservation = getReservationById(resultSet.getInt(1));
			else
				reservation = null;
		}
		
		return reservation;
	}
	
	public Reservation getReservationById(int id) throws Exception {

		Connection connection = Connectivity.getConnection();
		
		PreparedStatement preparedStatement = connection.prepareStatement(Constants.GET_RESERVATION_BY_ID_QUERY);
		preparedStatement.setInt(1, id);
		ResultSet resultSet = preparedStatement.executeQuery();
		
		Reservation reservation = null;
		if(resultSet.next())
			reservation = getReservation(resultSet);
		
		return reservation;
	}
	
	public List<ReservationDetails> getReservationsOfUser(int userId) throws Exception {

		Connection connection = Connectivity.getConnection();
		
		PreparedStatement preparedStatement = connection.prepareStatement(Constants.GET_RESERVATIONS_OF_USER_QUERY);
		preparedStatement.setInt(1, userId);
		ResultSet resultSet = preparedStatement.executeQuery();
		
		List<ReservationDetails> reservations = new ArrayList<>();
		while(resultSet.next()) {
			reservations.add(getReservationDetais(resultSet));
		}
		
		return reservations;
	}

	private Branch getBranch(ResultSet resultSet) throws Exception {

		Branch branch = new Branch();
		branch.setId(resultSet.getInt(1));
		branch.setName(resultSet.getString(2));
		branch.setOpen(resultSet.getTimestamp(3));
		branch.setClose(resultSet.getTimestamp(4));
		branch.setAddress(resultSet.getString(5));
		
		return branch;
	}

	private Table getTableReservation(ResultSet resultSet) throws Exception {

		Table table = getTable(resultSet);
		if (resultSet.getString(4) != null)
			table.getReservations().add(getReservation(resultSet, 3));
		
		return table;
	}

	private Table getTable(ResultSet resultSet) throws Exception {

		Table table = new Table();
		table.setId(resultSet.getInt(1));
		table.setBranchId(resultSet.getInt(2));
		table.setTableNo(resultSet.getInt(3));
		
		return table;
	}

	private Reservation getReservation(ResultSet resultSet, int offset) throws Exception {

		Reservation reservation = new Reservation();
		reservation.setId(resultSet.getInt(1 + offset));
		reservation.setTableId(resultSet.getInt(2 + offset));
		reservation.setUserId(resultSet.getInt(3 + offset));
		reservation.setStartTime(resultSet.getTimestamp(4 + offset));
		reservation.setDuration(resultSet.getInt(5 + offset));
		
		return reservation;
	}

	private Reservation getReservation(ResultSet resultSet) throws Exception {

		return getReservation(resultSet, 0);
	}

	private ReservationDetails getReservationDetais(ResultSet resultSet) throws SQLException {
		
		ReservationDetails reservationDetails = new ReservationDetails(resultSet.getInt(1), resultSet.getInt(2), resultSet.getString(3), resultSet.getInt(4), resultSet.getTimestamp(5), resultSet.getTimestamp(6), resultSet.getInt(7));
		return reservationDetails;
	}

}
