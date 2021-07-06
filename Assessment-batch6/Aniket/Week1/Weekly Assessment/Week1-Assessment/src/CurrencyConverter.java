import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CurrencyConverter {

	static class Read {
		public static Scanner scanner = new Scanner(System.in);
	}

	Map<String, Map<String, Double>> currencyData;

	public CurrencyConverter() {

		currencyData = new HashMap<>();

		currencyData.put("america", new HashMap<>());
		currencyData.put("india", new HashMap<>());
		currencyData.put("uk", new HashMap<>());
		currencyData.put("japan", new HashMap<>());

		currencyData.get("india").put("america", 0.013);
		currencyData.get("india").put("uk", 0.0097);
		currencyData.get("india").put("japan", 1.49);
		currencyData.get("india").put("india", 1.0);

		currencyData.get("america").put("india", 74.3);
		currencyData.get("america").put("uk", 0.72);
		currencyData.get("america").put("japan", 110.9);
		currencyData.get("america").put("america", 1.0);

		currencyData.get("uk").put("america", 1.39);
		currencyData.get("uk").put("india", 103.35);
		currencyData.get("uk").put("japan", 154.24);
		currencyData.get("uk").put("uk", 1.0);

		currencyData.get("japan").put("america", 0.009);
		currencyData.get("japan").put("uk", 0.0065);
		currencyData.get("japan").put("india", 0.67);
		currencyData.get("japan").put("japan", 1.0);

	}

	public double convert(String source, String target, double amount) {
		double result;

		result = this.currencyData.get(source.toLowerCase()).get(target.toLowerCase()) * amount;
		return result;

	}

	public static void main(String[] args) {
		CurrencyConverter currencyConverter = new CurrencyConverter();

		System.out.println("Enter source country");

		String sourceCountry = Read.scanner.next();

		System.out.println("Enter target country");

		String targetCountry = Read.scanner.next();

		System.out.println("Enter amount");

		double amount = Read.scanner.nextDouble();

		double convertedAmount = currencyConverter.convert(sourceCountry, targetCountry, amount);

		System.out.println("Converted Amount is " + convertedAmount);

	}
}