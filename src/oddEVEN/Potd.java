package oddEVEN;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;


public class Potd {
    public List<List<Integer>> findMatrix2610(int[] nums) {
        Map<Integer, Integer> count = new HashMap<>();
          List<List<Integer>> res = new ArrayList<>();
  
          for (int n : nums) {
              int row = count.getOrDefault(n, 0);
              
              while (res.size() <= row) {
                  res.add(new ArrayList<>());
              }
              
              res.get(row).add(n);
              count.put(n, row + 1);
          }
  
          return res;
      }   
}
