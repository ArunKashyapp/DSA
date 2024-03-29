package oddEVEN;

import java.util.Arrays;

public class ComeBack {

    public static void main(String[] args) {
      int[] arr =    swapTwoValues(10, 20);
      System.out.println(Arrays.toString(arr));

    }

    // 1 1 2 3 5 8 13

    static String reverseString(String string) {
        return new StringBuilder(string).reverse().toString();

    }

    static int neagativeNumber(int n) {
        return ~n + 1;
    }

    static void fizzBuzz() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(i % 3 == 0 && i % 5 == 0 ? "FizzBuzz" : i % 3 == 0 ? "Fizz" : i % 5 == 0 ? "Buzz" : i);
        }
    }

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

    static int countSetBits(int n) {

        int count = 0;
        while (n > 0) {
            n = n & (n - 1);
            count++;
        }
        return count;
    }

    static int[] swapTwoValues(int a , int b){
        int arr[] = new int[2];
    a= a+b;
    b = a -b;
    a= a-b;
     arr[0] = a;
     arr[1] = b;
     return arr;
    }



    ///merge sort
    
  
}
