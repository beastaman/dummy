

import java.util.*;

public class Currency {

	static class Read {
		public static Scanner scanner = new Scanner(System.in);
	}

	Map<String, Map<String, Double>> currencyConverter;

	public Currency() {

		currencyConverter = new HashMap<>();

		currencyConverter.put("America", new HashMap<>());
		currencyConverter.put("India", new HashMap<>());
		currencyConverter.put("UK", new HashMap<>());
		currencyConverter.put("Japan", new HashMap<>());

		currencyConverter.get("America").put("India", 74.26);
		currencyConverter.get("America").put("UK", 0.72);
		currencyConverter.get("America").put("Japan", 110.9);
		currencyConverter.get("America").put("America", 1.0);

		currencyConverter.get("India").put("America", 0.013);
		currencyConverter.get("India").put("UK", 0.0097);
		currencyConverter.get("India").put("Japan", 1.49);
		currencyConverter.get("India").put("India", 1.0);

		currencyConverter.get("UK").put("America", 1.39);
		currencyConverter.get("UK").put("India", 103.15);
		currencyConverter.get("UK").put("Japan", 154.06);
		currencyConverter.get("UK").put("UK", 1.0);

		currencyConverter.get("Japan").put("America", 0.009);
		currencyConverter.get("Japan").put("UK", 0.0065);
		currencyConverter.get("Japan").put("India", 0.67);
		currencyConverter.get("Japan").put("Japan", 1.0);

	}

	public static void main(String[] args) {
		Currency currency = new Currency();

		System.out.println("Enter source country\n");

		String sourceCountry = Read.scanner.next();

		System.out.println("Enter target country\n");

		String targetCountry = Read.scanner.next();

		System.out.println("Enter amount to be converted\n");

		double source = Read.scanner.nextDouble();

		double convertedAmount = currency.currencyConverter.get(sourceCountry).get(targetCountry) * source;

		System.out.println(source + " " + sourceCountry + " is equivalent to " + convertedAmount + " " + targetCountry);

	}
}
