package p1;

public class demo5 {
    public static void main(String[] args) {
        String s1 = "John";
        String s2 = new String("John");
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        StringBuilder s3 = new StringBuilder("John");
        System.out.println(s3.hashCode());
    }
}
