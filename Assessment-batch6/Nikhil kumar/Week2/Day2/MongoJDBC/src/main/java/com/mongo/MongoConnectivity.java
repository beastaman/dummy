package com.mongo;

import com.mongodb.DB;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;

public class MongoConnectivity {
    public static DB getDatabase() throws Exception{
        DB db;
        MongoClient mongoClient = new MongoClient("localhost",27017);
        db = mongoClient.getDB("sbatch6");
        return db;
    }
}
