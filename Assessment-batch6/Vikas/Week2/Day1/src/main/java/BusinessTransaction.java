
public class BusinessTransaction {

	public int doPurchaseTransaction(int amount) {
		if(amount < 20000) return 0;
		if(amount >= 20000 && amount <= 100000) return (int)(amount*0.05);
		return (int)(amount*0.2);
	}
}
