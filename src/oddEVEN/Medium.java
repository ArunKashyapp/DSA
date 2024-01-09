package oddEVEN;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Arrays;
import java.util.Map;

public class Medium {

    public static void main(String[] args) {
        int arr[] = {3,6,7,11};

        int ans = minEatingSpeed(arr, 8);
        System.out.println(ans);
       
     
    }


    public static int minEatingSpeed(int[] piles, int h) {

        Arrays.sort(piles);
        int high = piles[piles.length-1];
        int l = 1;
        while( l <= high){
            int mid = l +(high-l)/2;
            if( results(piles, mid , h)){
               high = mid-1;
            }else{
                l = mid+1;
            }
    }
    return l;
 }

    static boolean results(int arr[], int mid , int h){
        double res = 0;
        int i = 0;
        
        while(i<arr.length){
          res += Math.ceil((double)arr[i]/mid);
          i++;
          if( res > h){
              return false;
          }
        }

     return true;
    }

    public static int findMin(int[] nums) {
        int l = 0;
        int h = nums.length - 1;
        int pivot = 10;
        while (l <= h) {
            int mid = l + (h - l) / 2;
            if (nums[mid] > nums[mid + 1]) {
                pivot = nums[mid];
            } else if (nums[mid] > nums[mid-1]) {
                l = mid + 1;
            } else {
                h = mid - 1;
            }
        }
        // if(nums[pivot] == nums[nums.length-1]){
        // ans = nums[0];
        // }

        return pivot;

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
