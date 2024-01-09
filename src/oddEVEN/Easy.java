package oddEVEN;

public class Easy {

    // [[4,3,2,-1],[3,2,1,-1],[1,1,-1,-2],[-1,-1,-2,-3]]
    public static void main(String[] args) {
        int arr[][] = {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
        int ans = countNegatives(arr);
       System.out.println(ans);
        
    }

       public static int countNegatives(int[][] grid) {
       

       int rows = grid.length;
       int cols = grid[0].length;
       int r = 0;
       int c = cols-1;
       int negativeCount = 0;

       while(r < rows && c >=0){
           if(grid[r][c] < 0){
               negativeCount+=(rows-r);
               c--; 
               } else{
               r++;
             }
       }
       return negativeCount;
    }
    
}
