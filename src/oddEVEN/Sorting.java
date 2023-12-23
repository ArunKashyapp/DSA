package oddEVEN;

/**
 * Sorting
 */
public class Sorting {

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

}