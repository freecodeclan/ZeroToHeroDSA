/*  Find the last occurence of given element */
package Arrays;

public class lastOccurence {

  static int findLastOccurence(int[] a, int x){
    int lastIndex = -1;
    for (int i = 0; i < a.length; i++){
      if (a[i] == x){
        lastIndex = i;
      }
    }
    return lastIndex;
  }
  public static void main(String[] args) {
    int[] arr = {1,2,3,1,3,4,10};
    int target = 1;

    int lastIndex = findLastOccurence(arr, target);
    System.out.println("The last occurence of target value is: " + lastIndex);
  }
}
