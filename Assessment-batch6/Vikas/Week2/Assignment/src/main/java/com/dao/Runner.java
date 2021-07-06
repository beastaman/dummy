package com.dao;

import java.util.List;

import com.to.*;

public class Runner {

	public static void main(String[] args) {
		
		try {
			RestaurantDAO resturantdao = new RestaurantDAO();
			List<Restaurants> l1 = resturantdao.getAllRestaurant();
			l1.forEach(System.out::println);
			
			System.out.println();
			TableDAO tabledao = new TableDAO();
			
			UserDAO userdao = new UserDAO();
			User user = new User("user1","user1@emailcom","user1","user1","46253632");
			userdao.insertStudent(user);
			
			
			
		} catch (Exception e) {
			System.out.println(e);
		}
		

	}

}
