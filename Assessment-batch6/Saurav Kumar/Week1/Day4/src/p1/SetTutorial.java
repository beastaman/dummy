package p1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetTutorial {
    public static void main(String[] args) {

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

        Set<Integer> tSet = new TreeSet<>();
        tSet.add(18);
        tSet.add(973);
        tSet.add(72);
        tSet.add(18);
        tSet.add(96);

        System.out.println("----------");

        System.out.println(tSet);

        System.out.println("----------");

        Iterator<Integer> it = tSet.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        tSet.remove(18);
        System.out.println(tSet);

        if(tSet.contains(72)) {
            System.out.println("element is present");
        } else {
            System.out.println("element is not present");
        }
    }
}
