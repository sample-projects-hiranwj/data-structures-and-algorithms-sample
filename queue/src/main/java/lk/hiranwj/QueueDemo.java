package lk.hiranwj;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

    public static void main(String[] args) {

        Queue<String> queueObj = new LinkedList<>();
        System.out.println(queueObj.isEmpty());     /* true */

        queueObj.offer("Hiran");
        queueObj.offer("Lahiru");
        queueObj.offer("Janith");
        queueObj.offer("Pasindu");
        queueObj.offer("Pavithra");

        System.out.println(queueObj);

        System.out.println(queueObj.isEmpty());     /* false */

        System.out.println(queueObj.size());        /* 5 */

        System.out.println(queueObj.contains("Kamal"));        /* false */
        System.out.println(queueObj.contains("Pasindu"));        /* false */

        System.out.println(queueObj.peek());    /* Hiran */

        System.out.println(queueObj);
        queueObj.poll();
        System.out.println(queueObj);
    }
}
