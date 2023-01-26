package lk.hiranwj;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {

    public static void main(String[] args) {

//        Queue<Double> pQueue = new PriorityQueue<>();
        Queue<Double> pQueue = new PriorityQueue<>(Collections.<Double>reverseOrder());
        System.out.println(pQueue.isEmpty());       /* true */

        // Average of marks of students in a class
        pQueue.offer(60.3);
        pQueue.offer(50.3);
        pQueue.offer(36.6);
        pQueue.offer(70.6);
        pQueue.offer(90.3);
        pQueue.offer(10.5);

        System.out.println(pQueue.isEmpty());       /* false */

        System.out.println(pQueue);

        while (!pQueue.isEmpty()) {
            System.out.println(pQueue.poll());
        }

        System.out.println(pQueue);

    }
}
