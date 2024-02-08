package Arrays.ArrayList;

import java.util.ArrayList;
import java.util.*;

public class reverseArrayList {

  static void reverseList(ArrayList<Integer> list){

    int i = 0; 
    int j = list.size()-1;

    while (i < j) {
      Integer temp = Integer.valueOf(list.get(i));
      list.set(i, list.get(j));
      list.set(j, temp);
  
      i++;
      j--;
    }
  }
  public static void main(String[] args) {
    ArrayList<Integer> li = new ArrayList<>();
    li.add(5);
    li.add(4);
    li.add(3);
    li.add(2);
    li.add(1);
    System.out.println("The original list is: " + li);

    // reverseList(li);
    Collections.reverse(li);
    System.out.println("The reveresed list is: " + li);
  
  }
}
