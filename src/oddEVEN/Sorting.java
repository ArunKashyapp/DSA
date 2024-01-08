package oddEVEN;

import java.util.Arrays;;

/**
 * Sorting
 */
public class Sorting {

    public static void main(String[] args) {
        int arr[] = { 4, 3, 2, 1 };

        mergeSort(arr);

        System.out.println(Arrays.toString(arr));
    }

    int[] bubbleSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }
        }
        return arr;
    }

    // int[]sortThis = {6,54,31,2,4,1};
    int[] selectionSort(int[] arr) {
        for (int i = 0, j = 0; i < arr.length; i++) {
            int maxElement = getMax(arr, j, arr.length - i - 1);
            swap(arr, maxElement, arr.length - 1 - i);
        }

        return arr;
    }

    int getMax(int[] arr, int firstIndex, int lastIndex) {
        int i = firstIndex;
        int ans = 0;
        int max = Integer.MIN_VALUE;
        while (i < lastIndex) {
            if (arr[i] >= max) {
                max = arr[i];
                ans = i;
            }
            i++;
        }
        return ans;
    }

    // //start = 1 , end = 4
    // int getMax( int[] arr , int start , int end){

    // int max = start;
    // for ( int i = start ; i <= end-1 ; i++){
    // if(arr[max] < arr[i+1]){
    // max = arr[i+1];
    // }
    // }

    // return max;

    // }

    void swap(int[] arr, int index1, int index2) {

        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    int[] swapByGivenNumber(int[] arr, int target) {
        int k = target;
        for (int i = 0; i < arr.length - target; i++) {
            swap(arr, i, k);

            k++;
        }
        return arr;
    }

    // int[] arr = {88,102,44,1,0,3,7};
    // int[]sortThis = {6,31,54,2,4,1};
    // int[]sortThis = {2,4,6,31,54,1};

    int[] insertionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                } else {
                    break;
                }
            }
        }

        return arr;
    }
    // int[] insertionSort( int[] arr){
    // for(int i = 0 ; i< arr.length ; i++){
    // for( int j = i+1 ; j > 0 ; j--){

    // }
    // }
    // return arr;
    // }

    int[] cyclicSort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            if (arr[i] == i + 1 && arr[i] > 0) {
                i++;
            } else {
                swap(arr, i, arr[i] - 1);
            }
        }
        return arr;
    }

    // selection sort using recurrssion
    // suppose you are having an array like this [4,3,2,1]
    // lets discuss what gonna be the arguments in this method
    // array itself , the edge elements you can say to keep track of the serching
    // like r and c
    // what will be the return type nothing because we gonna change the same array
    // we do not need to return the array
    // base condtion is when r == 1 or r < 1

    void bubbleSortUsingRecurssion(int arr[], int r, int c) {
        if (r == 0)
            return;

        if (c < r) {
            if (arr[c] > arr[c + 1]) {
                int temp = arr[c];
                arr[c] = arr[c + 1];
                arr[c + 1] = temp;

            }
            bubbleSortUsingRecurssion(arr, r, c + 1);
        } else {
            bubbleSortUsingRecurssion(arr, r - 1, 0);
        }
    }

    void selectionSortUsingRecurssion(int arr[], int r, int c, int max) {
        if (r == 0)
            return;

        if (c < r) {
            if (arr[max] < arr[c + 1]) {
                max = c + 1;
            }
            selectionSortUsingRecurssion(arr, r, c + 1, max);
        } else {
            swap(arr, r, max);
            selectionSortUsingRecurssion(arr, r - 1, 0, 0);
        }
    }

    // MergeSort

    /*
     * 3,4,5,6,8,12([8,3,4,12,5,6])
     * 3,4,5,6,8,12 ([8,3,4])+([12,5,6])
     * 3,4,8 ([8,3])+([4])5,6,12([12,5])+([6])
     * 3,8 ([8])+([3])5,12([12])+[(5)]
     * 
     * 
     */

    static int[] mergeSort(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }

        int mid = arr.length / 2;

        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }

    private static int[] merge(int[] first, int[] second) {
        int[] mix = new int[first.length + second.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                mix[k] = first[i];
                i++;
            } else {
                mix[k] = second[j];
                j++;
            }
            k++;
        }

        // it may be possible that one of the arrays is not complete
        // copy the remaining elements
        while (i < first.length) {
            mix[k] = first[i];
            i++;
            k++;
        }

        while (j < second.length) {
            mix[k] = second[j];
            j++;
            k++;
        }

        return mix;
    }
};
