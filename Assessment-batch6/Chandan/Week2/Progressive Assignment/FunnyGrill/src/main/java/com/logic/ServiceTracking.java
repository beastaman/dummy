package com.logic;

import java.util.ArrayList;
import java.util.List;

import com.dao.BranchDao;
import com.dao.OrderDao;
import com.to.BranchTO;
import com.to.CustomerTO;
import com.to.ParcelOrderTO;
import com.to.TableReserveTO;
import com.to.TimeSlotsTO;

public class ServiceTracking {
	
	
	public List<String[]> getTableTracking(CustomerTO customer) throws Exception{
		
		List<String[]> tableHistory = new ArrayList<>();
		
		
		OrderDao orderDao = new OrderDao();
		List<TableReserveTO> tableReserveTOs = orderDao.getRecentTableReserves(customer);
		
		BranchDao branchDao = new BranchDao();
		
		for (TableReserveTO tableReserve: tableReserveTOs){
			
			BranchTO branchTO = branchDao.getBranch(tableReserve.getBranchId());
			TimeSlotsTO timeSlotsTO = branchDao.getTimeSlot(tableReserve.getSlotId());
			
			tableHistory.add(
					new String[] {branchTO.getAddress(),tableReserve.getReserveDate(),
							timeSlotsTO.getInterval(),tableReserve.getStatus()}
					);
			
		}
		
		
		return tableHistory;
		
		
	}
	
	public List<String[]> getParcelTracking(CustomerTO customer) throws Exception{
		
		List<String[]> parcelHistory = new ArrayList<>();
		
		
		OrderDao orderDao = new OrderDao();
		List<ParcelOrderTO> parcelOrderTOs = orderDao.getRecentparcelOrders(customer);
		
		BranchDao branchDao = new BranchDao();
		
		for (ParcelOrderTO parcelOrder: parcelOrderTOs){
			
			BranchTO branchTO = branchDao.getBranch(parcelOrder.getBranchId());
			String orderDetails = orderDao.getParcelOrderDetails(parcelOrder.getId());
			
			
			parcelHistory.add(new String[] {
					branchTO.getAddress(), orderDetails, parcelOrder.getCreatedOn(), parcelOrder.getStatus()
			});
			
			
		}
		
		
		return parcelHistory;
		
		
	}
	
	
	
}
