package com.mongo.dao;

import java.util.List;

import com.mongodb.DB;
import com.mongodb.DBObject;
import com.mongodb.client.MongoDatabase;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			DB database =MongoConnectivity.getDataBase();
			MongoDAO dao = new MongoDAO();
			
			//list.forEach((items) -> { System.out.println(items.get(" id")); } );
			String[][] data = {{"_id","colgate200"},{"qty","100"},{"status","B"}};
			dao.insert(data, database, "inventory");
			List<DBObject> list = dao.read(database, "inventory");
			list.forEach(System.out::println);
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
