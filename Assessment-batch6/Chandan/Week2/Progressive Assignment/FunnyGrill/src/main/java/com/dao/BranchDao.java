package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.constants.Constants;
import com.to.BranchTO;
import com.to.FoodItemTO;
import com.to.TimeSlotsTO;

public class BranchDao {

	public List<BranchTO> getAllBranches() throws ClassNotFoundException, SQLException {

		List<BranchTO> branches = new ArrayList<>();

		Connection connection = Connectivity.getConnection();

		PreparedStatement preparedStatement = connection.prepareStatement(Constants.ALL_BRANCHES);

		ResultSet resultSet = preparedStatement.executeQuery();

		while (resultSet.next()) {

			branches.add(new BranchTO(resultSet.getInt("id"), resultSet.getString("area"), resultSet.getString("city"),
					resultSet.getString("state"), resultSet.getInt("tables"), resultSet.getString("ph_no")));

		}

		return branches;
	}

	public BranchTO getBranch(int branchId) throws Exception {

		Connection connection = Connectivity.getConnection();

		PreparedStatement preparedStatement = connection.prepareStatement(Constants.GET_BRANCH);
		preparedStatement.setInt(1, branchId);

		ResultSet resultSet = preparedStatement.executeQuery();

		if (resultSet.next()) {
			return new BranchTO(resultSet.getInt("id"), resultSet.getString("area"), resultSet.getString("city"),
					resultSet.getString("state"), resultSet.getInt("tables"), resultSet.getString("ph_no"));
		} else {

			throw new Exception("Branch Not Found");

		}

	}

	public List<FoodItemTO> getFoodItems(BranchTO branch) throws ClassNotFoundException, SQLException {

		List<FoodItemTO> foodItems = new ArrayList<>();

		Connection connection = Connectivity.getConnection();

		PreparedStatement preparedStatement = connection.prepareStatement(Constants.BRANCH_FOOD);
		preparedStatement.setInt(1, branch.getId());

		ResultSet resultSet = preparedStatement.executeQuery();

		while (resultSet.next()) {

			foodItems.add(
					new FoodItemTO(resultSet.getInt("id"), resultSet.getString("name"), resultSet.getDouble("price")));

		}

		return foodItems;

	}

	public List<TimeSlotsTO> getTimeSlots() throws ClassNotFoundException, SQLException {

		List<TimeSlotsTO> timeSlots = new ArrayList<>();

		Connection connection = Connectivity.getConnection();

		PreparedStatement preparedStatement = connection.prepareStatement(Constants.GET_TIME_SLOTS);

		ResultSet resultSet = preparedStatement.executeQuery();

		while (resultSet.next()) {

			timeSlots.add(
					new TimeSlotsTO(resultSet.getInt("id"), resultSet.getString("start"), resultSet.getString("end")));

		}

		return timeSlots;

	}
	
	
	public TimeSlotsTO getTimeSlot(int id) throws Exception {

		Connection connection = Connectivity.getConnection();

		PreparedStatement preparedStatement = connection.prepareStatement(Constants.GET_TIME_SLOT);
		preparedStatement.setInt(1, id);

		ResultSet resultSet = preparedStatement.executeQuery();

		if (resultSet.next()) {

			return new TimeSlotsTO(resultSet.getInt("id"), resultSet.getString("start"), resultSet.getString("end"));

		}
		else {
			
			throw new Exception("Time Slot Not Found");
		}
	}
	
	
	public int getAvailableTables(int branchId, String date, int slotId) {
		
		
		
		return 0;
	}

}
