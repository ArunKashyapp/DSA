package oddEVEN;

import java.util.ArrayList;
import java.util.List;

public class RecurssionPractice {

    public static void main(String[] args) {

    int ans = fibo(6);
      System.out.println(ans);

    }




    
    // sum of previous two fibonacci numbers is basically the nth fibonacci number
    // suppose n = 5 then 5th fibo number is sum of 5-1 = 4 or 5-2 = 3
    // 1 1 2 3 5 8

    static int fibo(int n) {
        if (n <= 1) {
            return n;
        }
        return fibo(n - 1) + fibo(n - 2);
    }

    // factorial of a number by recurssion
    // Factorial of a numeber n is basically n*n-1*n-2------1
    // ex 5 = 5*4*3*2*1 = 120
    // so base condition is basically when n == 1 return 1

    static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    // program to return the list of the fibonaacci number series

    static List<Integer> fibonaacciSeries(int n) {
        if (n <= 2) {
            List<Integer> ans = new ArrayList<>();
            ans.add(n);
            return ans;
        }

        List<Integer> left = fibonaacciSeries(n - 1);
        List<Integer> right = fibonaacciSeries(n - 2);

        left.addAll(right);
        return left;

    }

}
