package com.dao;

import java.util.ArrayList;
import java.util.List;

import com.mongodb.BasicDBObject;
import com.mongodb.BasicDBObjectBuilder;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.to.User;

public class UserDao {
	
	public static User getUser(String username, String password) throws Exception{
		
		DB database = Connectivity.getDataBase();
		
		DBCollection collections = (DBCollection)database.getCollection("user");
		
		BasicDBObject query = new BasicDBObject("username",username);
		DBCursor cursor = collections.find(query);
		
		while(cursor.hasNext())
		{
			DBObject dbObject2=cursor.next();
			if(((String)dbObject2.get("password")).equals(password))
			{
				return new User((String)dbObject2.get("username"), (String)dbObject2.get("password"), (String)dbObject2.get("fname"), (String)dbObject2.get("lname"), (String)dbObject2.get("phoneno"));
			}
		}
		throw new Exception("Username and passowrd deos not match");

	}
	public void insertStudent(User user) throws Exception {
		
		DB database = Connectivity.getDataBase();
		
		DBCollection collections = (DBCollection)database.getCollection("user");
		DBObject dbObject=BasicDBObjectBuilder.start().get();
		dbObject.put("username",user.getUsername());
		dbObject.put("password",user.getPassword());
		dbObject.put("fname",user.getFname());
		dbObject.put("lname",user.getLname());
		dbObject.put("phoneno",user.getPhoneno());
		collections.insert(dbObject);
	}
}
