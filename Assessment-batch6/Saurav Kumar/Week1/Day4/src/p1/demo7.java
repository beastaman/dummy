package p1;

import java.util.Scanner;

public class demo7 {
    public static void main(String[] args) {
        System.out.println("Enter your choice ");
        Scanner sc = new Scanner(System.in);

        int choice = sc.nextInt();
        Car car = CarFactory.getNewCar(choice);


        car.topSpeed();
    }
}
