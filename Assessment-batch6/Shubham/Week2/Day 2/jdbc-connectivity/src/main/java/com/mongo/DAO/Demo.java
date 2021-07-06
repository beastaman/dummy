package com.mongo.DAO;


import java.util.List;

import com.mongodb.DB;
import com.mongodb.DBObject;

public class Demo {
	public static void main(String[] args) {
		
		try {
			DB database = MongoConnectivity.getDataBase();
			
			MongoDAO dao = new MongoDAO();
			
			List<DBObject> list = dao.read(database, "inventory");
			
			list.forEach(System.out::println);
			list.forEach((items)->{System.out.println(items.get("_id"));});
			
			String[][] data = {{"_id","colgate100"},{"qty","100"},{"status","A"}};
			dao.insert(data, database, "inventory");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
}
