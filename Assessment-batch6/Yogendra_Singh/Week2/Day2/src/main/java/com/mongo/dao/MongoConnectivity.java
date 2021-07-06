package com.mongo.dao;
import com.mongodb.*;
import com.mongodb.client.MongoDatabase;

public class MongoConnectivity {
	public static DB getDataBase () throws Exception {
		DB db;
		MongoClient client= new MongoClient("localhost",27017);
		db =client.getDB("sbatchsix");
		return db;
	}
}
