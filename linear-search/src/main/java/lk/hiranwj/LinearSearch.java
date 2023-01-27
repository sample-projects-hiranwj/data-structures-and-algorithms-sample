package lk.hiranwj;

import java.util.Arrays;

public class LinearSearch {
    /* Execution time is high if the dataset is big */
    /* Good for small dataset */

    public static void main(String[] args) {

        int[] array = {23, 56, 45, 78, 10, 45, 68};
        System.out.println(Arrays.toString(array));

        int index = linearSearch(array, 77);
        if (index != -1) {
            System.out.println("The value found at the index: " + index);
        }else {
            System.out.println("Value not found...!");
        }

    }

    private static int linearSearch(int[] array, int searchValue) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == searchValue) {
                return i;
            }
        }
        return -1;
    }
}
