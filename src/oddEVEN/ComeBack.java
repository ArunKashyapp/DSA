package oddEVEN;

public class ComeBack {

    public static void main(String[] args) {
        int ans = fibo(7);
        System.out.println(ans);

    }

    // 1 1 2 3 5 8 13

    static int fibo(int n) {
        if (n < 2) {
            return n;
        }

        return fibo(n - 1) + fibo(n - 2);
    }



    // 3! = 3 x 2!
    // 2! = 2 x 1!
}
