package com.mongo;

import java.util.List;

import com.mongodb.DB;
import com.mongodb.DBObject;

public class Demo{

	public static void main(String[] args) {
		try {
		DB database= MongoConnectivity.getDatabase();
		MongoDAO dao=new MongoDAO();
		
		List<DBObject> list=dao.read(database, "inventory");
		list.forEach(System.out::println);
		
		list.forEach((items)->{System.out.println(items.get("id"));});
		String[][] data= {{"_id","colgate100"},{"qty","100"},{"status","B"}};
		
		//dao.insert(data, database, "inventory");
	}
	catch(Exception e){
		System.out.println(e.getMessage());
		
	}

}	
}
