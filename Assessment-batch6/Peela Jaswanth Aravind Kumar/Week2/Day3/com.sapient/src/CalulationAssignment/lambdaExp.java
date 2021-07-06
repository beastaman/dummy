package CalulationAssignment;

interface method {
	int run(int a,int b);
}

public class lambdaExp {
	
	public static void compute(int a,int b, method m) {
	    int result = m.run(a,b);
	    System.out.println(result);
	}
	
	
	public static void main(String[] args) {
	    method Add = (a,b) -> (a+b);
	    method Sub = (a,b) -> (a-b);
	    method Mul = (a,b) -> (a*b);
	    method Div = (a,b) -> (a/b);
	    
	    compute(1,2,Add);
	    compute(1,2,Sub);
	    compute(1,2,Mul);
	    compute(1,2,Div);
	}
}
