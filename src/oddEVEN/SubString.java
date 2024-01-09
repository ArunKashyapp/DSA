package oddEVEN;

import java.util.ArrayList;

public class SubString {

public static void main(String[] args) {

    ArrayList<String> ans = new ArrayList<>();
    ans = subString("", "abc");
    System.out.println(ans);

     
}

 
 static ArrayList<String>  subString(String p , String up){
    if(up.isEmpty()){
        ArrayList<String> list = new ArrayList<>();
        list.add(p);
        return list;
    }
 char ch = up.charAt(0);
 ArrayList<String> left = subString(p+ch, up.substring(1));
 ArrayList<String> right = subString(p, up.substring(1));

 left.addAll(right);
 return left;

 }
     
}
