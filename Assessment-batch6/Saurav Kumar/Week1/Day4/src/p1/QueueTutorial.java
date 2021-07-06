package p1;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTutorial {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        for(int i=1; i<10; i++) {
            q.add(i*10);
        }

        System.out.println(q);
        System.out.println("Front of the q is : " + q.peek());
        q.remove();
        System.out.println(q);
        System.out.println("Front of the q is : " + q.peek());

        System.out.println("----------");

        Queue<Integer> pq = new PriorityQueue<>();
        for(int i=10; i>0; i--) {
            pq.add(i*10);
        }

        System.out.println(pq);

        System.out.println(pq.peek());
        System.out.println(pq.element());

        System.out.println(pq);

        System.out.println("Removing one element");
        System.out.println(pq.remove());
        System.out.println(pq);

        System.out.println("Removing one element");
        System.out.println(pq.poll());
        System.out.println(pq);

        System.out.println("Order of elements inside pq : ");

        while(!pq.isEmpty()) {
            System.out.print(pq.poll() + " , ");
        }



    }
}
