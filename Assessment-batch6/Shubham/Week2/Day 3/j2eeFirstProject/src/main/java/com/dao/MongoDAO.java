package com.dao;

import java.util.ArrayList;
import java.util.List;

import com.mongodb.BasicDBObject;
import com.mongodb.BasicDBObjectBuilder;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.WriteResult;
import com.to.User;

public class MongoDAO {
	public void getUser(User user) throws Exception{
		
		DB database = Connectivity.getDataBase();
		
		MongoDAO dao = new MongoDAO();
		
		DBCollection collections = (DBCollection)database.getCollection("user");
		DBObject dbObject = BasicDBObjectBuilder.start().get();
		DBCursor cursor=collections.find(dbObject);
		
		List<DBObject> list = new ArrayList<> (cursor.toArray());
		BasicDBObject query = new BasicDBObject("userid",user.getUsername());
		
		cursor = collections.find(query);
		
		while(cursor.hasNext())
		{
			DBObject dbObject2=cursor.next();
			user.setStatus((String)(dbObject2.get("status")));
			return;
		}
		throw new Exception("Username and passowrd deos not match");

	}
	
}
