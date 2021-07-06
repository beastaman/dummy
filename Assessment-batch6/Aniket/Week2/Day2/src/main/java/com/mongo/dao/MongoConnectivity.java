package com.mongo.dao;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;

public class MongoConnectivity {
    public static MongoDatabase getDatabase() {
        MongoDatabase db;
        MongoClient client = new MongoClient("localhost", 27017);
        db = client.getDatabase("sbatch6");
        return db;
    }
}
