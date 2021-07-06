package p1;

public abstract class Car{
    protected int price;
    protected String name;

    public abstract void topSpeed();
}

class maruti extends Car {

    @Override
    public void topSpeed() {
        System.out.println("This is maruti and Top speed is " + 160);
    }

}

class ferrari extends Car {

    @Override
    public void topSpeed() {
        System.out.println("This is ferrari and Top speed is " + 460);
    }

}

