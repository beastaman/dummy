package com.logic;

import java.sql.SQLException;
import java.util.List;

import com.dao.OrderDao;
import com.to.FoodItemTO;
import com.to.ParcelOrderTO;
import com.to.TableReserveTO;

public class OrderingService {

	public boolean placeParcelOrder(ParcelOrderTO parcelOrderTO, List<FoodItemTO> foodItems, List<Integer> quantities)
			throws Exception {
		if (foodItems.size() > 0) {
			OrderDao orderDao = new OrderDao();
			
			// if(limit not reached): parcelOrderTO.setStatus("Confirmed");
			// else: parcelOrderTO.setStatus("Not Confirmed")
			
			// for now set Confirmed
			parcelOrderTO.setStatus("Confirmed");
			
			orderDao.addParcelOrder(parcelOrderTO);
			orderDao.addParcelItems(parcelOrderTO.getId(), foodItems, quantities);
		}
		return true;
	}

	public boolean bookTable(TableReserveTO tableReserveTO) throws ClassNotFoundException, SQLException {
		OrderDao orderDao = new OrderDao();
		
		// if(tables available): tableReserveTO.setStatus("Confirmed");
		// else: tableReserveTO.setStatus("Not Confirmed")
		
		// for now set Confirmed
		tableReserveTO.setStatus("Confirmed");
		
		return orderDao.addTableReserve(tableReserveTO);
	}

}
