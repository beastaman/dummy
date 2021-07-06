package com.mongo.dao;

import com.mongodb.DBObject;
import com.mongodb.client.MongoDatabase;

import java.util.List;

public class Demo {
    public static void main(String[] args) {
        try {
            MongoDatabase database = MongoConnectivity.getDatabase();
            MongoDAO dao = new MongoDAO();
            List<DBObject> list = dao.read(database, "inventory");
            list.forEach(System.out::println);
            list.forEach((items) -> {
                System.out.println(items.get("_id"));
            });
            String[][] data = {{"_id", "colgate100"}, {"qty", "100"}, {"status", "0"}};
            dao.insert(data, database)
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
