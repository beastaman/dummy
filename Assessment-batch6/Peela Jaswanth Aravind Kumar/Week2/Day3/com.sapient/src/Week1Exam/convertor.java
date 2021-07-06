package Week1Exam;

import java.util.*;

public class convertor {
	String source;
	String target;
	
	
	public Double convert(String source, String target,Double amount) {
		Double result;
		
		//hm map contains the value of the currency in USD
		HashMap<String,Double>hm = new HashMap<String,Double>();
		
		hm.put("America", 1.0 );
		hm.put("UK", 1.39);
		hm.put("India", 0.013);
		hm.put("Japan", 0.009);
		
		// After we get the source amount in Dollars, it is converted to target 
		
		result = (amount * hm.get(source))/hm.get(target);		
		
		return result;
	}
	
	
}
