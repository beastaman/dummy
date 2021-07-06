package p1;


interface b1 {
    void f1();
}

interface b2 {
    void f2();
}

interface b3 {
    void f3();
}

public interface Bridge extends b1, b2{

}

class Actual1 implements Bridge {
    @Override
    public void f1() {
        System.out.println("I am in f1");
    }

    @Override
    public void f2() {
        System.out.println("I am in f2");
    }
}
