package com.mongo;

import com.mongodb.DB;
import com.mongodb.MongoClient;

public class MongoConnectivity {
	public static DB getDatabase() throws Exception{
		DB db;
		
		MongoClient client=new MongoClient("localhost",27017);
		db=client.getDB("sbatch6");
		
		return db;
	}
}
