package p1;

public interface StructuralAdapter {
    void f1();
    void f2();
    void f3();
}

class adapter1 implements StructuralAdapter {

    @Override
    public void f1() {

    }

    @Override
    public void f2() {

    }

    @Override
    public void f3() {

    }
}

class Actual extends adapter1 {
    @Override
    public void f1() {
        System.out.println("I am in f1");
    }

    @Override
    public void f2() {
        System.out.println("I am in f2");
    }
}
