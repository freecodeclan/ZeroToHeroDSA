/*  Program to count number of occurences of given x  */
package Arrays;

public class countNumOfOccurence {

  static int findOccurence(int[] arr, int x){
    int count = 0;
    for (int i=0; i<arr.length; i++){
      if (arr[i] == x) count++;
    }
    return count;

  }
  public static void main(String[] args) {
    int[] arr = {1,2,4,3,2,1,1,5};
    int x = 1;
    int finalOccurence = findOccurence(arr, x);
    System.out.println(finalOccurence);
  }
}
