package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.constants.Constants;
import com.to.CustomerTO;
import com.to.FoodItemTO;
import com.to.ParcelOrderTO;
import com.to.TableReserveTO;

public class OrderDao {

	public void addParcelOrder(ParcelOrderTO parcelOrderTO) throws Exception {
		Connection connection = Connectivity.getConnection();

		PreparedStatement preparedStatement = connection.prepareStatement(Constants.PLACE_PARCEL,
				PreparedStatement.RETURN_GENERATED_KEYS);
		preparedStatement.setInt(1, parcelOrderTO.getCustomerId());
		preparedStatement.setInt(2, parcelOrderTO.getBranchId());
		preparedStatement.setString(3, parcelOrderTO.getStatus());

		preparedStatement.executeUpdate();

		ResultSet resultSet = preparedStatement.getGeneratedKeys();

		if (resultSet.next()) {

			parcelOrderTO.setId(resultSet.getInt(1));
		} else {
			throw new Exception("Could not order parcel");
		}

	}

	public boolean addParcelItems(int parcelId, List<FoodItemTO> foodItems, List<Integer> quantities)
			throws ClassNotFoundException, SQLException {

		Connection connection = Connectivity.getConnection();

		StringBuilder addFoodItemsQuery = new StringBuilder();
		addFoodItemsQuery.append("insert into parcelfood values ");
		int i = 0;
		for (; i < foodItems.size() - 1; i++) {
			addFoodItemsQuery
					.append(String.format(" (%d, %d, %d),", parcelId, foodItems.get(i).getId(), quantities.get(i)));
		}
		addFoodItemsQuery
				.append(String.format(" (%d, %d, %d);", parcelId, foodItems.get(i).getId(), quantities.get(i)));

		PreparedStatement preparedStatement = connection.prepareStatement(addFoodItemsQuery.toString());

		preparedStatement.executeUpdate();

		return true;

	}

	public boolean addTableReserve(TableReserveTO tableReserveTO) throws ClassNotFoundException, SQLException {

		Connection connection = Connectivity.getConnection();

		PreparedStatement preparedStatement = connection.prepareStatement(Constants.BOOK_TABLE);
		preparedStatement.setInt(1, tableReserveTO.getCustomerId());
		preparedStatement.setInt(2, tableReserveTO.getBranchId());
		preparedStatement.setInt(3, tableReserveTO.getSlotId());
		preparedStatement.setString(4, tableReserveTO.getStatus());
		preparedStatement.setString(5, tableReserveTO.getReserveDate());

		preparedStatement.executeUpdate();

		return true;

	}

	public List<TableReserveTO> getRecentTableReserves(CustomerTO customerTO)
			throws ClassNotFoundException, SQLException {

		List<TableReserveTO> tableReserveTOs = new ArrayList<>();

		Connection connection = Connectivity.getConnection();

		PreparedStatement preparedStatement = connection.prepareStatement(Constants.RECENT_TABLES_CUST);
		preparedStatement.setInt(1, customerTO.getId());

		ResultSet resultSet = preparedStatement.executeQuery();

		while (resultSet.next()) {

			tableReserveTOs.add(new TableReserveTO(resultSet.getInt("id"), resultSet.getInt("customer_id"),
					resultSet.getInt("branch_id"), resultSet.getInt("slot_id"), resultSet.getString("status"),
					resultSet.getString("reservedate")));

		}

		return tableReserveTOs;

	}

	public List<ParcelOrderTO> getRecentparcelOrders(CustomerTO customerTO)
			throws ClassNotFoundException, SQLException {

		List<ParcelOrderTO> parcelOrderTOs = new ArrayList<>();

		Connection connection = Connectivity.getConnection();

		PreparedStatement preparedStatement = connection.prepareStatement(Constants.RECENT_PARCEL_CUST);
		preparedStatement.setInt(1, customerTO.getId());

		ResultSet resultSet = preparedStatement.executeQuery();

		while (resultSet.next()) {

			parcelOrderTOs.add(new ParcelOrderTO(resultSet.getInt("id"), resultSet.getInt("customer_id"),
					resultSet.getInt("branch_id"), resultSet.getString("status"), resultSet.getString("created_at")));

		}

		return parcelOrderTOs;

	}

	public String getParcelOrderDetails(int parcelId) throws ClassNotFoundException, SQLException {

		StringBuilder parcelOrderDet = new StringBuilder();
		double totalPrice = 0;

		Connection connection = Connectivity.getConnection();

		PreparedStatement preparedStatement = connection.prepareStatement(Constants.PARCEL_ORDER_DET);
		preparedStatement.setInt(1, parcelId);

		ResultSet resultSet = preparedStatement.executeQuery();

		while (resultSet.next()) {

			double subTot = resultSet.getInt("qty") * resultSet.getDouble("price");
			parcelOrderDet.append(String.format("%s [Qty=%d] [Price=%.2f] [SubTotal=%.2f]<br>",
					resultSet.getString("name"), resultSet.getInt("qty"), resultSet.getDouble("price"), subTot));

			totalPrice += subTot;

		}

		parcelOrderDet.append(String.format("<br>Total Price = %.2f", totalPrice));
		

		return parcelOrderDet.toString();

	}

}
