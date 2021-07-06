
public class BusinessTransaction {

	public int doPurchaseTransaction(int amt) {
		if(amt<20000) 
			return 0;
		else if (amt>=20000 && amt<=100000) 
			return (int)(0.05 * amt );
		else 
			return (int)(0.20 * amt );
	}
	
}
