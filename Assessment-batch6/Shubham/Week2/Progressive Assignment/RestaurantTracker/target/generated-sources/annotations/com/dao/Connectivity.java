package com.dao;

import com.mongodb.DB;
import com.mongodb.MongoClient;

public class Connectivity {

	public static DB getDataBase() throws Exception{
		DB db;
		MongoClient client=new MongoClient("localhost",27017);
		
		db=client.getDB("restaurant");
		return db;
	}
	
}
