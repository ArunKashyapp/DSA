package oddEVEN;

import java.util.Arrays;

public class ComeBack {

    public static void main(String[] args) {
        int arr[] = { 234, 234234232, 342343435, 654634, 1, 2, 3, 454, 5653, };
         bubblSortUsingRecurssion(arr,arr.length-1,0);
        System.out.println(Arrays.toString(arr));

    }

    // 1 1 2 3 5 8 13

    static int fibo(int n) {
        if (n < 2) {
            return n;
        }

        return fibo(n - 1) + fibo(n - 2);
    }

    // 3! = 3 x 2!
    // 2! = 2 x 1!

    static int factorial(int n) {
        if (n < 2) {
            return 1;
        }

        return n * factorial(n - 1);

    }

    static int binarySearch(int[] arr, int l, int h, int target) {

        int mid = l + (h - l) / 2;

        if (arr[mid] == target) {
            return mid;
        }

        else if (arr[mid] < target) {
            return binarySearch(arr, mid + 1, h, target);
        } else {
            return binarySearch(arr, l, mid - 1, target);
        }
    }

    // bubble sort

    // 7,6,5,4,3,2,1

    static int[] bubbleSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }

        return arr;
    }

   static void bubblSortUsingRecurssion(int[] arr, int r, int c) {
        if (r == 0) {
            return;
        }
        if (c < r) {
            if (arr[c] > arr[c + 1]) {
                int temp = arr[c];
                arr[c] = arr[c + 1];
                arr[c + 1] = temp;
            }
            bubblSortUsingRecurssion(arr, r, c + 1);
        } else {
            bubblSortUsingRecurssion(arr, r - 1, 0);
        }
    }

}
