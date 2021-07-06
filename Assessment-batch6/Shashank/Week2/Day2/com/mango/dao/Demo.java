package com.mango.dao;
import java.util.List;

import com.mongodb.*;
import com.mongodb.client.MongoDatabase;

public class Demo {
	
	public static void main(String[] args) {
		try {
			DB database = MongoConnectivity.getDataBase();
		MongoDAO dao = new MongoDAO();
		List<DBObject> list = dao.read(database , "inventory");
		list.forEach(System.out::println);
		
		list.forEach((items) -> { 
			System.out.println(items.get("_id"));
		});
		
		// insert
		//String [][] data  = {{"_id" , "colgate100"} , {"qty" , "100"} ,{"status" , "B"}};
		//dao.insert(data, database, "inventory");
		}
		catch(Exception e) {
			
		}
	}

}
