package oddEVEN;

import java.util.Arrays;

public class Striever {
    public static void main(String[] args) {

        // find the larges number in the array;
       

        int a = 10;
        int b = 6;
        System.out.println(a >> 1);

    }

    static int getDouble(int number) {
        return number >> 1;
    }

    static int[] getSecondLS(int[] arr) {

        if (arr.length == 1) {
            return new int[-1];
        }
        Arrays.sort(arr);

        int smallest = arr[0];
        int largest = arr[arr.length - 1];
        int[] ans = new int[2];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != smallest) {
                ans[0] = arr[i];
                break;
            }

        }
        for (int i = arr.length - 2; i > 0; i--) {
            if (arr[i] != largest) {
                ans[1] = arr[i];
                break;
            }

        }

        return ans;
    }

    static int bfGetLargest(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    static int getLargest(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length - 1];
    }

}
