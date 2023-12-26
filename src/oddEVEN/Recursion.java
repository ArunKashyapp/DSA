package oddEVEN;

public class Recursion {

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

}
