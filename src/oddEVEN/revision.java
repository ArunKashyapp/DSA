package oddEVEN;

public class revision {

    public static void main(String[] args) {
        pattern(5);
    }

    static void pattern2(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < n * 2 - 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern(int n) {

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

    // 5, 4, 3, 2, 1

    // first select the max element and place at their respective position

    static void cyclicSort(int[] arr) {

        int i = 0;
        int h = arr.length;

        while (i < h) {
            if (arr[i] == i + 1) {
                i++;
            } else {

                arr[i] = i + 1;
            }
        }

    }

    static void selectionSort(int[] arr) {
        for (int i = 0, j = 0; i < arr.length; i++) {
            int maxIndex = getMax(arr, j, arr.length - 1 - i);
            swap(arr, maxIndex, arr.length - 1 - i);
        }
    }

    static int getMax(int arr[], int l, int h) {
        int maxIndex = 0;
        int max = Integer.MIN_VALUE;
        while (l < h) {
            if (arr[l] > max) {
                max = arr[l];
                maxIndex = l;
            }
            l++;
        }
        return maxIndex;
    }

    static void swap(int[] arr, int firstIndex, int lastIndex) {
        int temp = arr[firstIndex];
        arr[firstIndex] = arr[lastIndex];
        arr[lastIndex] = temp;
    }

}
