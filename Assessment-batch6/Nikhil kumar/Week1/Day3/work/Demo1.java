package com.sapient.day3.work;

public class Demo1 {
    public static void main(String[] args) {
        System.out.println("Enter two numbers");
        int n1 = Read.scanner.nextInt();
        int n2 = Read.scanner.nextInt();
        System.out.println("Enter choice");
        int ch = Read.scanner.nextInt();
        //Gang of four design pattern
        AirthmeticOperation obj[] = new AirthmeticOperation[4];
        obj[0] = new Addition(n1,n2);
        obj[1] = new Subtraction(n1,n2);
        obj[2] = new Multiplication(n1,n2);
        obj[3] = new Division(n1,n2);

        for(int i=1;i<=4;i++){
            int choice=i-1;
            obj[choice].calculate();
            obj[choice].display();
        }
//        obj[ch-1].calculate();
//        obj[ch-1].dispaly();

//            AirthmeticOperation obj = AbstractFactory.getAirthmeticFactorySingleton(ch,n1, n2);
//            obj.calculate();
//            obj.dispaly();

//            AirthmeticOperation obj = AbstractFactory.getFactory(1).getAirthmeticFactorySingleton(ch,n1,n2);
//            obj.calculate();
//            obj.display();
    }
}
