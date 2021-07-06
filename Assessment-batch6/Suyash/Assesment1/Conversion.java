package Test;

import java.util.HashMap;
import java.util.Map;

public class Conversion {


	public static Double Convert(String source, String target, double amount) {
		// TODO Auto-generated method stub
		Map<String,Double> map=new HashMap<>();
		map.put("INDIA", 1.00);
		map.put("USA", 0.013);//1 rupee=0.013 usd
		map.put("UK", 0.0097);//1 rupee=0.097 british pounds
		map.put("JAPAN", 1.49);//1 rupee=1.49 yen
		Double d1=map.get(source);
		Double d2=map.get(target);
		return amount*d2/d1;
	}
}
