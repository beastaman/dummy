package com.mongo.dao;

import com.mongodb.*;
import com.mongodb.client.MongoDatabase;

import java.util.ArrayList;
import java.util.List;

public class MongoDAO {
//    Read from the MongoDB
    public List<DBObject> read(DB mongoDatabase, String file) throws Exception{

        DBCollection dbCollection = mongoDatabase.getCollection(file);
        DBObject dbObject = BasicDBObjectBuilder.start().get();

        DBCursor dbCursor = dbCollection.find(dbObject);
        List<DBObject> list = new ArrayList<>();

        list.add((DBObject) dbCursor.toArray());
        return list;
    }
//    Insert
    public void insert(String[][] data, DB db, String collectionName) throws Exception{
        DBCollection dbCollection = db.getCollection(collectionName);
        BasicDBObjectBuilder basicDBObjectBuilder = BasicDBObjectBuilder.start();

        for (int i = 0; i < data.length; i++){
            basicDBObjectBuilder.append(data[i][0], data[i][1]);
        }
        WriteResult writeResult = dbCollection.insert(basicDBObjectBuilder.get());
        System.out.println("Inserted !!");
    }
}




















