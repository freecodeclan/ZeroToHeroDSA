/* Shuffle the Array

Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].

Return the array in the form [x1,y1,x2,y2,...,xn,yn].

Example 1:

Input: nums = [2,5,1,3,4,7], n = 3
Output: [2,3,5,4,1,7] 
Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].

leetcode (1470) ---> https://leetcode.com/problems/shuffle-the-array/description/


 */
package Arrays.ArrayList;

public class shufflerray {

  static int[] shuffle(int[] nums, int n){
    int[] arr = new int[2*n];
    int count = 0;  //--- This line initializes a counter variable to 0. This counter will be used to keep track of where to place numbers in the new array

    for (int i=0; i<n; i++){
      arr[count] = nums[i]; //-- This line takes the `i`th element from the first half of the input array and places it in the new array at the position indicated by the counter.
      arr[count+1] = nums[i+n]; //-- This line takes the `i`th element from the second half of the input array and places it in the new array at the position next to the one just filled.
      count += 2;
    }
    return arr;
  }
  public static void main(String[] args) {
    int n = 3;
    int[] nums = {2,5,1,3,4,7};
    int[] ans = shuffle(nums, n);

    for (int i : ans) {
      System.out.print(i + " ");
    }
  }
}

/* In this question we are using formula nums[i+n] --->  nums[0(indexVal) + 3] */
