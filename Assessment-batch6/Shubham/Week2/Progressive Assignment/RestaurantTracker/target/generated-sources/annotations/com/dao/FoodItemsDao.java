package com.dao;

import java.util.ArrayList;
import java.util.List;

import com.mongodb.BasicDBObjectBuilder;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.to.FoodItems;

public class FoodItemsDao {
	public static List<FoodItems> getAllFoodItems() throws Exception {

				DB database = Connectivity.getDataBase();
				
				DBCollection collections = (DBCollection)database.getCollection("fooditems");
				DBCursor cursor;
				List<FoodItems> foodItemList = new ArrayList<>();
				cursor = collections.find();
				System.out.println("Should print once");
				while(cursor.hasNext())
				{
					System.out.println("Should print twice");
					DBObject dbObject2=cursor.next();
					foodItemList.add(new FoodItems((String)dbObject2.get("name"), (String)dbObject2.get("price")));
				}
				
				return foodItemList;
			}
}
