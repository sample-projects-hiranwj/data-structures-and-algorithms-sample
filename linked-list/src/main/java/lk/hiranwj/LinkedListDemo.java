package lk.hiranwj;

import java.util.LinkedList;

public class LinkedListDemo {

    public static void main(String[] args){

        LinkedList<String> linkedList1 = new LinkedList();

        // Use as a Stack
        linkedList1.push("A");
        linkedList1.push("Z");
        linkedList1.push("H");
        linkedList1.push("Y");
        linkedList1.push("C");

        System.out.println(linkedList1);

        linkedList1.pop();

        System.out.println(linkedList1);

        // -------------------------------------------------------------------------------------------------------------

        LinkedList<Integer> linkedList2 = new LinkedList();

        // Use as a Queue
        linkedList2.offer(5);
        linkedList2.offer(2);
        linkedList2.offer(10);
        linkedList2.offer(89);
        linkedList2.offer(21);

        System.out.println(linkedList2);

        linkedList2.poll();

        System.out.println(linkedList2);

        // -------------------------------------------------------------------------------------------------------------

        LinkedList<String> linkedList3 = new LinkedList();
        linkedList3.push("Hiran");
        linkedList3.push("Dasun");
        linkedList3.push("Janith");
        linkedList3.push("Kamal");
        linkedList3.push("Nimal");

        System.out.println(linkedList3);

        linkedList3.add(3, "Chamodhi");

        System.out.println(linkedList3);

        linkedList3.addFirst("Amila");

        System.out.println(linkedList3);

        linkedList3.addLast("Suboda");

        System.out.println(linkedList3);

        linkedList3.removeFirst();
        linkedList3.removeLast();

        System.out.println(linkedList3);

    }
    
}
