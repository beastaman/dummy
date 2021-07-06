package com.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.bson.BSONObject;

import com.mongodb.BasicDBObjectBuilder;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.to.Student;

public class StudentDao {
	public List<Student> getAllStudent() throws Exception {

DB database = Connectivity.getDataBase();
		
		UserDao dao = new UserDao();
		
		DBCollection collections = (DBCollection)database.getCollection("student");
		DBObject dbObject = BasicDBObjectBuilder.start().get();
		DBCursor cursor=collections.find(dbObject);
		
		List<DBObject> list = new ArrayList<> (cursor.toArray());
		List<Student> students = new ArrayList<>();
		cursor = collections.find();
		
		while(cursor.hasNext())
		{
			DBObject dbObject2=cursor.next();
			students.add(new Student((String)dbObject2.get("id"), (String)dbObject2.get("fname"), (String)dbObject2.get("lname"), (String)dbObject2.get("dob"), (String)dbObject2.get("area"), (String)dbObject2.get("phoneNo") ));
		}
		
		return students;
	}
	
	
	public void insertStudent(Student student) throws Exception {
		
		DB database = Connectivity.getDataBase();
		UserDao dao = new UserDao();
		
		DBCollection collections = (DBCollection)database.getCollection("student");
		DBObject dbObject=BasicDBObjectBuilder.start().get();
		dbObject.put("id",student.getId());
		dbObject.put("fname",student.getFname());
		dbObject.put("lname",student.getLname());
		dbObject.put("dob",student.getDob());
		dbObject.put("area",student.getArea());
		dbObject.put("phoneNo",student.getPhoneNo());
		collections.insert(dbObject);
	}
}
