package com.dao;

import com.mongodb.BasicDBObjectBuilder;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.to.Bookings;

public class BookingsDao {
	public static void newBooking(Bookings booking) throws Exception
	{
		DB database = Connectivity.getDataBase();
		UserDao dao = new UserDao();
		
		DBCollection collections = (DBCollection)database.getCollection("bookings");
		DBObject dbObject=BasicDBObjectBuilder.start().get();
		dbObject.put("username",booking.getUsername());
		dbObject.put("Branch",booking.getBranch());
		dbObject.put("lname",booking.getDate());
		dbObject.put("Time",booking.getTime());
		dbObject.put("TableId",booking.getTableId());
		dbObject.put("Guests",booking.getGuests());
		collections.insert(dbObject);
		
	}
}
