package oddEVEN;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class AboutArray {
    String[] names = { "Arun", "Harsh" };

    ArrayList<Integer> numbers = new ArrayList<>();

    String[] nameMethod() {
        numbers.add(1, 10);

        System.out.println(Arrays.toString(names));
        return names;
    }

    int[][] inputMethodMatrix(int row, int col) {
        Scanner input = new Scanner(System.in);
        int[][] tempTwoDArray = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                tempTwoDArray[i][j] = input.nextInt();

            }
        }
        input.close();
        return tempTwoDArray;
    }

    void sumofTwoarray() {
        int[][] firstMatrix = new int[3][3];
        int[][] secondMatrix = new int[3][3];
        firstMatrix = inputMethodMatrix(3, 3);

        for (int i = 0; i < firstMatrix.length; i++) {
            for (int j = 0; j < firstMatrix.length; j++) {

                System.out.print(firstMatrix[i][j] + " ");
            }
            System.out.println();
        }
        secondMatrix = inputMethodMatrix(3, 3);

        for (int i = 0; i < secondMatrix.length; i++) {
            for (int j = 0; j < secondMatrix.length; j++) {

                System.out.print(secondMatrix[i][j] + " ");
            }
            System.out.println();
        }

    }

    void twoDimesionals() {
        int[][] box = new int[3][3];
        Scanner input = new Scanner(System.in);

        try {
            for (int i = 0; i < box.length; i++) {
                for (int j = 0; j < box.length; j++) {
                    box[i][j] = input.nextInt();
                }
            }
        } finally {
            input.close();
        }
        for (int i = 0; i < box.length; i++) {
            for (int j = 0; j < box.length; j++) {

                System.out.print(box[i][j] + " ");
            }
            System.out.println();
        }

    }

    int[] reversedArray(int[] arr) {
        for (int i = 0, j = arr.length - 1; i <= j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j] ^ 1;
            arr[j] = temp ^ 1;

        }
        return arr;
    }

    int[] reverseAnAraay(int[] arr) {
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int tempElement = arr[i];
            arr[i] = arr[j];
            arr[j] = tempElement ^ 1;
            arr[i] = arr[i] ^ 1;
        }
        // for( int i = 0 ; i < arr.length ; i++){
        // arr[i] = arr[i]^1;
        // }
        return arr;
    }

    boolean isPallindrome(String wordToCheck) {
        int i = 0;
        boolean isPallindrome = true;

        String upperCaseString = wordToCheck.toUpperCase();

        while (i < upperCaseString.length() && upperCaseString.length() > 1) {

            if (upperCaseString.charAt(i) == upperCaseString.charAt(upperCaseString.length() - 1 - i)) {
                i++;
                isPallindrome = true;
            } else {
                isPallindrome = false;
                break;
            }
        }

        return isPallindrome;

    }

    int[][] flipAndInvertImage(int[][] image) {

        for (int i = 0; i < image.length; i++) {
            for (int j = 0, k = image.length - 1; j <= k; j++, k--) {
                int temp = image[i][j];
                image[i][j] = image[i][k] ^ 1;
                image[i][k] = temp ^ 1;
            }
        }
        return image;
    }

}
