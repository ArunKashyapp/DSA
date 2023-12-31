package oddEVEN;
import java.util.HashMap;
import java.util.Arrays;
public class AboutHashMap {


    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
System.out.println(Arrays.toString(mergeSort(arr)));        
    }

    static int[] mergeSort(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }

        int mid = arr.length / 2;

        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }

    private static int[] merge(int[] first, int[] second) {
        int[] mix = new int[first.length + second.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                mix[k] = first[i];
                i++;
            } else {
                mix[k] = second[j];
                j++;
            }
            k++;
        }

        // it may be possible that one of the arrays is not complete
        // copy the remaining elements
        while (i < first.length) {
            mix[k] = first[i];
            i++;
            k++;
        }

        while (j < second.length) {
            mix[k] = second[j];
            j++;
            k++;
        }

        return mix;
    }


    HashMap<Character,Integer> romanToInt = new HashMap<>();
    void adddingValues(){
          romanToInt.put('I',1);
          romanToInt.put('V',5);
          romanToInt.put('X',10);
          romanToInt.put('L',40);
          romanToInt.put('C',50);
          romanToInt.put('D',100);
          romanToInt.put('M',500);
         
    }
    
}
