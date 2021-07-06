
public class BusinessTransaction {
	public int doPurchaseTransaction(int amt) {
		if(amt<20000) return 0;
		else if(amt>=20000 && amt<=100000) return (int)(amt*0.05);
		else return (int)(amt*0.2);
	}
	/*public static void main(String[] args) {
		// TODO Auto-generated method stub

	}*/

}
