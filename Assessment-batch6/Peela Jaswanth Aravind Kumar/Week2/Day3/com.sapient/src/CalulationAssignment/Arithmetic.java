package CalulationAssignment;

public abstract class Arithmetic {
	public int num1,num2,num3;

	public void setData(int num1,int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public void display() {
		System.out.println("num1: "+num1 + ", num2: " + num2 + ", num3: " + num3);
	}
	public abstract void calculate();
}