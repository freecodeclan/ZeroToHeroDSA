/*  Given 2 numbers a and b. Find a raise to the power b. */

package MasterYourBasics;

public class findPower {
  public static void main(String[] args) {
    int a = 2;
    int b = 5; 

    int ans = 1;
    for (int i = 1; i<=b; i++){
      ans = ans * a;
    
    }
    System.out.println("The ans of a raise to the power b is : " + ans);
  }
}
