package com.mongo.dao;

import java.util.List;

import com.mongodb.DB;
import com.mongodb.DBObject;

public class DemoMongo {

	public static void main(String[] args) {
		
		
		try {
			
			DB db = MongoConnectivity.getDatabase();
			
			MongoDao mongoDao = new MongoDao();
			
			List<DBObject> list = mongoDao.read(db, "inventory");
			
			list.forEach(System.out::println);
			
			
			list.forEach( (items) -> {System.out.println(items.get("_id"));});
			
			
			String[][] data = {{"_id", "colgate100"}, {"qty", "100"}, {"status", "D"}};
			mongoDao.insert(data, db, "inventory");
			
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		
	}

}
