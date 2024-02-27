package oddEVEN;
import java.util.Arrays;

public class revision {

    public static void main(String[] args) {

        int[] arr = { 10, 1,4, 5, 6, 7, 8, 9, 2, 3,  };

        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    static boolean linearSearch(int[] arr, int target) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return true;
            }
        }
        return false;
    }

    static boolean binarySearch(int[] arr, int target) {

        int l = 0;
        int h = arr.length;

        while (l < h) {
            int mid = l + (h - l) / 2;

            if (arr[mid] == target) {
                return true;
            }

            else if (arr[mid] < target) {
                l = mid + 1;
            } else {
                h = mid - 1;
            }
        }
        return false;
    }

    static void bubbleSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

    }

     
    


}
