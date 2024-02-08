/*  Target Sum

    Find the total number of pairs in the Array whose sum is equal to the given value x.

    Question---> collegeWallah
*/
package Arrays;

public class targetSum {

  static int pairSum(int[] a, int target){
    int n = a.length;
    int ans = 0;

    for (int i=0; i<n; i++){
      for (int j = i; j<n; j++){
        if (a[i] + a[j] == target){
          ans++;
        }
      }
    }
    return ans;
  }
  public static void main(String[] args) {
    int[] arr = {3,2,5,6,1};
    int x = 7;

    System.out.println(pairSum(arr, x));

    
  }
}
