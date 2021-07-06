package com.mongo.dao;

import java.util.List;

import com.mongodb.BasicDBObjectBuilder;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.WriteResult;
import com.mongodb.client.MongoDatabase;

public class MongoDao {
	
	public List<DBObject> read(DB db, String file){
		
		DBCollection dbCollection = (DBCollection) db.getCollection(file);
		
		DBObject dbObject = BasicDBObjectBuilder.start().get();
		
		DBCursor dbCursor = dbCollection.find(dbObject);
//		DBCursor dbCursor = dbCollection.find();
		
		
		return dbCursor.toArray();
	}
	
	
	public void insert(String[][] data, DB db, String collectionName) {
		
		DBCollection dbCollection = db.getCollection(collectionName);
		
		BasicDBObjectBuilder basicDBObjectBuilder = BasicDBObjectBuilder.start();
		
		for (int i = 0; i<data.length; i++) {
			basicDBObjectBuilder.append(data[i][0], data[i][1]);
		}
		
		WriteResult writeResult = dbCollection.insert(basicDBObjectBuilder.get());
		
		System.out.println("Inserted!!!");
		
	}
	
}
