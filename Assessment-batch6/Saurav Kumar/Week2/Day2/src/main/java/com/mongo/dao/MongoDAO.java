package com.mongo.dao;

import java.util.List;

import com.mongodb.BasicDBObjectBuilder;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.WriteResult;

public class MongoDAO {
	
	public List<DBObject> read(DB db, String file) throws Exception {
		
		DBCollection collection = (DBCollection) db.getCollection(file);
		//DBObject dbObject = BasicDBObjectBuilder.start().get();
		
		DBCursor cursor = collection.find();
		
		return cursor.toArray().stream().toList();
	}
	
	public void insert(String [][] data, DB db, String collectionName) throws Exception {
		DBCollection collection = (DBCollection) db.getCollection(collectionName);
		
		BasicDBObjectBuilder bob = BasicDBObjectBuilder.start();
		
		for(int i=0; i<data.length; i++) {
			bob.append(data[i][0], data[i][1]);
		}
		
		WriteResult rs = collection.insert(bob.get());
		
		System.out.println("Inserted");
	}
}
