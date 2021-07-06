package mongo.dao;

import java.util.List;

import com.mongodb.DB;
import com.mongodb.DBObject;
import com.mongodb.client.MongoDatabase;

public class Demo1 {

	public static void main(String[] args) {
			
		try {
			
			DB database = MongoConnectivity.getDataBase();
			
			MongoDAO dao = new MongoDAO();
			
			List<DBObject> list = dao.read(database, "inventory");
			
			for(DBObject i : list) {
				System.out.println(i);
			}
			
			
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
	}

}
