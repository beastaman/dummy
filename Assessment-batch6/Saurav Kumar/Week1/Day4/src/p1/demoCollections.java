package p1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

interface Employee {
    public int calIncomeTax();
}

class Union implements Employee {

    @Override
    public int calIncomeTax() {
        return 10;
    }
}

public class demoCollections {
    public static void main(String[] args) {
        // collections is a framework in java, which is made up of
        // interfaces, classes and algorithms.
        // In java frameworks, we have 2 main interfaces
        // 1. Collection :
        // Subinterfaces
        // List : (supports duplicate and are ordered)
        // Set : (no duplicate values)
        // queue : (supports fifo)
        // Dequeue : (Both fifo and lifo)
        // 2. Map

        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(20);
        set.add(5);
        set.add(60);

        Iterator<Integer> i = set.iterator();
        while (i.hasNext())
            System.out.println(i.next());

        System.out.println("----------");

        set.remove(10);
        System.out.println(set);

        System.out.println("----------");

        for(Integer num : set) {
            System.out.println(num);
        }

    }
}
