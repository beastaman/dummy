package p2;

class InsufficientBalance extends Exception {
    public InsufficientBalance() {
        super("Balance insufficient, your transaction is cancelled"); 
    }
}

class ExceptionExample{
	
	public String func1() {
		int balance = -875; //to check negative exception test case
	    int withdraw = 2090;
	    
	    if(balance < 0) return "Amount should be greater than zero!";
	
	    try {
	        if (withdraw > balance) {
	            throw new InsufficientBalance();
	        }
	        return "Transaction is under process";
	    } catch (InsufficientBalance e) {
	    	return e.getMessage();
	    }
	    finally {
	        return "";
	    }
	}
}

public class Demo4 {
    public static void main(String[] args) {
    	ExceptionExample example = new ExceptionExample();
    	System.out.println(example.func1());
    }
}