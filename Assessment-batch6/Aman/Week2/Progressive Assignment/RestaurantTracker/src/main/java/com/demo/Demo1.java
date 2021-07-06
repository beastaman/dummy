package com.demo;

import com.dao.CustomerDao;
import com.to.Customer;
import com.to.User;

public class Demo1 {
	public static void main(String[] args) throws Exception {
		Customer customer = new CustomerDao().getCustomer(new User("u1@gmail.com","password1"));
		System.out.println(customer);
	}
}
