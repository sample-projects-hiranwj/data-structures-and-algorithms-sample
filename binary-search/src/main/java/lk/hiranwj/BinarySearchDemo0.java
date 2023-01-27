package lk.hiranwj;

import java.util.Arrays;

public class BinarySearchDemo0 {

    public static void main(String[] args) {
        int[] arr = new int[1000];

        int target = 10;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }

        int index = Arrays.binarySearch(arr, target);

        if (index == -1) {
            System.out.println("Value not found...!");
        }else {
            System.out.println("Value found at the index of: " + index);
        }
    }
}
