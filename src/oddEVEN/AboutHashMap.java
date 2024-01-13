package oddEVEN;

import java.util.HashMap;
import java.util.Arrays;

public class AboutHashMap {

    // Some important methods of the hashMaps
    // 1. containsKey(key) - this method will check whether the key is already
    // present or not
    // 2. put(key , value) - this method is used to put the value in the hashmap
    // example - map.put(i,map.get(i)+1)
    // 3. get(key) - this method will take an key as argument and it will check the
    // value of the that key
    // 4. keySet() - this will give us the set of all the keys in the map so that we
    // can easily traverse through that

    public static void main(String[] args) {

        int[] arr = {5,4,3,4,3,4,323,234,2,1};
        int[] ans = mergeSort(arr);
        System.out.println(Arrays.toString(ans));

    }

  static  int[] mergeSort(int arr[]) {
        // first we know this when array.length == 1 then we have to return the element

        if (arr.length == 1) {
            return arr;
        }

        int mid = arr.length/2;

        int left[] = mergeSort(Arrays.copyOfRange(arr, 0 ,mid));
        int right[] = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);

    }

    private static int[] merge(int[] left, int[] right) {
        int mergedArray[] = new int[left.length + right.length];

        int i = 0;
        int j = 0;
        int k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                mergedArray[k] = left[i];
                i++;
            } else {
                mergedArray[k] = right[j];
                j++;
            }
            k++;
        }

        while (i < left.length) {
            mergedArray[k] = left[i];
            i++;
            k++;

        }
        while (j < right.length) {
            mergedArray[k] = right[i];
            j++;
            k++;

        }

        return mergedArray;
    }

    HashMap<Character, Integer> romanToInt = new HashMap<>();

    void adddingValues() {
        romanToInt.put('I', 1);
        romanToInt.put('V', 5);
        romanToInt.put('X', 10);
        romanToInt.put('L', 40);
        romanToInt.put('C', 50);
        romanToInt.put('D', 100);
        romanToInt.put('M', 500);

    }

}

// import java.util.HashMap;

// public class ElementCount {
// public static void main(String[] args) {
// int[] array = {1, 2, 3, 4, 1, 2, 3, 4, 5, 1};

// // Create a HashMap to store the element count
// HashMap<Integer, Integer> elementCountMap = new HashMap<>();

// // Iterate through the array
// for (int element : array) {
// // Check if the element is already in the map
// if (elementCountMap.containsKey(element)) {
// // If yes, increment the count
// elementCountMap.put(element, elementCountMap.get(element) + 1);
// } else {
// // If not, add the element to the map with count 1
// elementCountMap.put(element, 1);
// }
// }

// // Print the element count
// for (int key : elementCountMap.keySet()) {
// System.out.println("Element " + key + " occurs " + elementCountMap.get(key) +
// " times.");
// }
// }
// }
