/*  Print the following series where all the even numbers are subtracted and all the odd numbers are added for the given n value */
package MasterYourBasics;

public class printTheSeries {
  public static void main(String[] args) {
    int n = 5;
    int ans = 0;

    for (int i=1; i <=n; i++){
      if (i % 2 == 0){
        ans -= i;
      }
      else{
        ans += i;
      }
    }
    System.out.println(ans);
  }
}
