package com.dao;

import java.util.List;

import com.mongodb.BasicDBObject;
import com.mongodb.BasicDBObjectBuilder;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.to.Orders;

public class OrdersDao {
	public static Object addEntry(Orders order) throws Exception
	{
		DB database = Connectivity.getDataBase();
		
		DBCollection collections = (DBCollection)database.getCollection("orders");
		DBObject dbObject=BasicDBObjectBuilder.start().get();
		dbObject.put("username",order.getUsername());
		dbObject.put("fname",order.getFname());
		dbObject.put("lname",order.getLname());
		dbObject.put("phoneno",order.getPhoneno());
		dbObject.put("bill",order.getBill());
		dbObject.put("status",order.getStatus());
		collections.insert(dbObject);
		return dbObject.get("_id");
	}
	public static String getStatus(Object billno) throws Exception
	{
		DB database = Connectivity.getDataBase();
		
		DBCollection collections = (DBCollection)database.getCollection("orders");
//		BasicDBObject projection = new BasicDBObject("status", 1);
		BasicDBObject dbo=new BasicDBObject("_id",billno);
		List<String> status=collections.distinct("status",dbo);
		return status.get(0);
	}
}
