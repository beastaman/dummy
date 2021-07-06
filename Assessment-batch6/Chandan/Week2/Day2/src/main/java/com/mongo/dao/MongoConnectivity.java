package com.mongo.dao;

import com.mongodb.DB;
import com.mongodb.MongoClient;

public class MongoConnectivity {
	
	public static DB getDatabase () {
		
		DB db;
		
		MongoClient client = new MongoClient("localhost", 27017);
		
		db = client.getDB("psi_asde");
		
		return db;
		
	}
	
	
}
