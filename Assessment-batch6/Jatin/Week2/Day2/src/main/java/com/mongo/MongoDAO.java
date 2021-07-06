package com.mongo;

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
	public List<DBObject> read(DB database, String file) throws Exception {
		DBCollection collection = database.getCollection(file);

		DBObject dbobject = BasicDBObjectBuilder.start().get();

		DBCursor cursor = collection.find(dbobject);
		return new ArrayList<>(cursor.toArray());
	}

	public void insert(String[][] data, DB db, String collectionName) throws Exception {
		DBCollection collection = db.getCollection(collectionName);

		BasicDBObjectBuilder object = BasicDBObjectBuilder.start();

		for (int i = 0; i < data.length; i++) {
			object.append(data[i][0], data[i][1]);
		}

		WriteResult writeresult = collection.insert(object.get());
		System.out.println("Inserted");
	}
}
