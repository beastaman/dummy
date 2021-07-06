package com.mongo.dao;

import com.mongodb.*;
import com.mongodb.client.MongoDatabase;

import java.util.ArrayList;
import java.util.List;

public class MongoDAO {
    public List<DBObject> read(MongoDatabase database, String file) {
        DBCollection collection = (DBCollection) database.getCollection(file);
        DBObject dbObject = BasicDBObjectBuilder.start().get();
        DBCursor cursor = collection.find(dbObject);
        return new ArrayList<>(cursor.toArray());
    }

    public void insert(String[][] data, DB db,String collectionName) {
        DBCollection collection = (DBCollection) db.getCollection(collectionName);
        BasicDBObjectBuilder basicDBObjectBuilder= BasicDBObjectBuilder.start();
        for (int i = 0; i < data.length; ++i) {
            basicDBObjectBuilder.add(data[i][0], data[i][1]);
        }
        WriteResult writeResult = collection.insert(basicDBObjectBuilder.get());
        System.out.println("Inserted!");
    }
}
