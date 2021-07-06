package com.mongo.DAO;

import com.mongodb.*;
public class MongoConnectivity {

	public static DB getDataBase() throws Exception{
		DB db;
		MongoClient client=new MongoClient("localhost",27017);
		
		db=client.getDB("sbatch6");
		return db;
	}
}
