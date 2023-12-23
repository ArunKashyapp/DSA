package oddEVEN;
class Problems {
    
    public int findNumbers(int[] nums) {


        // this is the best version of this problem
        /*
         * 3
         * class Solution {
         * public int findNumbers(int[] nums) {
         * int output = 0;
         * for (int num : nums) {
         * if ((int)(Math.log10(num) + 1) % 2 == 0) {
         * output++;
         * }
         * }
         * return output;
         * }
         * }
         */

        int count = 0;

        for (int i = 0; i < nums.length; i++) {

            int number = countDigit(nums[i]);

            if (evenodd(number)) {
                count++;
            }

        }
        return count;
    }

    boolean evenodd(int num) {
        if (num % 2 == 0) {
            return true;
        }
        return false;
    }

    int countDigit(int num) {
        if (num < 0) {
            num = num * -1;
        }
        return (int) (Math.log10(num) + 1);
    }

  
}

class Solution {
    
    public int[] searchRange(int[] nums, int target) {
        int[] answer = new int[] { -1, -1 }; // Initialize with -1, indicating not found

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                if (answer[0] == -1) {
                    answer[0] = i; // Update the starting index only if it's not found yet
                }
                answer[1] = i; // Always update the ending index as you iterate through the array
            }
        }

        return answer;
    }
       int[][] transpose(int[][] matrix) {
       
     for( int i = 0 ; i < matrix.length ; i++){
         for( int j =0 ; j < matrix.length; j++){
         
                 int temp = matrix[i][j];
                 matrix[i][j]=matrix[j][i];
                 matrix[j][i] = temp; 
            
         }
     }
        return matrix;
    }

    int[] rotate(int[] nums, int k) {
        int[] ans = new int[nums.length];
        for(int i = nums.length - k,j=0 ; i < nums.length ; i++,j++){
            ans[j]= nums[i];

        }
      return ans;
        
    }


     

       boolean linearSearch( int[] arr,int target) {
       
        for (int i : arr) {
            if (target == i) {
                return true;
            }

        }

        return false;
    }

    int findMissingNumber(int[] arr, int n ){
        int missingNumber=0;
       for( int i = 0 ; i <= n ; i++){
         if (   linearSearch(arr , i ) == false) {
            missingNumber = i;
            break;
         }

       }
       return missingNumber;
    }
    
}
