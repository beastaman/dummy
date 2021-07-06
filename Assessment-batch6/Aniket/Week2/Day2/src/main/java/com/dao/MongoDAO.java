package com.dao;

import com.mongodb.*;

import java.util.ArrayList;
import java.util.List;

public class MongoDAO {
    public List<DBObject> read(DB database, String file) {
        DBCollection collection = (DBCollection) database.getCollection(file);
        DBObject dbObject = BasicDBObjectBuilder.start().get();
        DBCursor cursor = collection.find(dbObject);
        return new ArrayList<>(cursor.toArray());
    }

    public void insert(String[][] data, DB db, String collectionName) {
        DBCollection collection = (DBCollection) db.getCollection(collectionName);
        BasicDBObjectBuilder objectBuilder = BasicDBObjectBuilder.start();
        for (var d : data)
            objectBuilder.append(d[0], d[1]);
        WriteResult rs = collection.insert(objectBuilder.get());
        System.out.println("Inserted");
    }
}
