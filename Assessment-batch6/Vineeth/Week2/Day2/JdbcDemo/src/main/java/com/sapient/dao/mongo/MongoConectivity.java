package com.sapient.dao.mongo;

import com.mongodb.DB;
import com.mongodb.MongoClient;

public class MongoConectivity {

	public static DB getDB() {
		
		MongoClient client = new MongoClient("localhost", 27017);
		DB db = client.getDB("psi");
		
		return db;
	}

}
