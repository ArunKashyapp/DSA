package oddEVEN;

import java.util.ArrayList;
import java.util.List;

class HelperRecurssion {
    public static void main(String[] args) {

        HelperRecurssion hr = new HelperRecurssion();
        int[] arr = { 1};

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

    List<Integer> concurrentElements(int[] arr, int target, int index, List<Integer> ls) {

        if (index == arr.length) {
            return ls;
        }
        if (target == arr[index]) {
            ls.add(arr[index]);
        }
        return concurrentElements(arr, target, index += 1, ls);
    }

    List<Integer> concurrentElementss(int[] arr, int target, int index) {
        List<Integer> ls = new ArrayList<>();
        if (index == arr.length) {
            return ls;
        }
        if (target == arr[index]) {
            ls.add(arr[index]);
        }
        List<Integer> ansfromBelow = concurrentElementss(arr, target, index += 1);
        ls.addAll(ansfromBelow);
        return ls;
    }

}


