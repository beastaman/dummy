package com.sapient.dao.mongo;

import java.util.ArrayList;
import java.util.List;

import com.mongodb.BasicDBObjectBuilder;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.WriteResult;

public class MongoDao {

	public List<DBObject> read(DB db, String file) throws Exception {
		
		DBCollection collections = db.getCollection(file);
		
		DBObject dbObject = BasicDBObjectBuilder.start().get();
		DBCursor cursor = collections.find(dbObject);
		
		List<DBObject> dbObjects = new ArrayList<>(); // cursor.toArray();
		while(cursor.hasNext()) {
			dbObjects.add(cursor.next());
		}
		
		return dbObjects;
	}

	public boolean insert(String[][] data, DB db, String file) throws Exception {
		
		DBCollection collections = db.getCollection(file);
		
		BasicDBObjectBuilder basicDBObjectBuilder = BasicDBObjectBuilder.start();
		
		for(int i=0;i<data.length;i++) {
			basicDBObjectBuilder.add(data[i][0], data[i][1]);
		}
		
		WriteResult rs = collections.insert(basicDBObjectBuilder.get());
		
		return rs.getN() > 0;
	}

}
