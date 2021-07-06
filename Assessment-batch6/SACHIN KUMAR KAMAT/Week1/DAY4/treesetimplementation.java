package com.sapient;

import java.util.Collections;
import java.util.Iterator;

public class Collection2 {

    public static void main(String[] args) {

        List<integer> list = new LinkedList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(5);

        System.out.println(list);

        Collections.sort(list);
        System.out.println("Sorted : " + list);

        // Collections.shuffle(list);
        // System.out.println("Shuffled : " + list);

        System.out.println(Collections.binarySearch(list, 20));

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("------------------------------------------");

        for (Integer val : list) {

            System.out.println(val);
        }
        System.out.println("------------------------------------------");

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        list.add(0, 200);
        System.out.println(list);

        list.remove(1);
        System.out.println(list);

        // list.remove(new Integer(30));
        // list.remove(Integer.Valueo(30));

        // list.size(list.size()-1,new Integer(30));

        System.out.println(list);

    }

}
