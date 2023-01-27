package lk.hiranwj;

public class BinarySearchDemo1 {

    public static void main(String[] args) {
        int[] arr = new int[100000];

        int target = 49000;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }

//        int index = Arrays.binarySearch(arr, target);
        int index = binarySearch(arr, target);

        if (index == -1) {
            System.out.println("Value not found...!");
        }else {
            System.out.println("Value found at the index of: " + index);
        }
    }

    private static int binarySearch(int[] arr, int target) {
            int min = 0;
            int max = arr.length - 1;

            while (min <= max) {
                int middle = min + (max - min) / 2;
                int value = arr[middle];
                System.out.println("Middle value is: " + value);

                if (value < target) min = middle + 1;
                else if (value > target) max = middle - 1;
                else return middle;
            }
        return -1;
    }
}
