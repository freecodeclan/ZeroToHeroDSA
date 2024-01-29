/*
Print the given pattern

 * * * * *
 * * * * * 
 * * * * * 
 
 */
package MasterYourBasics;

public class printStarPattern_1 {
  public static void main(String[] args) {
    int n = 3;
    for (int i = 0; i < n; i++){
      for (int j = 0; j < 5; j++){
        System.out.print("*" + " ");
      }
      System.out.println();
    }
  }
}
