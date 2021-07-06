package com.dao;

import java.util.ArrayList;
import java.util.List;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.client.model.DBCollectionFindOptions;
import com.to.Bookings;
import com.to.User;

public class ReservationDao {

	public static List<String> getSlots(String branch, String date, String guests) throws Exception
	{
		DB database = Connectivity.getDataBase();
		
		DBCollection collections = (DBCollection)database.getCollection("reservation");
		
		List<BasicDBObject> criteria = new ArrayList<BasicDBObject>();
		criteria.add(new BasicDBObject("Branch", branch));
		criteria.add(new BasicDBObject("Date", date));
		criteria.add(new BasicDBObject("Status", "Available"));
		BasicDBObject getQuery = new BasicDBObject();
		int g=Integer.parseInt(guests);;
		int limit=g+2;//will not have more than 2 empty chairs
		String lim=Integer.toString(limit);
	    getQuery.put("Capacity", new BasicDBObject("$gte", guests).append("$lte",lim));
		criteria.add(getQuery);
		BasicDBObject projection = new BasicDBObject("Time", 1);
		List<String> slots=collections.distinct("Time",new BasicDBObject("$and", criteria));
		slots.forEach(System.out::println);
		return slots;
	}
	public static void bookSlot(String branch, String date, String time, String guests, String username) throws Exception
	{
		DB database = Connectivity.getDataBase();
		
		DBCollection collections = (DBCollection)database.getCollection("reservation");
		BasicDBObject newDocument = new BasicDBObject();
	    newDocument.append("$set", new BasicDBObject().append("Status", "Booked"));
	    List<BasicDBObject> criteria = new ArrayList<BasicDBObject>();
		criteria.add(new BasicDBObject("Branch", branch));
		criteria.add(new BasicDBObject("Date", date));
		criteria.add(new BasicDBObject("Time", time));
		criteria.add(new BasicDBObject("Status", "Available"));
		String cap="";
		for(int i=0;i<=2;i++)
		{
			cap=Integer.toString(Integer.parseInt(guests)+i);
			criteria.add(new BasicDBObject("Capacity", cap));
			BasicDBObject Query=new BasicDBObject("$and", criteria);
			DBCursor cursor=collections.find(Query);
			if(cursor.hasNext())
			{
				String tid=(String)cursor.next().get("TableId");
				criteria.add(new BasicDBObject("TableId", tid));
				BasicDBObject Query2=new BasicDBObject("$and", criteria);
				collections.update(Query2, newDocument);
				BookingsDao.newBooking(new Bookings(username, branch, date, time,tid , guests));
				return;
			}
			criteria.remove(criteria.size()-1);
		}
	}
}
