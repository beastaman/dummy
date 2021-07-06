package p1;

public class CarFactory {
    static Car a = null, b = null;

    // Prototype design pattern
    public static Car getNewCar(int choice) {
        if(choice == 1) {
            return new maruti();
        } else if(choice == 2){
            return new ferrari();
        } else {
            return null;
        }
    }

    // Singleton design pattern
    public static Car getNewCarSingleton(int choice) {

        if(choice == 1) {
            if(a == null) {
                a = new maruti();
            }

            return a;
        } else if(choice == 2) {
            if(b == null) {
                b = new ferrari();
            }

            return b;
        } else {
            return null;
        }

    }
}
