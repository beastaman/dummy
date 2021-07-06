package com.mongo.dao;
import com.mongodb.*;
import com.mongodb.client.MongoDatabase;

public class MongoConnectivity {
    // way to connect to mongodb
    public static DB getDatabase() throws Exception{
        DB db;
        MongoClient mongoClient = new MongoClient("localhost", 27017);
        db = mongoClient.getDB("sbatch6");

        return db;
    }

}





















