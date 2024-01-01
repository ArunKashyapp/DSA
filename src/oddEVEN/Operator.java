
package oddEVEN;
public class Operator {


    //program to find odd or even number using the and operator

    void oddEVEN(int n ){
        if((n&1)==1) {
       System.out.printf("The Number %d is odd" , n);
        }
    System.out.printf("The number %d is even", n);
        
        
    }

    // find the non dduplicate no in the array of duplicates
    int duplicateNumber( int[] arr){
        int result = 0 ;

        for( int i : arr){
            result ^=i;
        }
        return result;
    }
    //program to find the ith bit

    int findIthBit(int n, int binaryNumber){
        int mask = 1 << (n - 1);
        System.out.println(mask);
        return (binaryNumber & mask) >> (n - 1);
    }
    
}
