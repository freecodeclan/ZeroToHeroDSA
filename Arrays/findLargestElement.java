/*  

Problem statement
Given an array ‘arr’ of size ‘n’ find the largest element in the array.

Example:
Input: 'n' = 5, 'arr' = [1, 2, 3, 4, 5]
Output: 5
Explanation: From the array {1, 2, 3, 4, 5}, the largest element is 5.

CodingNinja -- https://www.codingninjas.com/studio/problems/largest-element-in-the-array-largest-element-in-the-array_5026279?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf

 */
package Arrays;

public class findLargestElement {

  static int largestElement(int[] arr){
    int max = arr[0];
    for (int i=0; i < arr.length; i++){
      if (arr[i] > max) max = arr[i];
    }
    return max; 

  }

  public static void main(String[] args) {
    int[] arr = {10,5,15,11,55};

    int maxValue = largestElement(arr);
    System.out.println("The largest element in given array is : " + maxValue);
    
  }
}
