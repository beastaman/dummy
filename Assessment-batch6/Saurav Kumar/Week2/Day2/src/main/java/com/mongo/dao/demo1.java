package com.mongo.dao;

import java.util.List;

import com.mongodb.DB;
import com.mongodb.DBObject;

public class demo1 {

	public static void main(String[] args) {
		try {
			DB db = MongoConnectivity.getDatabase();
			
			MongoDAO dao = new MongoDAO();
			
			List<DBObject> dbObjects = dao.read(db, "inventory");
			
			for(DBObject obj : dbObjects) {
				System.out.println(obj);
			}
			
			for(int i=0; i<dbObjects.size(); i++) {
				System.out.println(dbObjects.get(i).get("_id"));
			}
			
		
			
			String[][] data = {{"_id", "colgate100"}, {"qty", "100"},
					{"price", "80"}, {"status", "B"}};
			
			
			//dao.insert(data, db, "inventory");
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
}
