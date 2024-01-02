package oddEVEN;

public class PatternsWithRecurssion {
    public static void main(String[] args){
        PatternsWithRecurssion pr = new PatternsWithRecurssion();
        pr.anotherWay1(5,0);

    }


    void patternWithRec1(int n){
        if(n == 0) return;
        for(int i = 0; i < n ; i++){
            System.out.print("*");
        }
        System.out.println();
        patternWithRec1(n-1);

    }

    void anotherWay1(int r , int c){
        //total 20 calls in this method 

        if(r == 0) return;
        if(c < r){
            System.out.print("*");
            anotherWay1(r,c+1);
        }else{
            System.out.println();
            anotherWay1(r-1,0);

        }


    }
}
