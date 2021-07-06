package Assignment;

public class Arithmetic {
protected int num1 , num2 , num3;
	
	public Arithmetic() {
		System.out.println("Default constructor called");
	}
	public Arithmetic(int a , int b) {
		this(); // calling default constructor
		// according to rule if we are calling  another constructor of same class it hould be first statement inside the cinstructor
		// wont work if any statement is present before that
		num1=(a);
		num2=(b);
		//System.out.println("arguement constructor called");
	}
	
	// destructor
	 protected void finalize(){
		 //System.out.println("Default desstructor called");
		 
	 }
	
	public void setData(int a , int b) {
			num1=(a);
			num2=(b);

	}
	
	// method override
	public void setData(String a, String b) {
		num1= Integer.parseInt(a);
		num2= Integer.parseInt(b);
	}
	public void calculate() {
		// Virtual Function to implement run time ploymorphism
		
	}
	
	public int getData() {
		return num3 ;
	}
	public void display() {
		 System.out.println("Result : "+ num3);
		
	}

}
