package com.sapient.dao.mongo;

import java.util.List;

import com.mongodb.DB;
import com.mongodb.DBObject;

public class Demo {

	public static void main(String[] args) {
		
		try {
			DB db = MongoConectivity.getDB();
			MongoDao mongoDao = new MongoDao();
			
			List<DBObject> dbObjects = mongoDao.read(db, "inventory");
			dbObjects.forEach(System.out::println);
			dbObjects.forEach((item) -> System.out.println(item.get("_id")));
			System.out.println();
			
			String[][] data = { { "_id", "colgate100" }, { "item", "Colgate 100" } , { "qty", "32" } , { "status", "B" } };
			mongoDao.insert(data, db, "inventory");
			dbObjects = mongoDao.read(db, "inventory");
			dbObjects.forEach(System.out::println);
			System.out.println();
		}
		catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
	
}
