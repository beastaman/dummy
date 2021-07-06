package com.dao;

import com.to.Order;
import com.to.Reservation;

public class Main {
	public static void main(String[] args) throws Exception {
		OrderDao orderDao = new OrderDao();
		Order order = new Order("o1", "test", 100);
		
		orderDao.insertData(order); 
	}
}
