package w2d1;

public class BusinessTransaction {
	
	public  int doPurchaseTransaction(int amount) {
		if(amount<20000)return 0;
		if(amount<100000)return  (int) ((int)amount *0.05);
		else return  (int) ((int)amount *0.2);	
		
		
	}
	
}