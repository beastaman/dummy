package p1;

public class demo8 {
    public static void main(String[] args) {
        StructuralAdapter adp = new Actual();
        adp.f1();

        Bridge adp2 = new Actual1();
        adp.f2();
    }
}
