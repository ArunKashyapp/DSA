package oddEVEN;
import java.util.Arrays;

public class Easy {

    // [[4,3,2,-1],[3,2,1,-1],[1,1,-1,-2],[-1,-1,-2,-3]]
    public static void main(String[] args) {
     
      String s = "HEY";
      s.toLowerCase();
      System.out.println(s);
        
    
    }
///////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////
// this is the best example of string immutibilty 
    public static boolean halvesAreAlike(String s) {
      s=  s.toLowerCase();
   
        int mid = s.length()/2;
        int leftCount = countVowels(s.substring(0,mid));
        int rightCount = countVowels(s.substring(mid));
        
        if(leftCount == rightCount){
            return true;
        }

        
        return false;
    }

    static int  countVowels(String s){
        int count = 0;
        int i = 0;
        while(i < s.length()){
            if( s.charAt(i) == 'a'|| s.charAt(i) =='e'|| s.charAt(i) =='i'||s.charAt(i) =='o'||s.charAt(i) =='u'){
            count++;
        }
        i++;
        }
      return count;
    }
    public static int missingNumber(int[] nums) {

        return actualSum(nums) - incorrectSum(nums);
    }

    static int max(int arr[]) {
        if (arr.length == 0) {
            return 0; // Return 0 for an empty array, assuming 0 is the missing number
        }

        int max = Integer.MIN_VALUE;
        for (int i : arr) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    static int actualSum(int arr[]) {
        int n = arr.length;
        return n * (n + 1) / 2;
    }

    static int incorrectSum(int arr[]) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }

    public static int countNegatives(int[][] grid) {

        int rows = grid.length;
        int cols = grid[0].length;
        int r = 0;
        int c = cols - 1;
        int negativeCount = 0;

        while (r < rows && c >= 0) {
            if (grid[r][c] < 0) {
                negativeCount += (rows - r);
                c--;
            } else {
                r++;
            }
        }
        return negativeCount;
    }

}
