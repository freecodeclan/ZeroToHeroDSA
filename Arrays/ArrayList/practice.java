package Arrays.ArrayList;

import java.util.ArrayList;

public class practice {
  public static void main(String[] args) {
    Integer k = Integer.valueOf(5);
    System.out.println(k);

    ArrayList<Integer> li = new ArrayList<>();  //--- Creating ArrayList

    //--Adding items into ArrayList
    li.add(5);
    li.add(1);
    li.add(2);
    li.add(6);

    System.out.println(li.size());    //-- To know the size of Array List 

    System.out.println(li.get(2));  //--To get an element from particular index

    //-- Printing an ArrayList using for loop
    for(int i=0; i < li.size(); i++){
      System.out.print(li.get(i) + " ");
    }
    System.out.println();

    //-- Add element at some index i
    li.add(3,4);
    System.out.println(li);
  }
}
