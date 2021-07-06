

import java.util.HashMap;
import java.util.Map;

public class CurrencyConverter {
	Map<String,Double> map;
	public CurrencyConverter()
	{
		map = new HashMap<>();
		map.put("America" , 1.0);
		map.put("UK", 0.72 );
		map.put("India", 74.30 );
		map.put("Japan", 110.89 );
	}
	public double converter(double amount,String source,String target) {
		double ans= amount/map.get(source);
		ans=ans*map.get(target);
		return ans;
	} 
}
