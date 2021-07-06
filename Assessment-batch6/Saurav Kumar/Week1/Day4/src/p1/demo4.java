package p1;

public class demo4 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("hello");
        StringBuilder sb1 = sb;

        System.out.println(sb);
        System.out.println(sb1);

        sb.append("world");

        System.out.println(sb);
        System.out.println(sb1);
    }

}
