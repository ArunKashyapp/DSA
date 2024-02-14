package oddEVEN;

import java.util.Scanner;

public class BitManipulation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your first name:");
        String firstName = sc.next();
        System.out.print("Enter your last name:");
        String lastName = sc.next();
        System.out.println("First Name is " + firstName );

        sc.close();

    }

    static boolean isPrime(int n) {

        if (n <= 1) {
            return false;
        }

        int count = 0;
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }

        if (count > 1)
            return false;
        return true;

    }

    static void oddEven(int n) {

        if ((n & 1) == 1) {
            System.out.println("The number " + n + " is odd");
        }
        System.out.println("The number " + n + " is even");
    }

}