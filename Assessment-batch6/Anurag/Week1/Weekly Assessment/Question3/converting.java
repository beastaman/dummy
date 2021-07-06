package com.sapientweek1;
import java.util.*;
public class converting {
	public void amount(int amount,String source,String target) {
		Map<String,Double>mp=new HashMap<String,Double>();
		mp.put("america",73.0);mp.put("india",1.00);
		mp.put("uk",86.00);mp.put("japan",0.67);
		System.out.println((amount*mp.get(source))/mp.get(target));
	}

}

