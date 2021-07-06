import java.util.*;

public class Q3{
    private final  static Scanner scan = new Scanner(System.in);
    public static void main(String... args) {
        //source to INR
        Map<String,Double> currencyMap1 = new HashMap<>();
        currencyMap1.put("AMERICA", 74.30);
        currencyMap1.put("UK", 103.27);
        currencyMap1.put("JAPAN", 0.67);
        currencyMap1.put("INDIA", 1.00);

        //INR to Target
        Map<String,Double> currencyMap2 = new HashMap<>();
        currencyMap2.put("AMERICA", 0.013);
        currencyMap2.put("UK", 0.0097);
        currencyMap2.put("JAPAN", 1.49 );
        currencyMap2.put("INDIA", 1.00);

        System.out.println("\nPlease provide current currency and the currency you want it to be converted");
        System.out.println("\nPlease enter two of the choices for currencies");
        System.out.println("\n1. India, 2. UK, 3. Japan, 4. America");
        System.out.println("\nPlease provide source currency type. Example: India");
        String source = scan.nextLine().toUpperCase();
        System.out.println("\nPlease provide target currency type. Example: Uk");
        String target = scan.nextLine().toUpperCase();
        System.out.println("\nPlease provide the value for conversion");
        String val = scan.nextLine();
        double value = Double.parseDouble(val);
        double CurrToInr = value*currencyMap1.get(source);
        System.out.println("\nResult for Conversion"+ source+" --> "+ target+": "+ String.format("%.3f", CurrToInr*currencyMap2.get(target))+"\n\n");
    }
}