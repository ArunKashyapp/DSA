package oddEVEN;

import java.util.Arrays;

class MergeSortAgain {

    public static void main(String[] args) {
        int[] arr = { 4, 3, 2, 1 };
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));

    }

    static void quickSort(int[] arr, int low, int high) {

        // this low and high are basically for the outer termination and to now in which
        // part we are going to apply the sorting
        if (low > high) {
            return;
        }

        int s = low;
        int e = high;
        int pivot = s + (e - s) / 2;
        // basically this s and e are used for swapping and we are checking a violation
        // with that while loop
        while (s <= e) {
            while (arr[s] < arr[pivot]) {
                s++;
            }
            while (arr[e] > arr[pivot]) {
                e--;
            }

            if (s <= e) {
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }

        quickSort(arr, low, e);
        quickSort(arr, s, high);
    }

}