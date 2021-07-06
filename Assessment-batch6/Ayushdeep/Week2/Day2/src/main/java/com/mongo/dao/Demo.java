package com.mongo.dao;

import com.mongodb.DB;
import com.mongodb.DBObject;
import com.mongodb.client.MongoDatabase;

import java.util.List;

public class Demo {
    public static void main(String[] args) {
        try{
            DB mongoDatabase = MongoConnectivity.getDatabase();
            MongoDAO mongoDAO = new MongoDAO();
            List<DBObject> list = mongoDAO.read(mongoDatabase, "inventory");
            list.forEach(System.out::println);

            String[][] data = {{"_id", "colgate100"}, {"qty", ""}, {"status", "B"}};
            mongoDAO.insert(data, mongoDatabase, "inventory");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}




















