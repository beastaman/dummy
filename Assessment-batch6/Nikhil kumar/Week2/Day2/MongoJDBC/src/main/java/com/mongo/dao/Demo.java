package com.mongo.dao;

import com.mongo.MongoConnectivity;
import com.mongodb.DB;
import com.mongodb.DBObject;
import com.mongodb.client.MongoDatabase;

import java.util.List;

public class Demo {
    public static void main(String[] args) {
        try {
            DB db = MongoConnectivity.getDatabase();
            MongoDao mongoDao = new MongoDao();
            String[][] data = {{"_id","colgate"},{"qty", "100"}, {"status", "C"}};
            mongoDao.insert(data,db,"inventory");
            System.out.println("After Insertion");
            List<DBObject> dbData1 = mongoDao.read(db,"inventory");
            dbData1.forEach(System.out::println);
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }

    }
}
