package oddEVEN;
import java.util.HashMap;
import java.util.Map;


public class Medium {

  public static void main(String[] args) {
    
  }


      public int singleNonDuplicate540(int[] nums) {
        int ans = 0;

        Map<Integer,Integer> countMap = new HashMap<>();
        for (int num : nums) {
    countMap.put(num, countMap.getOrDefault(num, 0) + 1);

     
} 
 for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() % 2 == 1) {
                ans =  entry.getKey();
                break;
            }
        }

   
     return   ans;
    }
    
}
