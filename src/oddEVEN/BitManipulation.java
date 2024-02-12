package oddEVEN;

public class BitManipulation {

    public static void main(String[] args) {
        
        int  n = -10;
        System.out.println(-n);

    }

   static void oddEven(int n){

    if((n & 1)== 1){
    System.out.println("The number "+n+" is odd");
    }
    System.out.println("The number "+n+" is even");
    }   

}