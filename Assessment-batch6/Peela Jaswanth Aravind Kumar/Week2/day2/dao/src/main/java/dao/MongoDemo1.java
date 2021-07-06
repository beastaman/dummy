package dao;

import java.util.List;

import com.mongodb.DB;
import com.mongodb.DBObject;

import mongo.dao.MongoConnectivity;
import mongo.dao.MongoDAO;

public class MongoDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			DB database = MongoConnectivity.getDataBase();
			MongoDAO dao = new MongoDAO();
			
			List<DBObject> list = dao.read(database, "inventory");
			list.forEach(System.out::println);
			
			list.forEach((items) -> {System.out.println(items.get("_id"));});
			
			String[][] data = {{"_id","colgate"},{"qty","100"},{"status","A"}};
			
			dao.insert(data,database, "inventory");
			

		}
		catch (Exception e){
			System.out.println(e);
		}
	}

}
