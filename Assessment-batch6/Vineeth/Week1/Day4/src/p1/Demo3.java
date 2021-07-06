package p1;

public class Demo3 {

	public static void main(String[] args) {
		
		String s1 = "blr";
		String s2 = "blr";

		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		if (s1 == s2)
			System.out.println("Yes");
		else
			System.out.println("No");

		s2 += "-wfh";
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		if (s1 == s2)
			System.out.println("Yes");
		else
			System.out.println("No");

		s1 += "-wfh";
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		if (s1 == s2)
			System.out.println("Yes");
		else
			System.out.println("No");
		
		StringBuilder sb = new StringBuilder("blr-wfh");
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(sb.hashCode());
	}

}
