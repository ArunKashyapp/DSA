package oddEVEN;
import java.util.Arrays;

public class Recursion {

    public static void main(String[] args) {
        int[] arr = {44,3423,56,2,45,22,222,2434};
        Recursion r = new Recursion();
        r.bubbleSortUsingRecurssion(arr, arr.length-1, 0);
        System.out.println(Arrays.toString(arr));
    }

    int fibo(int n) {

        if (n <= 1) {
            return n;
        }

        return fibo(n - 1) + fibo(n - 2);
    }

    int binarySearchUsingRecursion(int[] arr, int target, int start, int end) {
        if (start > end) {
            return -1;
        }

        int mid = start + (end - start) / 2;

        if (arr[mid] == target) {
            return mid;
        } else if (arr[mid] < target) {
            // start = mid+1;
            return binarySearchUsingRecursion(arr, target, mid + 1, end);

        } else {
            // end = mid-1;
            return binarySearchUsingRecursion(arr, target, start, mid - 1);

        }
    }

    // factorial of an number forex(6) = 6*5*4*3*2*1
 

    int factorialOfNumber( int number){

        if(number == 0){
            return 1;
        }

        

        return number * factorialOfNumber(number-1);
    }


    void bubbleSortUsingRecurssion(int[] arr , int r, int c){

        if(r==0) return;
        if(c<r){
            if(arr[c] >= arr[c+1]){
                int temp = arr[c];
                arr[c] = arr[c+1];
                arr[c+1] = temp;
            }
            bubbleSortUsingRecurssion(arr, r, c+1);
        }else{
            bubbleSortUsingRecurssion(arr, r-1, 0);
        }
    
    }

}
