package oddEVEN;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class SubString {

    public static void main(String[] args) {

        // ArrayList<String> ans = new ArrayList<>();
        // ans = subString("", "abc");
        // System.out.println(ans);*

         int arr[] =  {3,0,1};
        int ans = missingNumber(arr);
        System.out.println(ans);
    }
    public static int missingNumber(int[] nums) {
        int actualSum = actualSum(nums);
        int incorrectSum = Arrays.stream(nums).sum();

        return actualSum - incorrectSum;
    }

    static int  actualSum(int arr[]) {
        int n = arr.length;
        return n * (n + 1) / 2;
    }
    List<String> subStringg(String p, String up) {

        // base condtion
        if (up.isEmpty()) {

            ArrayList<String> ans = new ArrayList<>();
            ans.add(p);
            return ans;
        }

        // take it

        List<String> left = subString(p + up.charAt(0), up.substring(1));

        // ignore it
        List<String> right = subString(p, up.substring(1));
         left.addAll(right);
         return left;
    }

    // prpgram to remove a from the given substring
    static void removeA(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        if (ch == 'a') {
            removeA(p, up.substring(1));
        } else {
            removeA(p + ch, up.substring(1));
        }
    }

    static String removeCharWithTwoParameters(String p, String up) {

        if (up.isEmpty()) {
            return p;
        }

        if (!up.startsWith("a")) {
            return removeCharWithTwoParameters(p + up.charAt(0), up.substring(1));
        } else {
            return removeCharWithTwoParameters(p, up.substring(1));
        }
    }

    static String apple(String p) {

        if (p.isEmpty()) {
            return "";
        }

        if (p.startsWith("apple")) {
            return apple(p.substring(5));
        } else {
            return p.charAt(0) + apple(p.substring(1));
        }

    }

    static String removeA(String a) {
        if (a.isEmpty()) {
            return "";
        }

        if (a.startsWith("a")) {
            return removeA(a.substring(1));
        } else {
            return a.charAt(0) + removeA(a.substring(1));
        }

    }

    static ArrayList<String> subString(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = subString(p + ch, up.substring(1));
        ArrayList<String> right = subString(p, up.substring(1));

        left.addAll(right);
        return left;

    }

}
