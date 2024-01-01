package oddEVEN;

class HelperRecurssion {
    public static void main(String[] args) {

        HelperRecurssion hr = new HelperRecurssion();
        int[] arr = { 1, 2,3 ,8,9};
        boolean ans = hr.linearSearch(arr, 0,3);
        System.err.println(ans);

    }

    // program to count the number of zeros in a given number
    int countZeros(int n) {
        if (n == 0) {
            return 1;
        }

        int count = 0;
        while (n != 0) {
            int remainder = n % 10;
            if (remainder == 0) {
                count++;
            }
            n /= 10;
        }

        return count;
    }

    int countZerosRecursive(int n) {
        if (n == 0) {
            return 0;
        }

        int lastDigit = n % 10;
        if (lastDigit == 0) {
            return 1 + countZerosRecursive(n / 10);
        } else {
            return countZerosRecursive(n / 10);
        }
    }

    boolean sortedOrNot(int[] arr, int i) {

        if (i == arr.length - 1) {
            return true;
        }
        return arr[i] < arr[i + 1] && sortedOrNot(arr, i = i + 1);
    }
    boolean linearSearch(int[] arr, int i, int target) {

        if (i == arr.length) {
            return false;
        }
        return arr[i] == target || linearSearch(arr, i = i + 1, target);
    }
} 