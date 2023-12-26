package oddEVEN;

import java.util.ArrayList;
import java.util.List;

public class AboutList {

  List<String> name = new ArrayList<String>();

  List<List<String>> arrayOfList = new ArrayList<>();


  void addingInLLl(){
    List<String> innerList = new ArrayList<>();
    innerList.add("hello");
    innerList.add("Arun");
    arrayOfList.add(innerList);
  }


  void addingElement() {
    name.add("Arun");
    name.add("Harsh");
    name.add("Vipul");
    name.add("Chinu");
  }

  void printElements() {
    for (String n : name) {
      System.out.println(n);
    }
  }


  

}
