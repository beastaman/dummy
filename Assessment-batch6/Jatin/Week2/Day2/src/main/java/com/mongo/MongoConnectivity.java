package com.mongo;

import com.mongodb.DB;
import com.mongodb.MongoClient;

public class MongoConnectivity {
	public static DB getDatabase() throws Exception {
		MongoClient client = new MongoClient("localhost", 27017);

		DB db;
		db = client.getDB("sbatch6");
		return db;
	}
}
