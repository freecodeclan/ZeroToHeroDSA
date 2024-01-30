/*  

 Remove Duplicates from Sorted Array

You are given a sorted integer array 'arr' of size 'n'.

You need to remove the duplicates from the array such that each element appears only once.

Return the length of this new array.

Note:
Do not allocate extra space for another array. You need to do this by modifying the given input array in place with O(1) extra memory. 

For example:
'n' = 5, 'arr' = [1 2 2 2 3].
The new array will be [1 2 3].
So our answer is 3.

codingNinja --- https://www.codingninjas.com/studio/problems/remove-duplicates-from-sorted-array_1102307?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf

Note -- For the brute force we can use set because set only stores unique values but for Optimized Solution we will be using two pointer approach 
 */
package Arrays;

public class removeDuplicates {

  static int duplicates(int[] arr){
    int i = 0; 
    for (int j=1; j < arr.length; j++){
      if (arr[j] != arr[i]){
        arr[i+1] = arr[j];
        i++;
      }
    }
    return i+1;
  }
  public static void main(String[] args) {
    
    int[] arr = {1,2,2,3,3,4,5};
    int lengthOfArray = duplicates(arr);
    System.out.println(lengthOfArray);
  }
}
