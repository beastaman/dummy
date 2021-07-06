package com.mongo.dao;

import com.mongodb.*;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.util.List;

public class MongoDao {

    //Read
    public List<DBObject> read(DB db, String file) throws Exception{
        DBCollection collection = (DBCollection) db.getCollection(file);
        DBObject dbObject = BasicDBObjectBuilder.start().get();
        DBCursor cursor = collection.find(dbObject);
        return cursor.toArray().stream().toList();
    }

    public void insert(String[][] data, DB db, String collectionName){
        DBCollection collection = (DBCollection) db.getCollection(collectionName);
//        DBObject dbObject = BasicDBObjectBuilder.start().get();
        BasicDBObjectBuilder objBuilder = BasicDBObjectBuilder.start();
        for (String[] d : data) {
            objBuilder.append(d[0],d[1]);
        }
        WriteResult rs = collection.insert(objBuilder.get());
        System.out.println("Inserted");
    }
}
