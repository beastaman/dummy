package Assignment;



public class Division extends Arithmetic {
	
	public Division(int a , int b) {
		super(a,b);
	}
	@Override	
	public void calculate() {
		this.num3 =this.num1/this.num2;
	}

}
