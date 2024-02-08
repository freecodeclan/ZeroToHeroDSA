/*  Concatenation of Array

Given an integer array nums of length n, you want to create an array ans of length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).

Specifically, ans is the concatenation of two nums arrays.

Return the array ans.

Example 1:

Input: nums = [1,2,1]
Output: [1,2,1,1,2,1]
Explanation: The array ans is formed as follows:
- ans = [nums[0],nums[1],nums[2],nums[0],nums[1],nums[2]]
- ans = [1,2,1,1,2,1]

leetcode (1929)--> https://leetcode.com/problems/concatenation-of-array/


 */
package Arrays;

public class concatenationArray {

  static int[] getConcatenation(int[] arr){
    int n = arr.length;
    int[] ans = new int[2*n]; // Initialize the answer array with size 2n

    for (int i=0; i<n; i++){
      ans[i] = arr[i];  // Copy the first half of nums to ans
      ans[i + n] = arr[i];  // Copy the second half of nums to ans
    }
    return ans;
  }
  public static void main(String[] args) {
    int[] nums = {1,2,1};
    int[] ans = getConcatenation(nums);

    for (int i : ans) {
      System.out.print(i + " ");
    }
  }
}
