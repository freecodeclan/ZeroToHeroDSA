/*  
Problem statement

You have been given an array ‘a’ of ‘n’ non-negative integers.You have to check whether the given array is sorted in the non-decreasing order or not.

Your task is to return 1 if the given array is sorted. Else, return 0.

Example :
Input: ‘n’ = 5, ‘a’ = [1, 2, 3, 4, 5]
Output: 1

The given array is sorted in non-decreasing order; hence the answer will be 1.

codingNinja -- https://www.codingninjas.com/studio/problems/ninja-and-the-sorted-check_6581957?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf

Note --- For the brute force approach we will be running two loops comparing if a[i] < a[j] return true; 

 */

package Arrays;

import java.util.Arrays;

public class checkSortedArray {

  static int isSorted(int[] arr){
    for (int i=1; i < arr.length; i++){
      if (arr[i] < arr[i-1]){
        return 0;
      }
    }
    return 1;
  }

  public static void main(String[] args) {
    int[] a = {5,3,6,8};
    int sorted = isSorted(a);
    System.out.println(Arrays.toString(a));
    System.out.println("This not sorted " + sorted);

    System.out.println();

    int[] b = {2,3,4,5};
    sorted = isSorted(b);
    System.out.println(Arrays.toString(b));
    System.out.println("This is sorted " + sorted);
  }
}
