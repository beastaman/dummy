import java.util.Scanner;

public class ConvertMain {

	public static void main(String[] args) {
		
		Convert con = new Convert();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter source country");
		String source = sc.next();
		System.out.println("Enter target country");
		String target = sc.next();
		System.out.println("Enter amount");
		double amt = sc.nextDouble();
		
	
		System.out.println(con.Currency(source.toLowerCase(), target.toLowerCase(), amt));
		
		
	}

}
