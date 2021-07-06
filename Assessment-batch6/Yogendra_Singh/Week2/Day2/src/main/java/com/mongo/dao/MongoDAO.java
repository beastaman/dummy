package com.mongo.dao;

import java.util.ArrayList;
import java.util.List;

import com.mongodb.BasicDBObjectBuilder;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.WriteResult;
import com.mongodb.client.MongoDatabase;

public class MongoDAO {
	public List<DBObject> read(DB database,String file) throws Exception{
		DBCollection collections = (DBCollection) database.getCollection(file);
		DBObject dbObject = BasicDBObjectBuilder.start().get();
		DBCursor cursor = collections.find(dbObject);
		List<DBObject> dbObjects = new ArrayList<>();
		return new ArrayList<>(cursor.toArray());
	}
	public void insert(String [][]data, DB db,String collectionName) throws Exception{
		DBCollection collections = (DBCollection) db.getCollection(collectionName);
		BasicDBObjectBuilder basicDBObjectBuilder = BasicDBObjectBuilder.start();
		for(int i=0;i<data.length;++i)
		{
			basicDBObjectBuilder.append(data[i][0],data[i][1]);
		}
		WriteResult writeResult = collections.insert(basicDBObjectBuilder.get());
		System.out.println("Inserted");
	}
}
