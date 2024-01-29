/*  
Problem statement

You have been given an array ‘a’ of ‘n’ unique non-negative integers.

Find the second largest and second smallest element from the array.

Return the two elements (second largest and second smallest) as another array of size 2.

Example :
Input: ‘n’ = 5, ‘a’ = [1, 2, 3, 4, 5]
Output: [4, 2]

The second largest element after 5 is 4, and the second smallest element after 1 is 2.

codingNinja -- https://www.codingninjas.com/studio/problems/ninja-and-the-second-order-elements_6581960?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=PROBLEM
 */

package Arrays;

public class findSLargestSSmallest {

  static int secondLargest(int[] arr, int n){
    int largest = arr[0];
    int slargest = -1;
    for(int i=1; i<n; i++){
      if (arr[i] > largest){
        slargest = largest;
        largest = arr[i];
      }
      else if (arr[i] < largest && arr[i] > slargest){
        slargest = arr[i];
      }
    }
    return slargest;
  }

  static int secondSmallest(int[] arr, int n){
    int smallest = arr[0];
    int ssmallest = Integer.MAX_VALUE;
    for (int i=1; i<n; i++){
      if (arr[i] < smallest){
        ssmallest = smallest;
        smallest = arr[i];
      }
      else if(arr[i] != smallest && arr[i] < ssmallest){
        ssmallest = arr[i];
      }
    }
    return ssmallest;
  }

  static int[] getSecondLargestElements(int n, int[] a){
    int sLargest = secondLargest(a,n);
    int sSmallest = secondSmallest(a,n);
    return new int[] {sLargest,sSmallest};
  }
  
  public static void main(String[] args) {
    int[] arr = {1,2,4,7,7};
    int n = 5;
    int[] a = getSecondLargestElements(n, arr);

    System.out.println("Second Largest Element " + a[0]);
    System.out.println("Second Smallest Element " + a[1]);
    
   
  }
}
