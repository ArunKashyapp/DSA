
package oddEVEN;

import java.util.HashMap;

/**
 * Deloitte
 */
public class Deloitte {

    // public class Main
    // {
    // public static void main(String[] args) {
    // Scanner sc=new Scanner(System.in);
    // int result=0;
    // int n=sc.nextInt();
    // for(int i=0;i<n;i++)
    // {
    // int m=sc.nextInt();
    // int v=sc.nextInt();
    // result+=(m*v);
    // }
    // System.out.println(result);
    // }
    // }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }


        // System.out.println(isPrime(4));
    }

    public static boolean isPrime(int n) {

        if (n <= 1) {
            return false;
        }

        int count = 0;
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                count = count+1;
            }

        }

        if (count > 1)
            return false;
        return true;
    }

    // public static void main(String[] args) {

    // int n;
    // Scanner sc = new Scanner(System.in);
    // n = sc.nextInt();
    // int arr[] = new int[n];

    // for (int i = 0; i < n; i++) {
    // arr[i] = sc.nextInt();
    // }

    // Arrays.sort(arr);

    // StringBuilder a = new StringBuilder();
    // StringBuilder b = new StringBuilder();

    // for (int i = 0; i < arr.length; i++) {
    // if ((i & 1) == 1) {
    // b.append(arr[i]);

    // } else {
    // a.append(arr[i]);
    // }

    // }

    // int x = Integer.parseInt(a.toString());
    // int y = Integer.parseInt(b.toString());
    // System.out.println(x + y);

    // sc.close();
    // }

    static int getFrequency(int[] arr) {

        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int count = hashMap.getOrDefault(arr[i], 0);
            hashMap.put(arr[i], count + 1);
        }

        int mostFrequencyNumber = arr[0];
        int frequencyCount = 0;
        for (int key : hashMap.keySet()) {
            if (hashMap.get(key) > frequencyCount) {
                frequencyCount = hashMap.get(key);
                mostFrequencyNumber = key;
            }
        }

        return mostFrequencyNumber;

    }

}
// public class Deloitte {

// // Binary to Decimal Conversion
// public static int binaryToDecimal(String binary) {
// return Integer.parseInt(binary, 2);
// }

// // Decimal to Binary Conversion
// public static String decimalToBinary(int decimal) {
// return Integer.toBinaryString(decimal);
// }

// // Decimal to Hexadecimal Conversion
// public static String decimalToHexadecimal(int decimal) {
// return Integer.toHexString(decimal).toUpperCase();
// }

// // Hexadecimal to Decimal Conversion
// public static int hexadecimalToDecimal(String hex) {
// return Integer.parseInt(hex, 16);
// }

// // Main method for testing
// public static void main(String[] args) {
// // Test conversions
// String binary = "1010";
// int decimal = 42;
// String hex = "2A";

// System.out.println("Binary to Decimal: " + binaryToDecimal(binary));
// System.out.println("Decimal to Binary: " + decimalToBinary(decimal));
// System.out.println("Decimal to Hexadecimal: " +
// decimalToHexadecimal(decimal));
// System.out.println("Hexadecimal to Decimal: " + hexadecimalToDecimal(hex));
// }
// }
