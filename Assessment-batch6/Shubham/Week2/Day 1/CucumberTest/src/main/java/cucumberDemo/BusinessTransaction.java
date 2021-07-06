package cucumberDemo;

public class BusinessTransaction {

	public int doPurchaseTransaction(int amount) {
		if(amount < 20000) return 0;
		else if(amount<100000) return (int)(amount*0.05);
		else return (int)(amount*0.2);
	}
}
