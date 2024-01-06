package oddEVEN;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Arrays;
import java.util.Map;

public class Medium {

    public static void main(String[] args) {
        Medium operation = new Medium();
        int[] arr = { 2, 4, 5, 6, 10, 11, 14, 21 };
        int[] arr1 = { 1, 2, 3, 5, 7, 8, 11, 12, 13 };
        HashSet<Integer> hashSet = new HashSet<>();

        // Add elements from arr to hashSet
        for (int num : arr) {
            hashSet.add(num);
        }

        // Add elements from arr1 to hashSet
        for (int num : arr1) {
            hashSet.add(num);
        }

        System.out.println(hashSet);
    }

    public int singleNonDuplicate540(int[] nums) {
        int ans = 0;

        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);

        }
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() % 2 == 1) {
                ans = entry.getKey();
                break;
            }
        }

        return ans;
    }

    // [2,3,3,2,2,4,2,3,4]
    // [2,2,2,2,3,3,3,4,4]
    int minOperations2870(int[] nums) {
        int operations = 0;
        int temp = 0;
        Arrays.sort(nums);
        for (int i : nums) {

            if (temp == i) {
                continue;
            }
            int count = count(nums, i);
            if (count == 1) {
                operations = -1;
                break;
            } else {
                if (oddEven(count)) {
                    // even operation
                    operations += count / 2 + count % 2;
                    temp = i;

                } else {
                    // odd operation
                    operations += count / 3 + count % 3;
                    temp = i;

                }
            }

        }
        return operations;

    }

    boolean oddEven(int n) {
        if (n % 2 == 0) {
            return true;
        }
        return false;
    }

    int count(int[] nums, int n) {
        int frequency = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == n) {
                frequency++;

            }

        }
        return frequency;
    }

    int[] elements(int[] arr1, int[] arr2) {

        HashSet<Integer> hashSet = new HashSet<>();
        for (int integer : arr1) {
            hashSet.add(integer);
        }
        for (int integer : arr2) {
            hashSet.add(integer);
        }

        return hashSet.stream().mapToInt(Integer :: intValue).toArray();
    }

}
