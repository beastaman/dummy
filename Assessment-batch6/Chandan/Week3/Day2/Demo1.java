package com.example;

import java.util.Locale;
import java.util.ResourceBundle;

import lombok.extern.slf4j.Slf4j;


@Slf4j(Demo1.class)
public class Demo1 {

//	public static Logger logger = LoggerFactory.getLogger(Demo1.class); 
	
	
	public static void main(String[] args) {
		
		log.info("testing the logging");
		
		Locale l1 = Locale.getDefault();
		
		System.out.println(l1);
		
		System.out.println(getBundle("userId"));
		
		
		Locale.setDefault(Locale.JAPAN);
		
		l1 = Locale.getDefault();
		
		System.out.println(l1);
		
		System.out.println(getBundle("userId"));
		
		
	}
	
	public static String getBundle(String key) {
		
		
		ResourceBundle rs = ResourceBundle.getBundle("login");
		
		return rs.getString(key);
		
	}
	
}
