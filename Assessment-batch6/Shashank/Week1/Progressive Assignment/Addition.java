package Assignment;



public class Addition extends Arithmetic{
	public Addition(int a , int b) {
		super(a,b);
}
@Override
	public void calculate() {
	
		this.num3 = this.num1+this.num2;
}
}
