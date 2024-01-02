package oddEVEN;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;


public class Potd {

    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 2, 3, 4, 5, 6, 6, 6};
        Potd problem = new Potd();
        List<List<Integer>> ans = problem.findMatrix2610(arr);
        System.out.println(ans);
       
    }
    
    public List<List<Integer>> findMatrix2610(int[] nums) {
        // int arr[] = {1, 2, 2, 2, 3, 4, 5, 6, 6, 6};


        Map<Integer, Integer> count = new HashMap<>();
          List<List<Integer>> res = new ArrayList<>();
   //fitst n = 1
          for (int n : nums) {
              int row = count.getOrDefault(n, 0);
            // row = 0;
              while (res.size() <= row) {
                  res.add(new ArrayList<>());
              }
              
              res.get(row).add(n);
              count.put(n, row + 1);
          }
  
          return res;
      } 
      
    
}
