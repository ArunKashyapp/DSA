package oddEVEN;

public class Patterns {

    public static void main(String[] args){
     
     int a = 2;
     int ans  =  a&1;
     System.out.println(ans);

    }

    int maxScore(String s) {

        int ones = 0 ;
        
        for( int i = 0 ; i < s.length(); i++){
            if(s.charAt(i)=='1'){
                ones++;
            }
        }
        int i = 0; 
       while (  i < s.length() && s.charAt(i)=='0'){
           ones++;
           i++;
       }
        if(ones == s.length()){
           return ones-1;
        }  
       return ones;
    }

   static  void pattern1(int rows, int cols) {

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern(int n) {
        for (int row = 1; row < n * 2; row++) {
            int colsInRow = row > n ? n * 2 - row : row;
            for (int j = 1; j <= colsInRow; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static  void pattern2(int rows) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static  void pattern3(int rows) {
        for (int i = 0; i < rows; i++) {
            for (int j = rows; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static   void pattern4(int rows) {
        for (int i = 0; i < rows; i++) {
            for (int j = 1; j <= i + 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    static  void pattern5(int rows) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1; i < rows; i++) {
            for (int j = rows; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static  void pattern6(int rows) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    static   void pattern7(int rows) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = rows; k > i; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static  void pattern10(int rows) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");

            }

            System.out.println();
        }
    }

    static  void pattern11(int rows) {
        for (int i = 0; i < rows; i++) {
            for (int k = 0; k <= i; k++) {
                System.out.print(" ");

            }
            for (int j = 0; j < rows - i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    static   void pattern12(int rows) {
        for (int i = 0; i < rows; i++) {
            for (int k = 0; k <= i; k++) {
                System.out.print(" ");

            }
            for (int j = 0; j < rows - i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");

            }

            System.out.println();
        }
    }

    static   void pattern13(){
        int n = 5; // You can change the value of n to adjust the size of the pattern

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1 || i == j || i + j == n - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  "); // Adjust spaces for the inner pattern
                }
            }
            System.out.println();
        }
    }

}
