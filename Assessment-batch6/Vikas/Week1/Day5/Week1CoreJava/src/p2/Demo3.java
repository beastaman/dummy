package p2;

public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("program begins");
		
		try {
			
			int a = 2;
			int b = 0;
			
			System.out.println(a/b);
			
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		catch (Exception e){
			System.out.println(e.getLocalizedMessage());
		}
		
		System.out.println("program ends");
	}

}
