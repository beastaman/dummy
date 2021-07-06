package mongo.dao;

import java.util.ArrayList;
import java.util.List;

import com.mongodb.BasicDBObjectBuilder;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.WriteResult;
import com.mongodb.client.MongoDatabase;rt java.util.ArrayList;



public class MongoDAO {
	public List<DBObject> read (MongoDatabase database,String file) throws Exception{
		DBCollection collections = (DBCollection) database.getCollection(file);
		DBObject dbObject = BasicDBObjectBuilder.start().get();
		DBCursor cursor = collections.find(dbObject);
		return new ArrayList<>(cursor.toArray());
		
	}
	
	public void insert(String [][] data, DB db, String collectionName) throws Exception{
		DBCollection collections = (DBCollection) db.getCollection(collectionName);
		BasicDBObjectBuilder bob = BasicDBObjectBuilder.start();
		
		for(int i=0;i<data.length;i++) {
			bob.append(data[i][0], data[i][1]);
		}
		WriteResult wr = collections.insert(bob.get());
		System.out.println("inserted");
	}
	
	
}
