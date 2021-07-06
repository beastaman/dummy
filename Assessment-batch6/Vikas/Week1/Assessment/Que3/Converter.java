import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Converter {

	static class Read {
		public static Scanner scanner = new Scanner(System.in);
	}

	Map<String, Map<String, Double>> map;

	public Converter() {

		map = new HashMap<>();

		map.put("America", new HashMap<>());
		map.put("India", new HashMap<>());
		map.put("UK", new HashMap<>());
		map.put("Japan", new HashMap<>());

		map.get("India").put("America", 0.013);
		map.get("India").put("UK", 0.0097);
		map.get("India").put("Japan", 1.49);
		map.get("India").put("India", 1.0);

		map.get("America").put("India", 74.3);
		map.get("America").put("UK", 0.72);
		map.get("America").put("Japan", 110.9);
		map.get("America").put("America", 1.0);

		map.get("UK").put("America", 1.39);
		map.get("UK").put("India", 103.35);
		map.get("UK").put("Japan", 154.24);
		currencyData.get("UK").put("UK", 1.0);

		map.get("Japan").put("America", 0.009);
		map.get("Japan").put("UK", 0.0065);
		map.get("Japan").put("India", 0.67);
		map.get("Japan").put("Japan", 1.0);

	}

	public double convert(String source, String target, double amount) {
		double result;

		result = this.map.get(source.toLowerCase()).get(target.toLowerCase()) * amount;
		return result;

	}

	public static void main(String[] args) {
		Converter converter = new Converter();

		System.out.println("Enter source country");

		String sourceCountry = Read.scanner.next();

		System.out.println("Enter Destination country");

		String destinationCountry = Read.scanner.next();

		System.out.println("Enter amount");

		double amount = Read.scanner.nextDouble();

		double convertedAmount = Converter.convert(sourceCountry, destinationCountry, amount);

		System.out.println("Converted Amount is " + convertedAmount);

	}
}