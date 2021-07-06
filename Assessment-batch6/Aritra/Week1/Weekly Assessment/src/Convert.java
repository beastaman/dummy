import java.util.*;

public class Convert {

	
	public double Currency(String source, String target, double amt) {
		
		Map<String, Map<String, Double>> mp;
		
		mp = new HashMap<>();

		mp.put("america", new HashMap<>());
		mp.put("india", new HashMap<>());
		mp.put("uk", new HashMap<>());
		mp.put("japan", new HashMap<>());

		mp.get("india").put("america", 0.013);
		mp.get("india").put("uk", 0.0097);
		mp.get("india").put("japan", 1.49);
		mp.get("india").put("india", 1.0);

		mp.get("america").put("india", 74.3);
		mp.get("america").put("uk", 0.72);
		mp.get("america").put("japan", 110.9);
		mp.get("america").put("america", 1.0);

		mp.get("uk").put("america", 1.39);
		mp.get("uk").put("india", 103.35);
		mp.get("uk").put("japan", 154.24);
		mp.get("uk").put("uk", 1.0);

		mp.get("japan").put("america", 0.009);
		mp.get("japan").put("uk", 0.0065);
		mp.get("japan").put("india", 0.67);
		mp.get("japan").put("japan", 1.0);
		
		//Map<String,Double> hm = mp.get(source);
		
		//return hm.get(target);
		
		return (double)(mp.get(source).get(target))*amt;
	}
	
}
