package com.sapient.internationalisation;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.logging.Logger;


public class Demo {

	private static final Logger logger = Logger.getLogger("Demo");
	
	public static void main(String[] args) {
		
		Locale l = Locale.getDefault();
		
		logger.info("");
		logger.info(l.toString());
		logger.info(getValue("userIdLabel"));
		
		Locale.setDefault(Locale.JAPAN);
		
		l = Locale.getDefault();

		logger.info(l.toString());
		logger.info(getValue("userIdLabel"));
	}

	public static String getValue(String key) {
		
		ResourceBundle rs = ResourceBundle.getBundle("local");
		return rs.getString(key);
	}
	
}
