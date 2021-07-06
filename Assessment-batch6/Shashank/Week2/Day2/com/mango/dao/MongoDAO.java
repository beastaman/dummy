package com.mango.dao;
import com.mango.dao.*;
import com.mongodb.*;
import java.util.*;
import com.mongodb.client.MongoDatabase;
public class MongoDAO {
	public List<DBObject> read(DB database , String file) throws Exception{
		
		DBCollection collections = (DBCollection)database.getCollection(file);
		
		DBObject dbobject = BasicDBObjectBuilder.start().get();
		
		DBCursor cursor = collections.find();
		
		
		return new ArrayList<>(cursor.toArray());

		
	}
	
	public void insert(String [][] data , DB db , String collectionName) throws Exception{
		DBCollection collections= (DBCollection) db.getCollection(collectionName);
		BasicDBObjectBuilder basicDBObjectBuilder = BasicDBObjectBuilder.start();
		
		for(int i=0;i<data.length;i++) {
			basicDBObjectBuilder.append(data[i][0], data[i][1]);
		}
		WriteResult wrietResult =collections.insert(basicDBObjectBuilder.get());
		
		
		
	}

}
