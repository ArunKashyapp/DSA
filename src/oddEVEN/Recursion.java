package oddEVEN;

public class Recursion {

    int fibo(int n) {

        if (n <= 1) {
            return n;
        }
         int ans = fibo(n-1)+fibo(n-2);
         System.out.println(ans);
      return ans;
    }

}
