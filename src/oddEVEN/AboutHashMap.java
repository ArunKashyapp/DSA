package oddEVEN;

import java.util.HashMap;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

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

        int matrix[][] = { { 1, 3 }, { 2, 3 }, { 3, 6 }, { 5, 6 }, { 5, 7 }, { 4, 5 }, { 4, 8 }, { 4, 9 }, { 10, 9 },
                { 10, 4 } };
        System.out.println(findWinners(matrix));

    }

    static int[] mergeSort(int arr[]) {
        // first we know this when array.length == 1 then we have to return the element

        if (arr.length == 1) {
            return arr;
        }

        int mid = arr.length / 2;

        int left[] = mergeSort(Arrays.copyOfRange(arr, 0, mid));
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

    public static List<List<Integer>> findWinners(int[][] matches) {

        HashMap<Integer, Integer> loosers = new HashMap<>();

        List<Integer> ans1 = new ArrayList<Integer>();
        List<Integer> ans2 = new ArrayList<Integer>();
        List<List<Integer>> finalAns = new ArrayList();

        for (int i = 0; i < matches.length; i++) {
            if (loosers.containsKey(matches[i][1])) {
                loosers.put(matches[i][1], loosers.get(matches[i][1]) + 1);
            } else {
                loosers.put(matches[i][1], 1);
            }
        }

        for (int i = 0; i < matches.length; i++) {
            if (!loosers.containsKey(matches[i][0]) && !ans1.contains(matches[i][0])) {
                ans1.add(matches[i][0]);
            }

        }

        for (Map.Entry<Integer, Integer> entry : loosers.entrySet()) {
            // Access the key and value using entry.getKey() and entry.getValue()
            // Your logic here based on the key and value
            int key = entry.getKey();
            int value = entry.getValue();

            // Your logic here based on the key and value
            if (value == 1) {
                ans2.add(key);
            }
        }

        ans1.sort(null);
        ans2.sort(null);
        finalAns.add(ans1);
        finalAns.add(ans2);

        return finalAns;

    }
}

//     class Solution {
//         public boolean closeStrings(String word1, String word2) {
//             if(word1.length()!=word2.length() ){
//                 return false;
//             }
             
//              HashMap<Character,Integer> w1 = new HashMap<>();
//              HashMap<Character,Integer> w2 = new HashMap<>();
    
//              for(int i = 0 ; i < word1.length() ; i++){
//                  w1.put(word1.chatAt(i),w1.get(word1.charAt(i))+1);
//                  w2.put(word2.chatAt(i),w2.get(word1.charAt(i))+1);
//              }
    
//              for(Map.Entry<Integer,Integer> entry : w1.entrySet()){
//                  if( searchValue(entry.getValue())==false){
//                   return false;
//                  }
//              }
//         return true;
//         }
    
//         boolean searchValue(int value , HashMap<Integer,Integer> map){
//             for(Map.Entry<Integer,Integer> entry : w2.entrySet()){
//                 if(entry.getValue()!=value){
//                     return false;
//                 }
//             }
//             return true;
//         }
//     }

// }

// // import java.util.HashMap;

// // public class ElementCount {
// // public static void main(String[] args) {
// // int[] array = {1, 2, 3, 4, 1, 2, 3, 4, 5, 1};

// // // Create a HashMap to store the element count
// // HashMap<Integer, Integer> elementCountMap = new HashMap<>();

// // // Iterate through the array
// // for (int element : array) {
// // // Check if the element is already in the map
// // if (elementCountMap.containsKey(element)) {
// // // If yes, increment the count
// // elementCountMap.put(element, elementCountMap.get(element) + 1);
// // } else {
// // // If not, add the element to the map with count 1
// // elementCountMap.put(element, 1);
// // }
// // }

// // // Print the element count
// // for (int key : elementCountMap.keySet()) {
// // System.out.println("Element " + key + " occurs " + elementCountMap.get(key) +
// // " times.");
// // }
// // }
// // }
