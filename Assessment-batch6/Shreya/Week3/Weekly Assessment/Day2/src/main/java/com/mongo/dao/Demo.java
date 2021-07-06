package com.mongo.dao;

import java.util.List;

import com.mongodb.DB;
import com.mongodb.DBObject;

public class Demo {

	public static void main(String[] args) {
		try {

			DB db = MongoConnectivity.getDataBase();
			MongoDAO dao = new MongoDAO();

			List<DBObject> list = dao.read(db, "inventory");

			list.forEach(System.out::println);

			list.forEach((items) -> {
				System.out.println(items.get("_id"));
			});

			String[][] data = { { "_id", "colgate100" }, { "quantity", "100" }, { "status", "C" } };
			dao.insert(data, db, "inventory");

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
