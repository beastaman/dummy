package com.mongo.dao;
import com.mongodb.*;
import com.mongodb.client.MongoDatabase;
public class MongoConnectivity {
	public static DB getDataBase() throws Exception {
		DB db;
		MongoClient client =new MongoClient("localhost",27017);
		db = client.getDB("sbatch6");
		return db;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
