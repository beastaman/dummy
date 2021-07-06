import java.util.HashMap;
import java.util.Scanner;

public class CurrencyConversion {
	private HashMap<String, Double> map = new HashMap<String, Double>();
	
	public CurrencyConversion()
	{
		map = new HashMap<String, Double>();
		map.put("AMERICA", 1.0);
		map.put("INDIA",74.30);
		map.put("JAPAN",110.97);
		map.put("UK",0.72);
	}
	
	public double convert(double amount, String source, String target)
	{
		double res=amount*map.get(target)/map.get(source);
		return res;
	}
	
	public static void main(String[] args) {
		
		CurrencyConversion c=new CurrencyConversion();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Amount:");
		double amount=sc.nextDouble();
		System.out.println("Enter Source Currency(AMERICA/INDIA/JAPAN/UK):");
		String source=sc.next();
		System.out.println("Enter Destination Currency(AMERICA/INDIA/JAPAN/UK):");
		String destination=sc.next();
		
		double res=c.convert(amount,source,destination);
		System.out.println("Final amount= "+ res);
		
	}
}