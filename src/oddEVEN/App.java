package oddEVEN;

import java.util.Arrays;
import java.util.Date;

public class App {
    public static void main(String[] args) {

        Recursion r = new Recursion();
        int[] arr = { 1, 2, 3, 4, 55, 69, 73, 800 };
        int ans = r.binarySearchUsingRecursion(arr, 800, 0, arr.length - 1);
        System.out.print(ans);

        // Date currentDate = new Date();
        // System.out.printf("Current Date: %tF", currentDate);

        // PrettyPrinting pp = new PrettyPrinting();
        // pp.useOfPlacaeholder();

        // CaesarCipher cs = new CaesarCipher();
        // int [] arr = cs.oneSum();
        // System.out.println(Arrays.toString(arr));
        // int[] sortThis = { 6, 54, 31, 2, 4, 1 };
        // Arrays.sort(sortThis);
        // // int[] arr = { 1,2,3};
        // Sorting ss = new Sorting();
        // System.out.println(Arrays.toString(ss.selectionSort(sortThis)));

        // System.out.println(Arrays.toString(ss.selectionSort(sortThis)));

        // Sorting sorting = new Sorting();
        // int[] arr= sorting.bubbleSort(sortThis);
        // System.out.println(Arrays.toString(arr));

        // // int[] newArr = Arrays.copyOf(arr, 2);
        // // System.out.println(Arrays.toString(newArr));
        // Solution solution = new Solution();
        // int[] n = solution.rotate(arr, 4);
        // int[][] secondArray = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        // int[][] ans = solution.transpose(secondArray);

        // AboutArray aboutArray = new AboutArray();
        // boolean ans = aboutArray.isPdallindrome("NAMAn");
        // System.out.println(ans);
        // int[][] matrix = aboutArray.flipAndInvertImage(secondArray);

        // for (int i = 0; i < n.length; i++) {
        // System.out.println(n[i]);
        // }

    }
}
