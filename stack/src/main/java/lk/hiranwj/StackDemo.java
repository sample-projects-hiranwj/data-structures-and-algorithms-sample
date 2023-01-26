package lk.hiranwj;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<String> stackBooks = new Stack();   /* Create a stack */

        System.out.println(stackBooks.empty());     /* true */
        stackBooks.push("Maths");
        stackBooks.push("Gravity");
        stackBooks.push("HTML");
        stackBooks.push("ECMA Script Specification");

        /* Checking if stack is empty or not */
        System.out.println(stackBooks.empty());     /* false */

        /* To view the stack */
        System.out.println(stackBooks);

        /* To remove last index (LILO) */
        System.out.println(stackBooks.pop());
        System.out.println(stackBooks);

        stackBooks.push("Gang of four");
        System.out.println(stackBooks);

        String topItem = stackBooks.peek();     /* To print last index value */
        System.out.println(topItem);


    }
}
