package com.mongo.dao;


import java.util.List;

import com.mongodb.DB;
import com.mongodb.DBObject;
import com.mongodb.client.MongoDatabase;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			DB database= MongoConnectivity.getDataBase();
			MongoDAO dao= new MongoDAO();
			List<DBObject> list = dao.read(database, "inventory");
			list.forEach( System.out::println );
			list.forEach((items) -> { System.out.println( items.get("_id") ); });
			
			String [][]data = {
					{"_id","colge300"},{"qty","340"},{"status","D"}
			};
			dao.insert(data, database, "inventory");
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}

}
