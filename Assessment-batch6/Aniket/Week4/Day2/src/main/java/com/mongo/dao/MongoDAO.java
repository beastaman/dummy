package com.mongo.dao;

import java.util.ArrayList;
import java.util.List;

import com.mongodb.BasicDBObjectBuilder;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.WriteResult;

public class MongoDAO {

	// Read
	public List<DBObject> read(DB db, String file) throws Exception {

		DBCollection collections = (DBCollection) db.getCollection(file);

		DBObject dbObject = BasicDBObjectBuilder.start().get();

		DBCursor cursor = collections.find(dbObject);

		return new ArrayList<>(cursor.toArray());

	}

	// Insert
	public void insert(String[][] data, DB db, String collectionName) throws Exception {
		DBCollection collections = (DBCollection) db.getCollection(collectionName);
		BasicDBObjectBuilder basicDBObjectBuilder = BasicDBObjectBuilder.start();
		for (int i = 0; i < data.length; ++i) {
			basicDBObjectBuilder.append(data[i][0], data[i][1]);

		}
		WriteResult writeResult = collections.insert(basicDBObjectBuilder.get());
		System.out.println("Inserted");

	}

}
